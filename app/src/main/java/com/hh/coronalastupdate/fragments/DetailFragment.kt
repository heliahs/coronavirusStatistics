package com.hh.coronalastupdate.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.github.mikephil.charting.charts.PieChart
import com.github.mikephil.charting.components.Description
import com.github.mikephil.charting.components.Legend
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.data.PieEntry
import com.hh.coronalastupdate.R
import com.hh.coronalastupdate.classes.CountryData
import com.hh.coronalastupdate.databinding.FragmentDetailLayoutBinding
import com.hh.coronalastupdate.databinding.ListFragmetLayoutBinding
import com.hh.coronalastupdate.models.Country
import com.hh.coronalastupdate.viewmodels.DetailViewModel
import com.hh.coronalastupdate.viewmodels.DetailViewModelFactory


class DetailFragment : Fragment() {

    private lateinit var binding : FragmentDetailLayoutBinding
    private lateinit var   yData : FloatArray
    private val xData = arrayOf("Deaths", "Recovered", "Active")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

         binding = FragmentDetailLayoutBinding.inflate(inflater)
        binding.lifecycleOwner = this
        val application = requireNotNull(activity).application
        val country = DetailFragmentArgs.fromBundle(requireArguments()).country



        val viewModelFactory = DetailViewModelFactory(country, application)
        binding.viewModel = ViewModelProvider(
            this, viewModelFactory
        ).get(DetailViewModel::class.java)

         yData = floatArrayOf(
            country.TotalDeaths.toFloat(), country.TotalRecovered.toFloat(), ActiveCases(
                country
            ).toFloat()
        )

       binding.countryName.text =country.Country
        binding.countryFlag.setImageResource(CountryData().getFlagMasterResID(country.CountryCode))



        binding.chart1.also {
        initChart(it)

            }

        return binding.root
    }

    private fun initChart(pieChart: PieChart) {
        val description: Description = pieChart.getDescription()
        description.text=" "

        pieChart.isRotationEnabled = true

        pieChart.holeRadius = 30f
        pieChart.setTransparentCircleAlpha(0)


        val yEntrys: ArrayList<PieEntry> = ArrayList()

        val xEntrys: ArrayList<String> = ArrayList()


        for (i in 0 until yData.size) {
            yEntrys.add(PieEntry(yData[i], xData[i]))
        }


        for (i in 0 until xData.size) {
            xEntrys.add(xData[i])

        }


        val pieDataSet = PieDataSet(yEntrys, "")
        pieDataSet.setDrawValues(false)
        pieDataSet.sliceSpace = 2f
        pieDataSet.valueTextSize = 8f

        val colors: ArrayList<Int> = ArrayList()
        colors.add(ContextCompat.getColor(requireContext(), R.color.red))
        colors.add(ContextCompat.getColor(requireContext(), R.color.green))
        colors.add(ContextCompat.getColor(requireContext(), R.color.yellow))


        pieDataSet.colors = colors
        pieChart.setDrawSliceText(false);


        val legend: Legend = pieChart.legend
        legend.form = Legend.LegendForm.CIRCLE


        legend.verticalAlignment = Legend.LegendVerticalAlignment.BOTTOM
        legend.horizontalAlignment = Legend.LegendHorizontalAlignment.CENTER
        legend.orientation = Legend.LegendOrientation.HORIZONTAL





        val pieData = PieData(pieDataSet)
        pieChart.animateY(1000)
        pieChart.data = pieData
        pieChart.invalidate()

    }


    private fun addData() {

    }



    fun ActiveCases(country: Country): Long{
      return  country.TotalConfirmed - (country.TotalDeaths + country.TotalRecovered)
    }
}