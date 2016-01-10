package com.example.sillapajarn.punyanuch.mytraffic2;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private ListView trafficListView;
    private Button aboutMeButtom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        bindWidget();

        //Buttom Contraller
        buttomXontraller();


    }   // Main Method

    private void buttomXontraller() {

        aboutMeButtom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Sound Effect
                MediaPlayer buttonMediaPlayer = MediaPlayer.create(getBaseContext(),
                        R.raw.bird_maxican);
                buttonMediaPlayer.start();

                //Intent to ActionView
                Intent objIntent = new Intent(Intent.ACTION_VIEW);
                objIntent.setData(Uri.parse("https://youtu.be/xaibRAJ-Hjo"));
                startActivity(objIntent);


            }   // event
        });

    }   // buttomContraller

    private void bindWidget() {
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutMeButtom = (Button) findViewById(R.id.button);
    }

}   // Main Class นี่คือคลาสหลักนาจาา
