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
        Fragment fragment=fm.findFragmentById(R.id.fragment1);
        Fragment fragment2=fm.findFragmentById(R.id.fragment2);
        Fragment fragment3=fm.findFragmentById(R.id.fragment3);
        Fragment fragment4=fm.findFragmentById(R.id.fragment4);

            fragment= new Fragment1();
            fm.beginTransaction().add(R.id.fragment1,fragment).commit();
            fragment2= new Fragment1();
            fm.beginTransaction().add(R.id.fragment2,fragment2).commit();
            fragment3= new Fragment1();
            fm.beginTransaction().add(R.id.fragment3,fragment3).commit();
            fragment4= new Fragment1();
            fm.beginTransaction().add(R.id.fragment4,fragment4).commit();

    }
}
