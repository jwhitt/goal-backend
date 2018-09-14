package com.edwardjones.codefest.goalbackend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GoalBackendApplication

fun main(args: Array<String>) {
    runApplication<GoalBackendApplication>(*args)
}
