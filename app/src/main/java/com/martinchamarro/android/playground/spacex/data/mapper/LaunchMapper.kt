package com.martinchamarro.android.playground.spacex.data.mapper

import com.martinchamarro.android.playground.spacex.data.model.LaunchModel
import com.martinchamarro.android.playground.spacex.domain.model.Launch
import javax.inject.Inject

class LaunchMapper @Inject constructor() {

    fun map(model: LaunchModel): Launch {
        return Launch(
            id = model.id ?: "",
            rocket = model.rocket ?: "",
            name = model.name ?: "",
            details = model.details ?: "",
            success = model.success ?: false,
            dateUtc = model.dateUtc ?: "",
        )
    }

}
