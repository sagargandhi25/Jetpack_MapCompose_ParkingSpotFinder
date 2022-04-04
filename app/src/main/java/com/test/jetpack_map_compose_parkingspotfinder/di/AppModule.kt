package com.test.jetpack_map_compose_parkingspotfinder.di

import android.app.Application
import androidx.room.Room
import com.test.jetpack_map_compose_parkingspotfinder.data.ParkingSpotDatabase
import com.test.jetpack_map_compose_parkingspotfinder.data.ParkingSpotRepsotoryImpl
import com.test.jetpack_map_compose_parkingspotfinder.repository.ParkingSpotRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideParkingSpotDatabase(app: Application): ParkingSpotDatabase {
        return Room.databaseBuilder(
            app,
            ParkingSpotDatabase::class.java,
            "parkingspot.db"
        ).build()
    }

    @Singleton
    @Provides
    fun provideParkingSpotRepository(db: ParkingSpotDatabase): ParkingSpotRepository {
        return ParkingSpotRepsotoryImpl(db.dao)
    }
}