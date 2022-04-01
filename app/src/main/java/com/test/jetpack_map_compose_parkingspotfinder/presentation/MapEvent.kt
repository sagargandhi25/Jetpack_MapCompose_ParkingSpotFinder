package com.test.jetpack_map_compose_parkingspotfinder.presentation

sealed class MapEvent {
    object ToggleFalloutMap: MapEvent()
}