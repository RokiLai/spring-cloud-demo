package com.aegis.springcloudconsumer2.config

import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.RequestParam


@Component
class HelloRemoteHystrix : HelloRemote {

  override fun hello2(@RequestParam(value = "name") name: String): String {
    return "hello$name, this messge send failed "
  }
}