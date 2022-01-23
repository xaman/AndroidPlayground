package com.martinchamarro.android.playground.spacex.data.mapper

import com.martinchamarro.android.playground.spacex.data.model.CompanyModel
import com.martinchamarro.android.playground.spacex.domain.model.Company
import javax.inject.Inject

class CompanyMapper @Inject constructor() {

    fun map(model: CompanyModel): Company {
        return Company(
            name = model.name ?: "",
            summary = model.summary ?: "",
            founded = model.founded ?: 0,
            founder = model.founder ?: "",
            employees = model.employees ?: 0,
            valuation = model.valuation ?: 0L
        )
    }

}
