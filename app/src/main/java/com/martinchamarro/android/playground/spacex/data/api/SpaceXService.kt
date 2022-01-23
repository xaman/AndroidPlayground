package com.martinchamarro.android.playground.spacex.data.api

import com.martinchamarro.android.playground.spacex.data.model.CompanyModel
import com.martinchamarro.android.playground.spacex.data.model.LaunchModel
import com.martinchamarro.android.playground.spacex.data.model.RocketModel
import retrofit2.http.GET


interface SpaceXService {

    @GET("company")
    suspend fun getCompany(): CompanyModel

    @GET("launches")
    suspend fun getLaunches(): List<LaunchModel>

    @GET("rockets")
    suspend fun getRockets(): List<RocketModel>

}
