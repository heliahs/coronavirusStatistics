package com.hh.coronalastupdate.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.fragment.app.Fragment
import com.hh.coronalastupdate.databinding.FragmentDetailLayoutBinding


class DetailFragment : Fragment() {


    private val xData = arrayOf("Deaths", "Recovered", "Active")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
      //  val application = requireNotNull(activity).application
        val binding = FragmentDetailLayoutBinding.inflate(inflater)
        binding.lifecycleOwner = this
        val application = requireNotNull(activity).application
/*        val country = DetailFragmentArgs.fromBundle(requireArguments()).country



        val viewModelFactory = DetailViewModelFactory(country, application)
        binding.viewModel = ViewModelProvider(
            this, viewModelFactory
        ).get(DetailViewModel::class.java)

        val yData = floatArrayOf(
            country.TotalDeaths.toFloat(), country.TotalRecovered.toFloat(), ActiveCases(
                country
            ).toFloat()
        )

       binding.countryName.text =country.Country


        binding.countryFlag.setImageResource(CountryData().getFlagMasterResID(country.CountryCode))*/



     /*   binding.chart1.also {

            val description: Description = it.getDescription()
            description.text="Coronavirous PieChart"
            it.isRotationEnabled = true

            it.holeRadius = 30f
            it.setTransparentCircleAlpha(0)


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
            it.setDrawSliceText(false);


            val legend: Legend = it.legend
           legend.form = Legend.LegendForm.CIRCLE


            legend.verticalAlignment = Legend.LegendVerticalAlignment.BOTTOM
            legend.horizontalAlignment = Legend.LegendHorizontalAlignment.LEFT
            legend.orientation = Legend.LegendOrientation.HORIZONTAL


            it.setOnChartValueSelectedListener(object : OnChartValueSelectedListener {


                override fun onValueSelected(e: Entry?, h: Highlight?) {
                    val string: String = ""

                }

                override fun onNothingSelected() {}
            })


            val pieData = PieData(pieDataSet)
            it.animateY(1000)
            it.data = pieData
            it.invalidate()

            }*/

        return binding.root
    }


    private fun addData() {

    }



    /*fun ActiveCases(country: Country): Long{
      return  country.TotalConfirmed - (country.TotalDeaths + country.TotalRecovered)
    }*/
}