package com.hh.coronalastupdate.fragments;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.hh.coronalastupdate.R;
import com.hh.coronalastupdate.models.Country;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ListFragmentDirections {
  private ListFragmentDirections() {
  }

  @NonNull
  public static ActionListFragmentToDetailFragment actionListFragmentToDetailFragment(
      @NonNull Country country) {
    return new ActionListFragmentToDetailFragment(country);
  }

  public static class ActionListFragmentToDetailFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionListFragmentToDetailFragment(@NonNull Country country) {
      if (country == null) {
        throw new IllegalArgumentException("Argument \"country\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("country", country);
    }

    @NonNull
    public ActionListFragmentToDetailFragment setCountry(@NonNull Country country) {
      if (country == null) {
        throw new IllegalArgumentException("Argument \"country\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("country", country);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("country")) {
        Country country = (Country) arguments.get("country");
        if (Parcelable.class.isAssignableFrom(Country.class) || country == null) {
          __result.putParcelable("country", Parcelable.class.cast(country));
        } else if (Serializable.class.isAssignableFrom(Country.class)) {
          __result.putSerializable("country", Serializable.class.cast(country));
        } else {
          throw new UnsupportedOperationException(Country.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_listFragment_to_detailFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Country getCountry() {
      return (Country) arguments.get("country");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionListFragmentToDetailFragment that = (ActionListFragmentToDetailFragment) object;
      if (arguments.containsKey("country") != that.arguments.containsKey("country")) {
        return false;
      }
      if (getCountry() != null ? !getCountry().equals(that.getCountry()) : that.getCountry() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getCountry() != null ? getCountry().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionListFragmentToDetailFragment(actionId=" + getActionId() + "){"
          + "country=" + getCountry()
          + "}";
    }
  }
}
