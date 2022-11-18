package com.dev.ali.clientapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class ClientAppApplication

fun main(args: Array<String>) {
	runApplication<ClientAppApplication>(*args)
}
