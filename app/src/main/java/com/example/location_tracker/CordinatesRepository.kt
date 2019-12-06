package com.example.location_tracker

import androidx.lifecycle.LiveData

// Declares the DAO as a private property in the constructor. Pass in the DAO
// instead of the whole database, because you only need access to the DAO
class CordinatesRepository(private val cordinatesDao: CordinatesDao) {

    // Room executes all queries on a separate thread.
    // Observed LiveData will notify the observer when the data has changed.
    val allCordinates: LiveData<List<Cordinates>> = cordinatesDao.getCordinates()

    suspend fun insert(cordinates: Cordinates) {
        cordinatesDao.insert(cordinates)
    }
}