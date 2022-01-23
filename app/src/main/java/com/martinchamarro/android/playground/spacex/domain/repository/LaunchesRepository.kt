package com.martinchamarro.android.playground.spacex.domain.repository

import com.martinchamarro.android.playground.spacex.domain.model.Launch

interface LaunchesRepository {

    suspend fun getLaunches(): List<Launch>

}
