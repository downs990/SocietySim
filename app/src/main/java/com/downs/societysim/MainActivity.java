package com.downs.societysim;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends Activity {

    TextView mainSimDateTime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mainSimDateTime = findViewById(R.id.sim_time_tv);

        Date dNow = new Date();
        dNow.setHours(12);
        dNow.setMinutes(0);
        dNow.setSeconds(0);
        SimpleDateFormat ft =
                new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        mainSimDateTime.setText(ft.format(dNow));


        // Start main sim loop
        Thread t = new Thread(new Simulation(dNow, mainSimDateTime, ((Activity) this)));
        t.start();

    }
}