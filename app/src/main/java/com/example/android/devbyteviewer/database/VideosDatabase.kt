package com.example.android.devbyteviewer.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [DatabaseVideo::class], version = 1)
abstract class VideosDatabase : RoomDatabase() {
    abstract val videoDao: VideoDao
}