package com.baconsausagespaghetti.mylovelygirlfriend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity
import org.springframework.web.reactive.config.EnableWebFlux

@EnableWebFlux
@SpringBootApplication
@EnableWebFluxSecurity
class MyLovelyGirlfriendApplication

fun main(args: Array<String>) {
    runApplication<MyLovelyGirlfriendApplication>(*args)
}
