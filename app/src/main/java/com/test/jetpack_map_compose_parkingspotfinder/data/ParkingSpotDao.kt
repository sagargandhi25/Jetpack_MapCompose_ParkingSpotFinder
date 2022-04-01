package com.test.jetpack_map_compose_parkingspotfinder.data

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface ParkingSpotDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertParkingSPot(spot: ParkingSpotEntity)

    @Delete
    suspend fun deleteParkingSpot(spot:ParkingSpotEntity)

    @Query("SELECT * FROM parkingspotentity")
    fun getParkingSpots(): Flow<List<ParkingSpotEntity>>
}