package com.downs.societysim.models;

import com.downs.societysim.utils.Utils;

import java.util.ArrayList;
import java.util.TreeMap;


public class Environment {

    private ArrayList<Utils.EnvironmentalTraits> traits;
    private Utils.EnvironmentType type;
    private ArrayList<Person> currentPopulation;

    // TODO: Review whiteboard design in photos on phone for this.
    private TreeMap<String, String> decisionTree;

    public Environment(){

    }


}
