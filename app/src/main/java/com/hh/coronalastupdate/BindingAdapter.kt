package com.hh.coronalastupdate

import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

import com.hh.coronadata.viewmodels.ListViewModel
import com.hh.coronalastupdate.classes.CountryData

@BindingAdapter("imageUrl")
fun bindImage(imgView: ImageView, countryCode: String?) {
    countryCode?.let {
      //  val imgUri = imgUrl.toUri().buildUpon().scheme("https").build()
        val imgUri = CountryData().getFlagMasterResID(countryCode)
        Glide.with(imgView.context)
            .load(imgUri)
            .apply(
                RequestOptions()
                .placeholder(R.drawable.image)
                .error(R.drawable.image))
            .into(imgView)
    }
}


@BindingAdapter("apiStatus")
fun bindStatus(statusImageView: ImageView, status: ListViewModel.ApiStatus?) {
    when (status) {
        ListViewModel.ApiStatus.LOADING -> {
            statusImageView.visibility = View.VISIBLE
            statusImageView.setImageResource(R.drawable.loading_animation)
        }
        ListViewModel.ApiStatus.ERROR -> {
            statusImageView.visibility = View.VISIBLE
            statusImageView.setImageResource(R.drawable.ic_connection_error)
        }
        ListViewModel.ApiStatus.DONE -> {
            statusImageView.visibility = View.GONE
        }
    }
}