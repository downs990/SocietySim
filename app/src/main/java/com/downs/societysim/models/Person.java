package com.downs.societysim.models;

import com.downs.societysim.Schedule;
import com.downs.societysim.utils.Utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Person {

    private int age;
    private String ethnicity;
    private boolean male; // gender
    private Utils.KnowledgeLevel knowledgeLevel;
    private HashMap<Utils.Mood, Double> mood;
    private ArrayList<Person> offString;
    private ArrayList<Person> friends;
    private Environment currentLocation;

    // TODO: How to decide what's a major life decision? (salary threshold, new education level?)
    private TreeMap<String, String> majorLifeDecisionsOntology;


    private Schedule schedule;

    public Person(){

        age = 21;

        knowledgeLevel = Utils.KnowledgeLevel.HIGH_SCHOOL;

        mood = new HashMap<>();
        mood.put(Utils.Mood.HAPPY, 0.80);
        mood.put(Utils.Mood.HOSTILE, 0.10);
        mood.put(Utils.Mood.CREATIVITY, 0.70);

        offString = new ArrayList<>();
        friends = new ArrayList<>();

    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }
}
