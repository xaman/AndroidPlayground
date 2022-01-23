package com.martinchamarro.android.playground.spacex.data.di

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.martinchamarro.android.playground.spacex.data.api.SpaceXService
import com.martinchamarro.android.playground.spacex.data.repository.CompanyRepositoryImpl
import com.martinchamarro.android.playground.spacex.data.repository.LaunchesRepositoryImpl
import com.martinchamarro.android.playground.spacex.data.repository.RocketsRepositoryImpl
import com.martinchamarro.android.playground.spacex.domain.repository.CompanyRepository
import com.martinchamarro.android.playground.spacex.domain.repository.LaunchesRepository
import com.martinchamarro.android.playground.spacex.domain.repository.RocketsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
class DataModule {

    companion object {
        private const val BASE_URL = "https://api.spacexdata.com/v4/"
    }

    @Provides
    fun retrofitClient(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .build()
    }

    @Provides
    fun service(retrofit: Retrofit): SpaceXService {
        return retrofit.create(SpaceXService::class.java)
    }

    @Provides
    fun companyRepository(impl: CompanyRepositoryImpl): CompanyRepository = impl

    @Provides
    fun rocketRepository(impl: RocketsRepositoryImpl): RocketsRepository = impl

    @Provides
    fun launchesRepository(impl: LaunchesRepositoryImpl): LaunchesRepository = impl

}
