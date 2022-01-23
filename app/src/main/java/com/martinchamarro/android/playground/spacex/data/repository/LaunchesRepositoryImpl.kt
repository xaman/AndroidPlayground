package com.martinchamarro.android.playground.spacex.data.repository

import com.martinchamarro.android.playground.spacex.data.api.SpaceXApi
import com.martinchamarro.android.playground.spacex.data.mapper.LaunchMapper
import com.martinchamarro.android.playground.spacex.domain.model.Launch
import com.martinchamarro.android.playground.spacex.domain.repository.LaunchesRepository
import javax.inject.Inject

class LaunchesRepositoryImpl @Inject constructor(
    private val api: SpaceXApi,
    private val mapper: LaunchMapper
): LaunchesRepository {

    override suspend fun getLaunches(): List<Launch> {
        return api.getLaunches().map {
            mapper.map(it)
        }
    }

}
