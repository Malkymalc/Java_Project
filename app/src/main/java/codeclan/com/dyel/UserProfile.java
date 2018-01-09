package codeclan.com.dyel;

import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by user on 07/01/2018.
 */

public class UserProfile {
    private String name;
    private int age;
    private boolean gender;
    private Double height;
    private HashMap<Calendar, Double> weights;
    private HashMap<Exercise, Double> workingMaxes;
    private boolean weightUnit;
    private boolean heightUnit;

    public UserProfile(String name, int age, boolean gender, Double height, Double startingWeight, boolean weightUnit, boolean heightUnit) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weights = new HashMap<>();
        weights.put(Calendar.getInstance(), startingWeight);
        this.workingMaxes = new HashMap<>();
        this.weightUnit = weightUnit;
        this.heightUnit = heightUnit;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }
    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Double getHeight() {
        return height;
    }
    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getCurrentWeight() {
        Calendar mostRecent = Collections.max(weights.keySet());
        return weights.get(mostRecent);
    }
    public HashMap addWeight() {
        return weights;
    }
    public void addWeight(Double weight) {
        weights.put(Calendar.getInstance(), weight);
    }

    public boolean isWeightUnit() {
        return weightUnit;
    }
    public void setWeightUnit(boolean weightUnit) {
        this.weightUnit = weightUnit;
    }

    public boolean isHeightUnit() {
        return heightUnit;
    }
    public void setHeightUnit(boolean heightUnit) {
        this.heightUnit = heightUnit;
    }

    //Add working maxes on initialisation with defaults based on equipment and gender

    // 1. For lifts in workouts in programme add new working maxes.
    // 2. Methods to add new working max, linked to interface method iIncrement implemented by
    // Workout (based on SetRepSchemes data)




}
