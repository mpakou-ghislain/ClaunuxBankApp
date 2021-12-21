package com.dev.claunuxbankapp.ui.transfers;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.dev.claunuxbankapp.databinding.FragmentTransfersBinding;

public class TransfersFragment extends Fragment {

    private TransfersViewModel transfersViewModel;
    private FragmentTransfersBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        transfersViewModel =
                new ViewModelProvider(this).get(TransfersViewModel.class);

        binding = FragmentTransfersBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textDashboard;
        transfersViewModel.getText().observe(getViewLifecycleOwner(),
            s -> textView.setText(s));
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}