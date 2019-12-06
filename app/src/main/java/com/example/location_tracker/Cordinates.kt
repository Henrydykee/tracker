package com.example.location_tracker

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cordinates_table")
class Cordinates (@PrimaryKey @ColumnInfo(name = "cordinates") val lat: Double, val log : Double)