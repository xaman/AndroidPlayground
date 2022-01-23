package com.martinchamarro.android.playground.spacex.domain.repository

import com.martinchamarro.android.playground.spacex.domain.model.Company

interface CompanyRepository {

    suspend fun getCompany(): Company

}
