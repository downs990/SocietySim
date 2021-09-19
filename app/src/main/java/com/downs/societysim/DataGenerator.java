package com.downs.societysim;

import com.downs.societysim.models.Environment;
import com.downs.societysim.models.Person;

import java.util.ArrayList;
import java.util.HashMap;

public class DataGenerator {


    // TODO: Add Ontology per person for tracking all life decisions.
    public static Person generateRandomPerson(){
        return null;
    }



    // TODO: Add decision trees per environment
    public static Environment generateRandomEnvironment(){
        return null;
    }



    /**
     * 1. Total Environmental Balance
     * 2. Average Life Expectancy 100yrs
     * 3. No Violencce or Conflict
     * 4. Economic Equality
     * 5. Social Equality (diverse group of friends )
     *
     * @return
     */
    public static ArrayList<HashMap<String, Double>> generateAllHistoricEvents(){
        ArrayList<HashMap<String, Double>> allHistoricEvents = new ArrayList<>();


        HashMap<String, Double> averageLifeExpectancy100 =  new HashMap<>();
        averageLifeExpectancy100.put("AverageLifeExpectancy", 100.0);


        HashMap<String, Double> economicEquality =  new HashMap<>();
        economicEquality.put("AverageKnowledgeLevel", 0.90);
        economicEquality.put("JobCreation", 0.90);


        allHistoricEvents.add(averageLifeExpectancy100);
        allHistoricEvents.add(economicEquality);

        return allHistoricEvents;
    }




    public static Schedule generateRandomSchedule(String scheduleDate){

        Schedule newSchedule = new Schedule(scheduleDate);
        for(int i = 0; i < 5; i++){
            int max = 10,min = 0;
            int range = (max - min) + 1;
            int locationID = (int) (Math.random() * range) + min;  // Inclusive on both ends

            int max1 = 23, min1 = 0;
            int range1 = (max1 - min1) + 1;
            int hourOfDay = (int) (Math.random() * range1) + min1;  // Inclusive on both ends


            Task newTask = new Task();
            newTask.setTaskName("Task"+i);
            newTask.setLocationName("Location"+ locationID);
            newTask.setHourOfDay(hourOfDay);

            newSchedule.addTask(newTask);

        }

        return newSchedule;
    }
}
