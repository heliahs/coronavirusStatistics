package com.hh.coronalastupdate.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


import androidx.fragment.app.Fragment

import androidx.lifecycle.ViewModelProvider


import com.hh.coronadata.viewmodels.ListViewModel
import com.hh.coronalastupdate.databinding.ListFragmetLayoutBinding


class ListFragment : Fragment() {
private lateinit var binding : ListFragmetLayoutBinding



private val viewModel : ListViewModel by lazy {

    val activity = requireNotNull(this.activity) {

    }
    ViewModelProvider(this).get(ListViewModel(activity!!.application)::class.java)
}
    /*private val adapters  by lazy {
myAdapter()

    }*/

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

binding = ListFragmetLayoutBinding.inflate(inflater)

/*
        val adapter = MyNewListAdapter(MyAdapterDataListener { country ->

            viewModel.displayDetails(country)

           // sleepTrackerViewModel.onSleepNightClicked(nightId)
        })



        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager=LinearLayoutManager(activity)

        viewModel.global.observe(viewLifecycleOwner, Observer {
            binding.totalCases.text="TotalCases : "+it.TotalConfirmed.toString()
            binding.totalDeaths.text="TotalDeaths : "+it.TotalDeaths.toString()
            binding.totalReooverd.text="TotalRecovered : "+it.TotalRecovered.toString()
        })
        viewModel.coronaItems.observe(viewLifecycleOwner, Observer {

           // adapters.setData(it)
            adapter.submitList(it)

        })
        viewModel.status.observe(viewLifecycleOwner, Observer {
            when (it) {
                ListViewModel.ApiStatus.LOADING -> {
                    binding.statusImage.visibility = View.VISIBLE
                    binding.mainContainer.visibility=View.VISIBLE
                    binding.statusImage.visibility=View.VISIBLE
                    binding.statusImage.setImageResource(R.drawable.loading_animation)
                }
                ListViewModel.ApiStatus.ERROR -> {
                    binding.statusImage.visibility = View.VISIBLE
                    binding.mainContainer.visibility=View.VISIBLE
                    binding.statusImage.visibility=View.GONE
                    Toast.makeText(context,"error",Toast.LENGTH_LONG).show()
                   // binding.statusImage.setImageResource(R.drawable.ic_connection_error)
                }
                ListViewModel.ApiStatus.DONE -> {
                    binding.statusImage.visibility = View.GONE
                    binding.mainContainer.visibility=View.VISIBLE
                }
            }
        })

        viewModel.navigateToSelectedCountry.observe(viewLifecycleOwner, Observer {
            if ( null != it ) {
             *//* this.findNavController().navigate(ListFragmentDirections.actionListFragmentToDetailFragment(it))
               // this.findNavController().navigate(R.id.action_listFragment_to_detailFragment)
                viewModel.displayDetailsComplete()*//*
            }

        })

        *//*viewModel.playlist.observe(viewLifecycleOwner, Observer {
            it?.apply {
                adapter.submitList(it)
            }

        })*//*
*//*
viewModel.globalNew.observe(viewLifecycleOwner, Observer {
    binding.totalCases.text="TotalCases : "+it.TotalConfirmed.toString()
    binding.totalDeaths.text="TotalDeaths : "+it.TotalDeaths.toString()
    binding.totalReooverd.text="TotalRecovered : "+it.TotalRecovered.toString()
})*//*
        binding.swiperefresh.setOnRefreshListener {

         //   viewModel.refreshDataFromRepository()
            binding.swiperefresh.isRefreshing = false
        }*/

        return binding.root
    }


}