// Generated by data binding compiler. Do not edit!
package com.hh.coronalastupdate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.hh.coronalastupdate.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ListItemsLayoutBinding extends ViewDataBinding {
  @NonNull
  public final ImageView countryFlag;

  @NonNull
  public final TextView countryName;

  @NonNull
  public final TextView txtNewCase;

  @NonNull
  public final TextView txtNewDeaths;

  protected ListItemsLayoutBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView countryFlag, TextView countryName, TextView txtNewCase, TextView txtNewDeaths) {
    super(_bindingComponent, _root, _localFieldCount);
    this.countryFlag = countryFlag;
    this.countryName = countryName;
    this.txtNewCase = txtNewCase;
    this.txtNewDeaths = txtNewDeaths;
  }

  @NonNull
  public static ListItemsLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_items_layout, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ListItemsLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ListItemsLayoutBinding>inflateInternal(inflater, R.layout.list_items_layout, root, attachToRoot, component);
  }

  @NonNull
  public static ListItemsLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.list_items_layout, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ListItemsLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ListItemsLayoutBinding>inflateInternal(inflater, R.layout.list_items_layout, null, false, component);
  }

  public static ListItemsLayoutBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ListItemsLayoutBinding bind(@NonNull View view, @Nullable Object component) {
    return (ListItemsLayoutBinding)bind(component, view, R.layout.list_items_layout);
  }
}
