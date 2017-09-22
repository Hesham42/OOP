package com.example.heshammostafa.oop;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Hesham Mostafa on 7/4/2017.
 */

public class FragmentA extends Fragment implements View.OnClickListener {

    Button button;
    int counter;
    Comm comm;
    @Override

    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        comm= (Comm) getActivity();
        button = (Button) getActivity().findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fargmenta, container, false);


    }

    @Override
    public void onClick(View view) {
        counter++;
        comm.respons("Guinness  ="+counter);
    }

}
