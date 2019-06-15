package com.mrlonewolfer.example42;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {


    Context context;
    Spinner spinnerCity;
    ArrayList<CityBean> cityBeans;
    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        context=getActivity();
        View view= inflater.inflate(R.layout.fragment_main, container, false);
        spinnerCity=view.findViewById(R.id.spinnerList);
        preparedData();
        CityListAdapter cityListAdapter=new CityListAdapter(cityBeans);
        spinnerCity.setAdapter(cityListAdapter);
        spinnerCity.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(context, cityBeans.get(position).getCity()+" is selected", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        return  view;
    }

    private void preparedData() {
        cityBeans=new ArrayList<>();
        cityBeans.add(new CityBean("Ahmedabad"));
        cityBeans.add(new CityBean("Surat"));
        cityBeans.add(new CityBean("Bharuch"));
        cityBeans.add(new CityBean("Valsad"));
        cityBeans.add(new CityBean("Vadodra"));
    }

}
