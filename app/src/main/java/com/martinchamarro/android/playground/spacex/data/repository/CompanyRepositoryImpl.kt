package com.martinchamarro.android.playground.spacex.data.repository

import com.martinchamarro.android.playground.spacex.data.api.SpaceXApi
import com.martinchamarro.android.playground.spacex.data.mapper.CompanyMapper
import com.martinchamarro.android.playground.spacex.domain.model.Company
import com.martinchamarro.android.playground.spacex.domain.repository.CompanyRepository
import javax.inject.Inject

class CompanyRepositoryImpl @Inject constructor(
    private val api: SpaceXApi,
    private val mapper: CompanyMapper
) : CompanyRepository {

    override suspend fun getCompany(): Company {
        return api.getCompany().let {
            mapper.map(it)
        }
    }

}
