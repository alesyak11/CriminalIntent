package com.sample.criminalintent

import android.util.Log

private const val TAG = "CrimeListViewModel"
class CrimeListViewModel {
    val crimes: MutableList<Crime.CrimeDetails> = mutableListOf()

    init {
        for (i in 0 until 100) {
            val crime = Crime.CrimeDetails()
            crime.title = "Crime #$i"
            crime.isSolved = i % 2 == 0
            crimes += crime
        }
    }
}