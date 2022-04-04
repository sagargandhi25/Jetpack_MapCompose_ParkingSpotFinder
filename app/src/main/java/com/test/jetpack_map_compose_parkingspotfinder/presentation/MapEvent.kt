package com.test.jetpack_map_compose_parkingspotfinder.presentation

import com.google.android.gms.maps.model.LatLng
import com.test.jetpack_map_compose_parkingspotfinder.domain.model.ParkingSpot

sealed class MapEvent {
    object ToggleFalloutMap: MapEvent()
    data class OnMapLongClick(val latLng: LatLng): MapEvent()
    data class OnInfoWindowLongClick(val spot: ParkingSpot): MapEvent()
}