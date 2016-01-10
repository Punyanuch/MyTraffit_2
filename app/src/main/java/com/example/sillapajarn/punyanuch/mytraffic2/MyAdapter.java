package com.example.sillapajarn.punyanuch.mytraffic2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by apple on 10/1/59.
 */
public class MyAdapter extends BaseAdapter{

    //Explicit
    private Context objContext;
    private int[] iconInts;
    private String[] titlStrings, detaStrings;

    public MyAdapter(Context objContext, int[] iconInts, String[] titlStrings, String[] detaStrings) {
        this.objContext = objContext;
        this.iconInts = iconInts;
        this.titlStrings = titlStrings;
        this.detaStrings = detaStrings;
    }   // Constructor

    @Override
    public int getCount() {
        return titlStrings.length;
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

        //Open Service
        LayoutInflater objLayoutInflater = (LayoutInflater) objContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View objView = objLayoutInflater.inflate(R.layout.traffic_listview, parent, false);

        //Show Icon
        ImageView iconImageView = (ImageView) objView.findViewById(R.id.imvIcon);
        iconImageView.setImageResource(iconInts[position]);

        //Show Title
        TextView titleTextView = (TextView) objView.findViewById(R.id.txtListTitle);
        titleTextView.setText(titlStrings[position]);

        //Show Detail
        TextView detailTextView = (TextView) objView.findViewById(R.id.txtListDedail);
        detailTextView.setText(detaStrings[position]);


        return objView;
    }
}   // Main Class
