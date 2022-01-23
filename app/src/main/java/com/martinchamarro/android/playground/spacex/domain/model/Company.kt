package com.martinchamarro.android.playground.spacex.domain.model

data class Company(
    val name: String,
    val summary: String,
    val founder: String,
    val founded: Int,
    val employees: Int,
    val valuation: Long,
)
