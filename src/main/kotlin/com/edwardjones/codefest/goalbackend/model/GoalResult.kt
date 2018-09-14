package com.edwardjones.codefest.goalbackend.model

data class GoalResult(val newGoalValues: HashMap<String,Double>, val pctDiff: HashMap<String,Double>) {
}