package com.martinchamarro.android.playground.spacex.domain.model

data class Launch(
    val id: String,
    val rocket: String,
    val name: String,
    val details: String,
    val success: Boolean,
    val dateUtc: String,
)
