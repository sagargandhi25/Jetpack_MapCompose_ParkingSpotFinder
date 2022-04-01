package com.test.jetpack_map_compose_parkingspotfinder.domain.model

data class ParkingSpot(
    val lat: Double,
    val lng: Double,
    val id: Int? = null
)
