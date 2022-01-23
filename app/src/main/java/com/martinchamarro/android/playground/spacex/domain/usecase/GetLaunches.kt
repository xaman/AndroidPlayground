package com.martinchamarro.android.playground.spacex.domain.usecase

import com.martinchamarro.android.playground.spacex.domain.model.Launch
import com.martinchamarro.android.playground.spacex.domain.repository.LaunchesRepository
import javax.inject.Inject

class GetLaunches @Inject constructor(
    private val launchesRepository: LaunchesRepository
){

    suspend fun execute(): List<Launch> = launchesRepository.getLaunches()

}
