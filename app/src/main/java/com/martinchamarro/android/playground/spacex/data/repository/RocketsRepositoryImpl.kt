package com.martinchamarro.android.playground.spacex.data.repository

import com.martinchamarro.android.playground.spacex.data.api.SpaceXApi
import com.martinchamarro.android.playground.spacex.data.mapper.RocketMapper
import com.martinchamarro.android.playground.spacex.domain.model.Rocket
import com.martinchamarro.android.playground.spacex.domain.repository.RocketsRepository
import javax.inject.Inject

class RocketsRepositoryImpl @Inject constructor(
    private val api: SpaceXApi,
    private val mapper: RocketMapper
): RocketsRepository {

    override suspend fun getRockets(): List<Rocket> {
        return api.getRockets().map {
            mapper.map(it)
        }
    }

}
