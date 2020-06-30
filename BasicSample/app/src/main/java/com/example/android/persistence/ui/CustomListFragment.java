package com.example.android.persistence.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.persistence.R;
import com.example.android.persistence.databinding.CustomFragmentBinding;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

class CustomListFragment extends Fragment {
    private CustomFragmentBinding customFragmentBinding;
    private ProductAdapter productAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        customFragmentBinding = DataBindingUtil.inflate(inflater, R.layout.custom_fragment, container, false);
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
