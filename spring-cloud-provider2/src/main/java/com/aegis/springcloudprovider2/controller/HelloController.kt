package com.aegis.springcloudprovider2.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

  @RequestMapping("/hello")
  fun index(@RequestParam name: String): String {
    return "hello $name，this is producer 2  send first messge"
  }
}