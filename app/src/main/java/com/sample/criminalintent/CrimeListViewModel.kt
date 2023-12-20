package com.sample.criminalintent

import android.util.Log
import androidx.lifecycle.ViewModel

private const val TAG = "CrimeListViewModel"
class CrimeListViewModel: ViewModel() {
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