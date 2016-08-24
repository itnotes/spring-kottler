package io.github.itnotes.controllers

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class HelloController {
    @RequestMapping("/hello")
    fun hello(): ResponseEntity<String> {
        logger.debug("HelloController#hello executed")
        return ResponseEntity<String>("Hello", HttpStatus.OK)
    }

    companion object {
        val logger: Logger = LoggerFactory.getLogger(HelloController::class.java)
    }
}