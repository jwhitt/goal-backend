package com.edwardjones.codefest.goalbackend

import com.edwardjones.codefest.goalbackend.model.CalcOutput
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
class GoalBackendController {

    @PostMapping("/calc")
    fun calculateGoalProjection() : Mono<CalcOutput> {
        // TODO call Scott's code here

        var result = CalcOutput(null,null)
        return Mono.just(result)
    }
}