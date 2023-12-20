package com.sample.criminalintent.database

@Database(entities = [ Crime::class ], version=1)
@TypeConverters(CrimeTypeConverters::class)

abstract class CrimeDatabase : RoomDatabase() {
    abstract fun crimeDao(): CrimeDao
}