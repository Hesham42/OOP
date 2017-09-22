package com.example.heshammostafa.oop;

import android.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Comm {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.text);

    }

    @Override
    public void respons(String data) {

        android.app.FragmentManager manager=getFragmentManager();
        FragmentB fragmentB= (FragmentB) manager.findFragmentById(R.id.fragmentb);
        fragmentB.ChangeText(data);
        textView.setText(data);
    }
}
