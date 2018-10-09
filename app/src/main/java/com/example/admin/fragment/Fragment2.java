package com.example.admin.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment2 extends Fragment {
    @Override
    public void onCreate(@NonNull Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);}
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup Container, @NonNull Bundle savedInstanceState){
        View view=inflater.inflate(R.layout.activity_main,Container,false);
        return view;
    }
}
