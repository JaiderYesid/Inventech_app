package com.inventech.Inventech

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan("com.inventech.Inventech")
@EntityScan("com.inventech.Inventech")
class InventechApplication

fun main(args: Array<String>) {
	runApplication<InventechApplication>(*args)
}
