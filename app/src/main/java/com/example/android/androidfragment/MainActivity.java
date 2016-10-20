package com.example.android.androidfragment;

import android.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            MyFragment frag = new MyFragment();
            android.app.FragmentManager manager = getFragmentManager();
            android.app.FragmentTransaction transaction = manager.beginTransaction();

            transaction.add(R.id.activity_main, frag, "AndroidFragment");

            transaction.commit();
        }
        catch (Exception ex) {
        }
    }
}
