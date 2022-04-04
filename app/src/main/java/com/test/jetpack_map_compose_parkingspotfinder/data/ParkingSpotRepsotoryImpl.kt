package com.test.jetpack_map_compose_parkingspotfinder.data

import com.test.jetpack_map_compose_parkingspotfinder.domain.model.ParkingSpot
import com.test.jetpack_map_compose_parkingspotfinder.repository.ParkingSpotRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class ParkingSpotRepsotoryImpl(
    private val dao: ParkingSpotDao
): ParkingSpotRepository {

    override suspend fun insertParkingSpot(spot: ParkingSpot) {
        dao.insertParkingSPot(spot.toParkingSpotEntity())
    }

    override suspend fun deleteParkingSpot(spot: ParkingSpot) {
        dao.deleteParkingSpot(spot.toParkingSpotEntity())
    }

    override fun getParkingSpots(): Flow<List<ParkingSpot>> {
        return dao.getParkingSpots().map{ spots ->
            spots.map { it.toParkingSpot() }
        }
    }
}