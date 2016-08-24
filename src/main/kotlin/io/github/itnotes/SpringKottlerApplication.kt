package io.github.itnotes

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class SpringKottlerApplication

fun main(args: Array<String>) {
    SpringApplication.run(SpringKottlerApplication::class.java, *args)
}
