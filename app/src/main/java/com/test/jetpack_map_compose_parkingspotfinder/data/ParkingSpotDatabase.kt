package com.test.jetpack_map_compose_parkingspotfinder.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.test.jetpack_map_compose_parkingspotfinder.domain.model.ParkingSpot

@Database(entities = [ParkingSpotEntity::class], version = 1)
abstract class ParkingSpotDatabase: RoomDatabase() {

    abstract val dao: ParkingSpotDao

}
