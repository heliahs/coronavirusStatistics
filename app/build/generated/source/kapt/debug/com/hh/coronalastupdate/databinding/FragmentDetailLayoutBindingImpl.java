package com.hh.coronalastupdate.databinding;
import com.hh.coronalastupdate.R;
import com.hh.coronalastupdate.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentDetailLayoutBindingImpl extends FragmentDetailLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.countryContainer, 6);
        sViewsWithIds.put(R.id.country_flag, 7);
        sViewsWithIds.put(R.id.country_name, 8);
        sViewsWithIds.put(R.id.card_deaths, 9);
        sViewsWithIds.put(R.id.card_cases, 10);
        sViewsWithIds.put(R.id.card_recovered, 11);
        sViewsWithIds.put(R.id.chart1, 12);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDetailLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private FragmentDetailLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.cardview.widget.CardView) bindings[10]
            , (androidx.cardview.widget.CardView) bindings[9]
            , (androidx.cardview.widget.CardView) bindings[11]
            , (com.github.mikephil.charting.charts.PieChart) bindings[12]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[6]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.ScrollView) bindings[0]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[5]
            );
        this.detailFragmentParentId.setTag(null);
        this.newCases.setTag(null);
        this.newDeaths.setTag(null);
        this.totalCases.setTag(null);
        this.totalDeaths.setTag(null);
        this.totalRecovered.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.viewModel == variableId) {
            setViewModel((com.hh.coronalastupdate.viewmodels.DetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.hh.coronalastupdate.viewmodels.DetailViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelSelectedCountry((androidx.lifecycle.LiveData<com.hh.coronalastupdate.models.Country>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelSelectedCountry(androidx.lifecycle.LiveData<com.hh.coronalastupdate.models.Country> ViewModelSelectedCountry, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        java.lang.String javaLangStringTotalDeathsViewModelSelectedCountryTotalDeaths = null;
        long viewModelSelectedCountryNewConfirmed = 0;
        long viewModelSelectedCountryTotalConfirmed = 0;
        com.hh.coronalastupdate.models.Country viewModelSelectedCountryGetValue = null;
        java.lang.String javaLangStringNewDeathsViewModelSelectedCountryNewDeaths = null;
        java.lang.String javaLangStringTotalCasesViewModelSelectedCountryTotalConfirmed = null;
        androidx.lifecycle.LiveData<com.hh.coronalastupdate.models.Country> viewModelSelectedCountry = null;
        java.lang.String javaLangStringTotalRecoveredViewModelSelectedCountryTotalRecovered = null;
        long viewModelSelectedCountryTotalDeaths = 0;
        long viewModelSelectedCountryNewDeaths = 0;
        java.lang.String javaLangStringNewCasesViewModelSelectedCountryNewConfirmed = null;
        com.hh.coronalastupdate.viewmodels.DetailViewModel viewModel = mViewModel;
        long viewModelSelectedCountryTotalRecovered = 0;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.selectedCountry
                    viewModelSelectedCountry = viewModel.getSelectedCountry();
                }
                updateLiveDataRegistration(0, viewModelSelectedCountry);


                if (viewModelSelectedCountry != null) {
                    // read viewModel.selectedCountry.getValue()
                    viewModelSelectedCountryGetValue = viewModelSelectedCountry.getValue();
                }


                if (viewModelSelectedCountryGetValue != null) {
                    // read viewModel.selectedCountry.getValue().newConfirmed
                    viewModelSelectedCountryNewConfirmed = viewModelSelectedCountryGetValue.getNewConfirmed();
                    // read viewModel.selectedCountry.getValue().totalConfirmed
                    viewModelSelectedCountryTotalConfirmed = viewModelSelectedCountryGetValue.getTotalConfirmed();
                    // read viewModel.selectedCountry.getValue().totalDeaths
                    viewModelSelectedCountryTotalDeaths = viewModelSelectedCountryGetValue.getTotalDeaths();
                    // read viewModel.selectedCountry.getValue().newDeaths
                    viewModelSelectedCountryNewDeaths = viewModelSelectedCountryGetValue.getNewDeaths();
                    // read viewModel.selectedCountry.getValue().totalRecovered
                    viewModelSelectedCountryTotalRecovered = viewModelSelectedCountryGetValue.getTotalRecovered();
                }


                // read ("New Cases : ") + (viewModel.selectedCountry.getValue().newConfirmed)
                javaLangStringNewCasesViewModelSelectedCountryNewConfirmed = ("New Cases : ") + (viewModelSelectedCountryNewConfirmed);
                // read ("Total Cases : ") + (viewModel.selectedCountry.getValue().totalConfirmed)
                javaLangStringTotalCasesViewModelSelectedCountryTotalConfirmed = ("Total Cases : ") + (viewModelSelectedCountryTotalConfirmed);
                // read ("Total Deaths : ") + (viewModel.selectedCountry.getValue().totalDeaths)
                javaLangStringTotalDeathsViewModelSelectedCountryTotalDeaths = ("Total Deaths : ") + (viewModelSelectedCountryTotalDeaths);
                // read ("New Deaths : ") + (viewModel.selectedCountry.getValue().newDeaths)
                javaLangStringNewDeathsViewModelSelectedCountryNewDeaths = ("New Deaths : ") + (viewModelSelectedCountryNewDeaths);
                // read ("Total Recovered : ") + (viewModel.selectedCountry.getValue().totalRecovered)
                javaLangStringTotalRecoveredViewModelSelectedCountryTotalRecovered = ("Total Recovered : ") + (viewModelSelectedCountryTotalRecovered);
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.newCases, javaLangStringNewCasesViewModelSelectedCountryNewConfirmed);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.newDeaths, javaLangStringNewDeathsViewModelSelectedCountryNewDeaths);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.totalCases, javaLangStringTotalCasesViewModelSelectedCountryTotalConfirmed);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.totalDeaths, javaLangStringTotalDeathsViewModelSelectedCountryTotalDeaths);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.totalRecovered, javaLangStringTotalRecoveredViewModelSelectedCountryTotalRecovered);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.selectedCountry
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}