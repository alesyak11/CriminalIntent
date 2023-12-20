package com.sample.criminalintent

import java.util.Date
import java.util.UUID

class Crime {
    data class CrimeDetails(
        val id: UUID = UUID.randomUUID(),
        var title: String = "",
        var date: Date = Date(),
        var isSolved: Boolean = false
    )
}