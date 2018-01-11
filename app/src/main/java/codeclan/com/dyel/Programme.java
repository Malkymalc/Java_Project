package codeclan.com.dyel;

import java.util.ArrayList;
import java.util.Collections;


/**
 * Created by user on 09/01/2018.
 */

public class Programme {
    private String name;
    private Enum<ProgrammeLevel> programmeLevelEnum;
    private Double yearlyProgressUpper;
    private Double yearlyProgressLower;
    private ArrayList<Workout> workouts;
    private Integer workoutListRepeats;
    private Integer cycleLength;
    private ArrayList<Workout> activeWorkouts;


    public Programme(String name, Enum<ProgrammeLevel> programmeLevelEnum, Double yearlyProgressUpper, Double yearlyProgressLower, Integer workoutListRepeats, Integer cycleLength, Workout... args) {
        this.name = name;
        this.programmeLevelEnum = programmeLevelEnum;
        this.yearlyProgressUpper = yearlyProgressUpper;
        this.yearlyProgressLower = yearlyProgressLower;
        this.workoutListRepeats = workoutListRepeats;
        this.cycleLength = cycleLength;
        this.workouts = new ArrayList<>();
        while (workoutListRepeats > 0) {
            Collections.addAll(workouts, args);
            workoutListRepeats--;
        }
        for(int i = 0; i < workouts.size(); i++) {
            workouts.get(i).setNumber(i+1);
        }
        this.activeWorkouts = new ArrayList<>();
        activeWorkouts.add(workouts.get(0));
    }


    // Custom Methods
    public void getNextWorkout(){
        int index = activeWorkouts.size();
        activeWorkouts.add(workouts.get(index));
    }

    public ArrayList<Workout> getActiveWorkouts(){
        return activeWorkouts;
    }




   //Standard Getters/Setters

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Enum<ProgrammeLevel> getProgrammeLevelEnum() {
        return programmeLevelEnum;
    }

    public void setProgrammeLevelEnum(Enum<ProgrammeLevel> programmeLevelEnum) {
        this.programmeLevelEnum = programmeLevelEnum;
    }

    public Double getYearlyProgressUpper() {
        return yearlyProgressUpper;
    }

    public void setYearlyProgressUpper(Double yearlyProgressUpper) {
        this.yearlyProgressUpper = yearlyProgressUpper;
    }

    public Double getYearlyProgressLower() {
        return yearlyProgressLower;
    }

    public void setYearlyProgressLower(Double yearlyProgressLower) {
        this.yearlyProgressLower = yearlyProgressLower;
    }

    public ArrayList<Workout> getWorkouts() {
        return workouts;
    }

    public void setWorkouts(ArrayList<Workout> workouts) {
        this.workouts = workouts;
    }

    public Integer getWorkoutListRepeats() {
        return workoutListRepeats;
    }

    public void setWorkoutListRepeats(Integer workoutListRepeats) {
        this.workoutListRepeats = workoutListRepeats;
    }

    public Integer getCycleLength() {
        return cycleLength;
    }

    public void setCycleLength(Integer cycleLength) {
        this.cycleLength = cycleLength;
    }

    public void setActiveWorkouts(ArrayList<Workout> activeWorkouts) {
        this.activeWorkouts = activeWorkouts;
    }
}
