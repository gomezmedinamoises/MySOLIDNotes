package com.mgomezm.mysolidnotes.framework.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [NoteEntity::class], version = 1)
abstract class DatabaseService : RoomDatabase() {

    companion object {

        private const val DATABASE_NAME = "note.database"

        private var instance: DatabaseService? = null

        private fun create(context: Context): DatabaseService =
            Room.databaseBuilder(context, DatabaseService::class.java, DATABASE_NAME)
                .fallbackToDestructiveMigration()
                .build()

        /**
         * getInstance allow DatabaseService to be a Singleton.
         * Singleton is a design pattern where we have only an object instance at time
         */
        fun getInstance(context: Context): DatabaseService = (instance ?: create(context)).also { instance = it }
    }

    abstract fun noteDao(): NoteDao
}