package com.hh.coronalastupdate.fragments;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import com.hh.coronalastupdate.models.Country;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class DetailFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private DetailFragmentArgs() {
  }

  private DetailFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static DetailFragmentArgs fromBundle(@NonNull Bundle bundle) {
    DetailFragmentArgs __result = new DetailFragmentArgs();
    bundle.setClassLoader(DetailFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("country")) {
      Country country;
      if (Parcelable.class.isAssignableFrom(Country.class) || Serializable.class.isAssignableFrom(Country.class)) {
        country = (Country) bundle.get("country");
      } else {
        throw new UnsupportedOperationException(Country.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (country == null) {
        throw new IllegalArgumentException("Argument \"country\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("country", country);
    } else {
      throw new IllegalArgumentException("Required argument \"country\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Country getCountry() {
    return (Country) arguments.get("country");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    DetailFragmentArgs that = (DetailFragmentArgs) object;
    if (arguments.containsKey("country") != that.arguments.containsKey("country")) {
      return false;
    }
    if (getCountry() != null ? !getCountry().equals(that.getCountry()) : that.getCountry() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getCountry() != null ? getCountry().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "DetailFragmentArgs{"
        + "country=" + getCountry()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(DetailFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@NonNull Country country) {
      if (country == null) {
        throw new IllegalArgumentException("Argument \"country\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("country", country);
    }

    @NonNull
    public DetailFragmentArgs build() {
      DetailFragmentArgs result = new DetailFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setCountry(@NonNull Country country) {
      if (country == null) {
        throw new IllegalArgumentException("Argument \"country\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("country", country);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Country getCountry() {
      return (Country) arguments.get("country");
    }
  }
}
