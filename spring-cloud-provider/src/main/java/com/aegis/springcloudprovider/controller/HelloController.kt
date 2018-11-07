package com.aegis.springcloudprovider.controller

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RequestMapping



@RestController()
class HelloController {

  @RequestMapping("/hello")
  fun index(@RequestParam name: String): String {
    return "hello $name，this is first messge"
  }

}