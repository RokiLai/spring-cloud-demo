package com.aegis.springcloudconsumer2.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name= "spring-cloud-producer",fallback = HelloRemoteHystrix.class)
public interface HelloRemote {
  @RequestMapping(value = "/hello")
  public String hello2(@RequestParam(value = "name") String name);
}