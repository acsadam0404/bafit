package hu.acsadam.bafit.rest

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
class EchoRestController {

  @RequestMapping(Array("/echo"))
  @ResponseBody
  def echo(message: String): String = message

  @RequestMapping(Array("/ping"))
  @ResponseBody
  def ping() = "pong"

}