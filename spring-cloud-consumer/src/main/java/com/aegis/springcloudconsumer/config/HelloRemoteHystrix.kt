package com.aegis.springcloudconsumer.config

import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.RequestParam


@Component
class HelloRemoteHystrix : HelloRemote {

  override fun hello(@RequestParam(value = "name") name: String): String {
    return "hello$name, this messge send failed "
  }
}