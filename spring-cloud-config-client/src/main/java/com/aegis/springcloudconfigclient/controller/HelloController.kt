package com.aegis.springcloudconfigclient.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
internal class HelloController {
  @Value("\${neo.hello}")
  private val hello: String? = null

  @RequestMapping("/hello")
  fun from(): String? {
    return this.hello
  }
}