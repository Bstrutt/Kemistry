package com.example.kemistry;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class ConversionFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_conversion, container, false);
        Button mass = (Button) view.findViewById(R.id.mass);

        mass.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container,new MassDensity());
                fr.commit();
            }
        });

        Button volume = (Button) view.findViewById(R.id.volume);

        volume.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {
                FragmentTransaction fr=getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container,new Volume());
                fr.commit();
            }
        });

        return view;
    }
}