package com.edwardjones.codefest.goalbackend

import com.edwardjones.codefest.goalbackend.model.CalcInput
import com.edwardjones.financialassessment.calculators.contributionanalyzer.ContributionAnalysisSummary
import com.edwardjones.financialassessment.calculators.contributionanalyzer.ContributionAnalzyer

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
class GoalBackendController {


    @PostMapping("/calc")
    fun calculateGoalProjection(@RequestBody input : CalcInput) : Mono<ContributionAnalysisSummary> {
        var result = ContributionAnalzyer().analyzeContributionAmt(input.amount.toDouble())
        return Mono.just(result)
    }
}