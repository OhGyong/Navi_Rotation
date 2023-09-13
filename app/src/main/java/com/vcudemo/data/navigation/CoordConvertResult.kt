package com.vcudemo.data.navigation

data class CoordZipResult (
    val success: CoordZipData? = null,
    val failure: Exception? = null
)

data class CoordZipData (
    var startLatitude: String?,
    var startLongitude: String?,
    var destinationLatitude: String?,
    var destinationLongitude: String?
)