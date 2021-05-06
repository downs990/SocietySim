package com.downs.societysim;

import android.app.Activity;
import android.util.Log;
import android.widget.TextView;

import com.downs.societysim.models.Person;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Simulation implements Runnable {


    private Date simDateTime;
    private TextView dateTimeTextView;
    private Activity activity;
    private ArrayList<Person> entirePopulation;

    public Simulation(Date simDateTime, TextView dateTimeTextView, Activity activity) {
        this.simDateTime = simDateTime;
        this.dateTimeTextView = dateTimeTextView;
        this.activity = activity;

        // Initialize sim objects
        entirePopulation = new ArrayList<>();
        Person person0 = new Person();
        Schedule newSchedule = DataGenerator.generateRandomSchedule("04/17/2021");

        person0.setSchedule(newSchedule);
        entirePopulation.add(person0);

        String schedule = entirePopulation.get(0).getSchedule().toString();
        Log.d("Schedule:", schedule);
    }


    /**
     * Updates the state of all users and environments every frame of the simulation and
     * performs operations to data structures to track/log all state changes for traceability of:
     *  - Historic Events
     *  - Major Life Events
     *
     * @param currentSimDateTime
     */
    private void updateSimState(Date currentSimDateTime){

        SimpleDateFormat ft =
                new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a");
        String simDateTime = ft.format(currentSimDateTime);


        for(Person person : entirePopulation){
            for (Task task : person.getSchedule().getTasks()){
                int taskHour = task.getHourOfDay();

                int currentSimHour = currentSimDateTime.getHours();

                String output = "{" + taskHour + " , " + currentSimHour + "}";
                Log.d("Testing", output);

                if(taskHour == currentSimHour  ){
                    // Perform given task now.
                    Log.d("Task Executed: ", task.getTaskName());
                }
            }
        }
    }


    // Main sim loop
    @Override
    public void run() {

        while (true) {

            simDateTime.setHours(simDateTime.getHours() + 1);

            SimpleDateFormat ft =
                    new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a");

            String newSimDateTime = ft.format(simDateTime);


            // Update environments and persons
            updateSimState(simDateTime);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            if (activity != null) {
                activity.runOnUiThread(new Runnable() {

                    @Override
                    public void run() {

                        String schedule = entirePopulation.get(0).getSchedule().toString();

                        String displayOutput = "" + newSimDateTime + "\n" + schedule;
                        dateTimeTextView.setText(displayOutput);



                    }
                });
            }
        }


    }
}
