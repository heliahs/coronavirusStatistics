package com.hh.coronalastupdate.fragments;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.hh.coronalastupdate.R;

public class ListFragmentDirections {
  private ListFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionListFragmentToDetailFragment() {
    return new ActionOnlyNavDirections(R.id.action_listFragment_to_detailFragment);
  }
}
