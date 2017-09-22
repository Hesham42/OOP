package com.example.heshammostafa.oop;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Hesham Mostafa on 7/4/2017.
 */

public class FragmentB extends Fragment {
    TextView textView;

    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
      textView=(TextView)getActivity().findViewById(R.id.textFragmentB);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragmentb, container, false);


    }

    public void ChangeText(String s)
    {
        textView.setText(s);
    }
}
