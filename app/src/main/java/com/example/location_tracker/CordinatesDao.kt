package com.example.location_tracker

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface CordinatesDao {

    @Query("SELECT * from cordinates_table ")
    fun getCordinates(): LiveData<List<Cordinates>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(cordinates: Cordinates)
}