package com.martinchamarro.android.playground.spacex.data.model

import com.google.gson.annotations.SerializedName

/**
 *
 * {
"headquarters": {
"address": "Rocket Road",
"city": "Hawthorne",
"state": "California"
},
"links": {
"website": "https://www.spacex.com/",
"flickr": "https://www.flickr.com/photos/spacex/",
"twitter": "https://twitter.com/SpaceX",
"elon_twitter": "https://twitter.com/elonmusk"
},
"name": "SpaceX",
"founder": "Elon Musk",
"founded": 2002,
"employees": 9500,
"vehicles": 4,
"launch_sites": 3,
"test_sites": 3,
"ceo": "Elon Musk",
"cto": "Elon Musk",
"coo": "Gwynne Shotwell",
"cto_propulsion": "Tom Mueller",
"valuation": 74000000000,
"summary": "SpaceX designs, manufactures and launches advanced rockets and spacecraft. The company was founded in 2002 to revolutionize space technology, with the ultimate goal of enabling people to live on other planets.",
"id": "5eb75edc42fea42237d7f3ed"
}
 */

data class CompanyModel(
    @SerializedName("name") val name: String?,
    @SerializedName("summary") val summary: String?,
    @SerializedName("founder") val founder: String?,
    @SerializedName("founded") val founded: Int?,
    @SerializedName("employees") val employees: Int?,
    @SerializedName("valuation") val valuation: Long?,
)
