package com.martinchamarro.android.playground.spacex.data.model

import com.google.gson.annotations.SerializedName

/**
 * {
"height": {},
"diameter": {},
"mass": {},
"first_stage": {},
"second_stage": {},
"engines": {},
"landing_legs": {},
"payload_weights": [],
"flickr_images": [],
"name": "Falcon 1",
"type": "rocket",
"active": false,
"stages": 2,
"boosters": 0,
"cost_per_launch": 6700000,
"success_rate_pct": 40,
"first_flight": "2006-03-24",
"country": "Republic of the Marshall Islands",
"company": "SpaceX",
"wikipedia": "https://en.wikipedia.org/wiki/Falcon_1",
"description": "The Falcon 1 was an expendable launch system privately developed and manufactured by SpaceX during 2006-2009. On 28 September 2008, Falcon 1 became the first privately-developed liquid-fuel launch vehicle to go into orbit around the Earth.",
"id": "5e9d0d95eda69955f709d1eb"
},
 */
data class RocketModel(
    @SerializedName("id") val id: String?,
    @SerializedName("name") val name: String?,
    @SerializedName("description") val description: String?,
    @SerializedName("type") val type: String?,
    @SerializedName("company") val company: String?,
)
