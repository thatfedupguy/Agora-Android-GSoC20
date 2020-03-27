package com.example.agoraandroidgsoc20.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.agoraandroidgsoc20.data.db.entities.User

@Database(
    entities = [User::class],
    version = 2,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun getUserDao(): UserDao

    companion object {
        @Volatile
        private var instance: AppDatabase? = null
        private var LOCK = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {

            instance ?: builDatabase(context).also {
                instance = it
            }

        }
        private fun builDatabase(context: Context): AppDatabase {
            return Room.databaseBuilder(
                context,
                AppDatabase::class.java,
                "MyDatabase.db"
            ).fallbackToDestructiveMigration()
                .build()
        }

    }
}