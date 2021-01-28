package com.example.home_task_l16.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.home_task_l16.Model.CountryInfo
import com.example.home_task_l16.R
import kotlinx.android.synthetic.main.fragment_empty.*

class CountryFragment : Fragment() {

    private var name: String? = null
    private var population: String? = null
    private var area : String? = null
    private var density: String? = null

    private val NAME_EXTRA = "NAME_PARAM"
    private val POPULATION_EXTRA = "POPULATION_PARAM"
    private val AREA_EXTRA = "AREA_PARAM"
    private val DENSITY_EXTRA = "DENSITY_PARAM"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            name = it.getString(NAME_EXTRA)
            population = it.getString(POPULATION_EXTRA)
            area = it.getString(AREA_EXTRA)
            density = it.getString(DENSITY_EXTRA)
        }
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_empty, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        arguments?.let {
            val nameOfCountry = it.getString(NAME_EXTRA)
            val populationOfCountry = "Population : ${it.getString(POPULATION_EXTRA)}"
            val areaOfCountry = "Area: ${it.getString(AREA_EXTRA)}"
            val densityOfCountry = "Density: ${it.getString(DENSITY_EXTRA)}"
            tvNameOfCountry.text = nameOfCountry
            tvPopulation.text = populationOfCountry
            tvArea.text = areaOfCountry
            tvDensity.text = densityOfCountry
        }
    }

    companion object {
        fun newInstance(country: CountryInfo) =
                CountryFragment().apply {
                    arguments = Bundle().apply {
                        putString(NAME_EXTRA, country.name)
                        putString(POPULATION_EXTRA, country.population.toString())
                        putString(AREA_EXTRA, country.area.toString())
                        putString(DENSITY_EXTRA, country.density.toString())
                    }
                }
    }
}