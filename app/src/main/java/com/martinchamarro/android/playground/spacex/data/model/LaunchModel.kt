package com.martinchamarro.android.playground.spacex.data.model

import com.google.gson.annotations.SerializedName

/**
 * {
"fairings": {},
"links": {},
"static_fire_date_utc": "2006-03-17T00:00:00.000Z",
"static_fire_date_unix": 1142553600,
"net": false,
"window": 0,
"rocket": "5e9d0d95eda69955f709d1eb",
"success": false,
"failures": [],
"details": "Engine failure at 33 seconds and loss of vehicle",
"crew": [],
"ships": [],
"capsules": [],
"payloads": [],
"launchpad": "5e9e4502f5090995de566f86",
"flight_number": 1,
"name": "FalconSat",
"date_utc": "2006-03-24T22:30:00.000Z",
"date_unix": 1143239400,
"date_local": "2006-03-25T10:30:00+12:00",
"date_precision": "hour",
"upcoming": false,
"cores": [],
"auto_update": true,
"tbd": false,
"launch_library_id": null,
"id": "5eb87cd9ffd86e000604b32a"
}
 */
data class LaunchModel(
    @SerializedName("id") val id: String?,
    @SerializedName("rocket") val rocket: String?,
    @SerializedName("name") val name: String?,
    @SerializedName("details") val details: String?,
    @SerializedName("success") val success: Boolean?,
    @SerializedName("dateUtc") val dateUtc: String?,
)

