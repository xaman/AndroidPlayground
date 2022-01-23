package com.martinchamarro.android.playground.spacex.domain.repository

import com.martinchamarro.android.playground.spacex.domain.model.Rocket

interface RocketsRepository {

    suspend fun getRockets(): List<Rocket>

}
