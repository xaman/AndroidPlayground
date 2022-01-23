package com.martinchamarro.android.playground.spacex.domain.usecase

import com.martinchamarro.android.playground.spacex.domain.model.Company
import com.martinchamarro.android.playground.spacex.domain.repository.CompanyRepository
import javax.inject.Inject

class GetCompany @Inject constructor(
    private val companyRepository: CompanyRepository
){

    suspend fun execute(): Company = companyRepository.getCompany()

}
