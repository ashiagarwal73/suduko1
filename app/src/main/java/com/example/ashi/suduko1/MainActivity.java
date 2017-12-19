package com.example.ashi.suduko1;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.support.v4.app.FragmentManager fm=getSupportFragmentManager();
        Fragment fragment;
        Fragment fragment2;
        Fragment fragment3;
        Fragment fragment4;
        Fragment fragment5;
        Fragment fragment6;
        Fragment fragment7;
        Fragment fragment8;
        Fragment fragment9;

            fragment= new Fragment1();
            fm.beginTransaction().add(R.id.fragment1,fragment).commit();
            fragment2= new Fragment1();
            fm.beginTransaction().add(R.id.fragment2,fragment2).commit();
            fragment3= new Fragment1();
            fm.beginTransaction().add(R.id.fragment3,fragment3).commit();
            fragment4= new Fragment1();
            fm.beginTransaction().add(R.id.fragment4,fragment4).commit();
            fragment5= new Fragment1();
            fm.beginTransaction().add(R.id.fragment5,fragment5).commit();
            fragment6= new Fragment1();
            fm.beginTransaction().add(R.id.fragment6,fragment6).commit();
            fragment7= new Fragment1();
            fm.beginTransaction().add(R.id.fragment7,fragment7).commit();
            fragment8= new Fragment1();
            fm.beginTransaction().add(R.id.fragment8,fragment8).commit();
            fragment9= new Fragment1();
            fm.beginTransaction().add(R.id.fragment9,fragment9).commit();

    }
}
