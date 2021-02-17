package com.hh.coronalastupdate.databinding;
import com.hh.coronalastupdate.R;
import com.hh.coronalastupdate.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemsLayoutBindingImpl extends ListItemsLayoutBinding implements com.hh.coronalastupdate.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
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
        this.countryFlag.setTag(null);
        this.countryName.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.txtNewCase.setTag(null);
        this.txtNewDeaths.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.hh.coronalastupdate.generated.callback.OnClickListener(this, 1);
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
        if (BR.country == variableId) {
            setCountry((com.hh.coronalastupdate.models.Country) variable);
        }
        else if (BR.flag == variableId) {
            setFlag((com.hh.coronalastupdate.classes.CountryData) variable);
        }
        else if (BR.clickListener == variableId) {
            setClickListener((com.hh.coronalastupdate.adapters.MyAdapterDataListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCountry(@Nullable com.hh.coronalastupdate.models.Country Country) {
        this.mCountry = Country;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.country);
        super.requestRebind();
    }
    public void setFlag(@Nullable com.hh.coronalastupdate.classes.CountryData Flag) {
        this.mFlag = Flag;
    }
    public void setClickListener(@Nullable com.hh.coronalastupdate.adapters.MyAdapterDataListener ClickListener) {
        this.mClickListener = ClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.clickListener);
        super.requestRebind();
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
        com.hh.coronalastupdate.models.Country country = mCountry;
        java.lang.String countryCountry = null;
        long countryTotalDeaths = 0;
        com.hh.coronalastupdate.adapters.MyAdapterDataListener clickListener = mClickListener;
        java.lang.String countryCountryCodeToLowerCase = null;
        java.lang.String countryCountryCode = null;
        java.lang.String javaLangStringCasesCountryTotalConfirmed = null;
        long countryTotalConfirmed = 0;
        java.lang.String javaLangStringDeathsCountryTotalDeaths = null;

        if ((dirtyFlags & 0x9L) != 0) {



                if (country != null) {
                    // read country.country
                    countryCountry = country.getCountry();
                    // read country.totalDeaths
                    countryTotalDeaths = country.getTotalDeaths();
                    // read country.countryCode
                    countryCountryCode = country.getCountryCode();
                    // read country.totalConfirmed
                    countryTotalConfirmed = country.getTotalConfirmed();
                }


                // read ("Deaths : ") + (country.totalDeaths)
                javaLangStringDeathsCountryTotalDeaths = ("Deaths : ") + (countryTotalDeaths);
                // read ("Cases : ") + (country.totalConfirmed)
                javaLangStringCasesCountryTotalConfirmed = ("Cases : ") + (countryTotalConfirmed);
                if (countryCountryCode != null) {
                    // read country.countryCode.toLowerCase()
                    countryCountryCodeToLowerCase = countryCountryCode.toLowerCase();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            com.hh.coronalastupdate.BindingAdapterKt.bindImage(this.countryFlag, countryCountryCodeToLowerCase);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.countryName, countryCountry);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtNewCase, javaLangStringCasesCountryTotalConfirmed);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtNewDeaths, javaLangStringDeathsCountryTotalDeaths);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // country
        com.hh.coronalastupdate.models.Country country = mCountry;
        // clickListener
        com.hh.coronalastupdate.adapters.MyAdapterDataListener clickListener = mClickListener;
        // clickListener != null
        boolean clickListenerJavaLangObjectNull = false;



        clickListenerJavaLangObjectNull = (clickListener) != (null);
        if (clickListenerJavaLangObjectNull) {



            clickListener.onClick(country);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): country
        flag 1 (0x2L): flag
        flag 2 (0x3L): clickListener
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}