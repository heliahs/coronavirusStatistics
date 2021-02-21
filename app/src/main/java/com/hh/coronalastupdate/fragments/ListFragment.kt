package com.hh.coronalastupdate.fragments


import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast


import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer

import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager


import com.hh.coronalastupdate.viewmodels.ListViewModel
import com.hh.coronalastupdate.R
import com.hh.coronalastupdate.adapters.MyAdapterDataListener
import com.hh.coronalastupdate.adapters.MyListAdapter
import com.hh.coronalastupdate.databinding.ListFragmetLayoutBinding


class ListFragment : Fragment() {
private lateinit var binding : ListFragmetLayoutBinding



private val viewModel : ListViewModel by lazy {

    val activity = requireNotNull(this.activity) {

    }
    ViewModelProvider(this).get(ListViewModel(activity!!.application)::class.java)
}


    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

binding = ListFragmetLayoutBinding.inflate(inflater)
        val adapter = MyListAdapter(MyAdapterDataListener { country ->
            viewModel.displayDetails(country)
        })



        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager= LinearLayoutManager(activity)




        viewModel.status.observe(viewLifecycleOwner, Observer {
            when (it) {
                ListViewModel.ApiStatus.LOADING -> {
                    binding.mainContainer.visibility=View.GONE
                    binding.statusImage.visibility=View.VISIBLE
                    binding.statusImage.setImageResource(R.drawable.loading_animation)
                }
                ListViewModel.ApiStatus.ERROR -> {
                    binding.statusImage.visibility = View.VISIBLE
                    binding.mainContainer.visibility=View.GONE
                    binding.statusImage.setImageResource(R.drawable.ic_connection_error)
                    Toast.makeText(context,"something went wrong! please try again.",Toast.LENGTH_SHORT).show()

                }
                ListViewModel.ApiStatus.TOAST_ERROR -> {
                    binding.statusImage.visibility = View.GONE
                    binding.mainContainer.visibility=View.VISIBLE
                    Toast.makeText(context,"Server Error",Toast.LENGTH_SHORT).show()

                }
                ListViewModel.ApiStatus.DONE -> {
                    binding.statusImage.visibility = View.GONE
                    binding.mainContainer.visibility=View.VISIBLE
                }
            }
        })

        viewModel.navigateToSelectedCountry.observe(viewLifecycleOwner, Observer {
            if ( null != it ) {
             this.findNavController().navigate(ListFragmentDirections.actionListFragmentToDetailFragment(it))
                viewModel.displayDetailsComplete()
            }

        })

        viewModel.countryList.observe(viewLifecycleOwner, Observer {
            it?.apply {
                adapter.submitList(it)
            }

        })

viewModel.global.observe(viewLifecycleOwner, Observer {
    it?.let {
        binding.totalCases.text= resources.getString(R.string.TotalConfirmed)+it.TotalConfirmed.toString()
        binding.totalDeaths.text=resources.getString(R.string.TotalDeaths)+it.TotalDeaths.toString()
        binding.totalReooverd.text=resources.getString(R.string.TotalRecovered)+it.TotalRecovered.toString()
    }

})
        binding.swiperefresh.setOnRefreshListener {

           viewModel.refreshDataFromRepository()
            binding.swiperefresh.isRefreshing = false
        }

        return binding.root
    }


}