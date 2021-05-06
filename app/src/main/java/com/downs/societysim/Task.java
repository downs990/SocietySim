package com.downs.societysim;

public class Task {


    // TODO: Add repeat days of the week option for a task
    private String taskName;
    private String locationName;
    private int hourOfDay;// 0-23

    public Task(){

    }

    public Task(String taskName, String locationName, int hourOfDay) {
        this.taskName = taskName;
        this.locationName = locationName;
        this.hourOfDay = hourOfDay;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public int getHourOfDay() {
        return hourOfDay;
    }

    public void setHourOfDay(int hourOfDay) {
        this.hourOfDay = hourOfDay;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskName='" + taskName + '\'' +
                ", locationName='" + locationName + '\'' +
                ", hourOfDay='" + hourOfDay + '\'' +
                '}';
    }
}
