package com.sample.criminalintent

import android.content.Context
import com.sample.criminalintent.database.CrimeDatabase

class CrimeRepository private
constructor(context: Context) {
    private val database : CrimeDatabase =
        Room.databaseBuilder(
            context.applicationContext,
            CrimeDatabase::class.java, DATABASE_NAME
        ).build()
    private val crimeDao = database.crimeDao()
    companion object {
        private var INSTANCE: CrimeRepository? =
            null
        fun initialize(context: Context) {
            if (INSTANCE == null) {
                INSTANCE = CrimeRepository(context)
            }
        }
        fun get(): CrimeRepository {
            return INSTANCE ?:
            throw
            IllegalStateException("CrimeRepository must be initialized")
        }
    }
}
