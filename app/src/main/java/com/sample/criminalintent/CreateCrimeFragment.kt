package com.sample.criminalintent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
class CreateCrimeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val newCrime = Crime()

        CrimeRepository.get().addCrime(newCrime)

        val crimeFragment = CrimeFragment.newInstance(newCrime.id)
        parentFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, crimeFragment)
            .addToBackStack(null)
            .commit()

        return null
    }
}