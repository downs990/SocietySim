package com.downs.societysim;

import java.util.ArrayList;

public class Schedule {

    private ArrayList<Task> tasks;
    private String date;

    public Schedule(String date){
        tasks = new ArrayList<>();
    }

    public void addTask(Task newTask){
        tasks.add(newTask);
    }

    public ArrayList<Task> getTasks(){
        return tasks;
    }


    @Override
    public String toString() {

        String output = "";
        for(Task task : tasks){
            output += "\n" + task.toString() + "\n";
        }
        return output;
    }
}
