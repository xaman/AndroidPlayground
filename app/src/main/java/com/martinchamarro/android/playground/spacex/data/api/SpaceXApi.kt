package com.martinchamarro.android.playground.spacex.data.api

import com.martinchamarro.android.playground.spacex.data.model.CompanyModel
import com.martinchamarro.android.playground.spacex.data.model.LaunchModel
import com.martinchamarro.android.playground.spacex.data.model.RocketModel
import javax.inject.Inject

class SpaceXApi @Inject constructor(
    private val service: SpaceXService
) {

    suspend fun getCompany(): CompanyModel = service.getCompany()

    suspend fun getLaunches(): List<LaunchModel> = service.getLaunches()

    suspend fun getRockets(): List<RocketModel> = service.getRockets()

}
