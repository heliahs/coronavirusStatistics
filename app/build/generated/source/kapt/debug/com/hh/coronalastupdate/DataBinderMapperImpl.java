package com.hh.coronalastupdate;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.hh.coronalastupdate.databinding.FirstPageActivityBindingImpl;
import com.hh.coronalastupdate.databinding.FragmentDetailLayoutBindingImpl;
import com.hh.coronalastupdate.databinding.ListFragmetLayoutBindingImpl;
import com.hh.coronalastupdate.databinding.ListItemsLayoutBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FIRSTPAGEACTIVITY = 1;

  private static final int LAYOUT_FRAGMENTDETAILLAYOUT = 2;

  private static final int LAYOUT_LISTFRAGMETLAYOUT = 3;

  private static final int LAYOUT_LISTITEMSLAYOUT = 4;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(4);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hh.coronalastupdate.R.layout.first_page_activity, LAYOUT_FIRSTPAGEACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hh.coronalastupdate.R.layout.fragment_detail_layout, LAYOUT_FRAGMENTDETAILLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hh.coronalastupdate.R.layout.list_fragmet_layout, LAYOUT_LISTFRAGMETLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hh.coronalastupdate.R.layout.list_items_layout, LAYOUT_LISTITEMSLAYOUT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FIRSTPAGEACTIVITY: {
          if ("layout/first_page_activity_0".equals(tag)) {
            return new FirstPageActivityBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for first_page_activity is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDETAILLAYOUT: {
          if ("layout/fragment_detail_layout_0".equals(tag)) {
            return new FragmentDetailLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_detail_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTFRAGMETLAYOUT: {
          if ("layout/list_fragmet_layout_0".equals(tag)) {
            return new ListFragmetLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_fragmet_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMSLAYOUT: {
          if ("layout/list_items_layout_0".equals(tag)) {
            return new ListItemsLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_items_layout is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(4);

    static {
      sKeys.put("layout/first_page_activity_0", com.hh.coronalastupdate.R.layout.first_page_activity);
      sKeys.put("layout/fragment_detail_layout_0", com.hh.coronalastupdate.R.layout.fragment_detail_layout);
      sKeys.put("layout/list_fragmet_layout_0", com.hh.coronalastupdate.R.layout.list_fragmet_layout);
      sKeys.put("layout/list_items_layout_0", com.hh.coronalastupdate.R.layout.list_items_layout);
    }
  }
}
