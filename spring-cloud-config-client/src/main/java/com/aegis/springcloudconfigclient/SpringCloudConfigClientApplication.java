package com.aegis.springcloudconfigclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableConfigServer
public class SpringCloudConfigClientApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringCloudConfigClientApplication.class, args);
  }
}
