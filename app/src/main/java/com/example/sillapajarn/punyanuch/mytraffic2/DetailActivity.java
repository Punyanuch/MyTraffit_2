package com.example.sillapajarn.punyanuch.mytraffic2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    //Explicit
    private TextView titletTextView, detailtTextView;
    private ImageView trafficImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Bind Widget
        bindWidget();

        //SHow Detail
        int intIndex = getIntent().getIntExtra("Index", 0);
        String[] detailStrings = getResources().getStringArray(R.array.Detail_Long);
        detailtTextView.setText(detailStrings[intIndex]);

        //Show View
        showview();

    }   // Main Method

    private void showview() {

        //Show Title
        String strTitle = getIntent().getStringExtra("Title");
        titletTextView.setText(strTitle);

        //Show Image
        int intIcon = getIntent().getIntExtra("Image", R.drawable.traffic_01);
        trafficImageView.setImageResource(intIcon);


    }   // ShowView

    private void bindWidget() {

        titletTextView = (TextView) findViewById(R.id.txtShowTitle);
        detailtTextView = (TextView) findViewById(R.id.txtShowDetail);
        trafficImageView = (ImageView) findViewById(R.id.imvShowImage);


    }

}   //Main Class
