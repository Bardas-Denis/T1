package com.example.t1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SecondFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView tv = view.findViewById(R.id.animal);
        tv.setText(getArguments().getString("Animal"));
        if(getArguments().getString("Animal").contains("EUROPA"))
        {
            int color = getResources().getColor(R.color.green);
            view.setBackgroundColor(color);
        } else if (getArguments().getString("Animal").contains("AFRICA")) {
            int color = getResources().getColor(R.color.yellow);
            view.setBackgroundColor(color);
        }else if (getArguments().getString("Animal").contains("ASIA")) {
            int color = getResources().getColor(R.color.red);
            view.setBackgroundColor(color);
        }else if (getArguments().getString("Animal").contains("AMERICA")) {
            int color = getResources().getColor(R.color.blue);
            view.setBackgroundColor(color);
        }else if (getArguments().getString("Animal").contains("AUSTRALIA")) {
            int color = getResources().getColor(R.color.orange);
            view.setBackgroundColor(color);
        }
    }
}