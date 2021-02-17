package com.hh.coronalastupdate.databinding;
import com.hh.coronalastupdate.R;
import com.hh.coronalastupdate.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemsLayoutBindingImpl extends ListItemsLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.country_flag, 1);
        sViewsWithIds.put(R.id.country_name, 2);
        sViewsWithIds.put(R.id.txt_newDeaths, 3);
        sViewsWithIds.put(R.id.txt_newCase, 4);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListItemsLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ListItemsLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.flag == variableId) {
            setFlag((com.hh.coronalastupdate.classes.CountryData) variable);
        }
        else if (BR.country == variableId) {
            setCountry((com.hh.coronalastupdate.models.Country) variable);
        }
        else if (BR.clickListener == variableId) {
            setClickListener((com.hh.coronalastupdate.adapters.MyAdapterDataListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFlag(@Nullable com.hh.coronalastupdate.classes.CountryData Flag) {
        this.mFlag = Flag;
    }
    public void setCountry(@Nullable com.hh.coronalastupdate.models.Country Country) {
        this.mCountry = Country;
    }
    public void setClickListener(@Nullable com.hh.coronalastupdate.adapters.MyAdapterDataListener ClickListener) {
        this.mClickListener = ClickListener;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): flag
        flag 1 (0x2L): country
        flag 2 (0x3L): clickListener
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}