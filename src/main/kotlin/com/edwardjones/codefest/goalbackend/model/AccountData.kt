package com.edwardjones.codefest.goalbackend.model

data class AccountData(val clientName: String, val balances: HashMap<String,Double>, val goals: HashMap<String, Double>) {
}