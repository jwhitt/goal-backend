package com.edwardjones.codefest.goalbackend

import com.edwardjones.codefest.goalbackend.model.GoalResult
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
class GoalBackendController {

    @PostMapping("/calc")
    fun calculateGoalProjection() : Mono<GoalResult> {
        var result = GoalResult(HashMap<String,Double>(), HashMap<String,Double>());
        return Mono.just(result)
    }
}