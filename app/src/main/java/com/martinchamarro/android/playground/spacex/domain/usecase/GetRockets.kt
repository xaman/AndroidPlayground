package com.martinchamarro.android.playground.spacex.domain.usecase

import com.martinchamarro.android.playground.spacex.domain.model.Rocket
import com.martinchamarro.android.playground.spacex.domain.repository.RocketsRepository
import javax.inject.Inject

class GetRockets @Inject constructor(
    private val rocketsRepository: RocketsRepository
){

    suspend fun execute(): List<Rocket> = rocketsRepository.getRockets()

}
