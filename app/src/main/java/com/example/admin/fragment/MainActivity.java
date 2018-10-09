package com.example.admin.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class  MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fragment1 fragment1=new Fragment1();
        FragmentManager manager=getSupportFragmentManager();
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.add(R.id.fragment_1,fragment1);
        transaction.commit();


        Fragment2 fragment2=new Fragment2();
        FragmentManager manager2=getSupportFragmentManager();
        FragmentTransaction transaction2=manager2.beginTransaction();
        transaction2.add(R.id.fragment_2,fragment2);
        transaction2.commit();
    }
}
