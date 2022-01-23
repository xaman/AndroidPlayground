package com.martinchamarro.android.playground.spacex.data.mapper

import com.martinchamarro.android.playground.spacex.data.model.RocketModel
import com.martinchamarro.android.playground.spacex.domain.model.Rocket
import javax.inject.Inject

class RocketMapper @Inject constructor() {

    fun map(model: RocketModel): Rocket {
        return Rocket(
            id = model.id ?: "",
            name = model.name ?: "",
            description = model.description ?: "",
            type = model.type ?: "",
            company = model.company ?: "",
        )
    }

}
