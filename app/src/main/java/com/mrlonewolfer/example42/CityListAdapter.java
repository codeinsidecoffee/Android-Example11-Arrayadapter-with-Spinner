package com.mrlonewolfer.example42;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CityListAdapter extends BaseAdapter {
    ArrayList<CityBean> cityBeans;
    public CityListAdapter(ArrayList<CityBean> cityBeans) {
    this.cityBeans=cityBeans;
    }

    @Override
    public int getCount() {
        return cityBeans.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView  textView;
        if(convertView==null){
            LayoutInflater inflater=LayoutInflater.from(parent.getContext());
            convertView=inflater.inflate(R.layout.city_list_row,parent,false);

        }
        CityBean cityBean=cityBeans.get(position);
        textView=convertView.findViewById(R.id.txtCity);
        textView.setText(cityBean.getCity());
        return convertView;
    }
}
