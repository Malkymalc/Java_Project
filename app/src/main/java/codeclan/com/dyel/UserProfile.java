package codeclan.com.dyel;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by user on 07/01/2018.
 */

public class UserProfile implements Serializable {
    private String name;
    private String age;
    private String gender;
    private Double height;
    private HashMap<Calendar, Double> weights;
    private HashMap<Exercise, Double> workingMaxes;
    private String weightUnit;
    private String heightUnit;

    public UserProfile(String name, String age, String gender, Double height, Double startingWeight, String weightUnit, String heightUnit) {
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

    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }

    public String isGender() {
        return gender;
    }
    public void setGender(String gender) {
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

    public String isWeightUnit() {
        return weightUnit;
    }
    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    public String isHeightUnit() {
        return heightUnit;
    }
    public void setHeightUnit(String heightUnit) {
        this.heightUnit = heightUnit;
    }

    //Add working maxes on initialisation with defaults based on equipment and gender

    // 1. For lifts in workouts in programme add new working maxes.
    // 2. Methods to add new working max, linked to interface method iIncrement implemented by
    // Workout (based on SetRepSchemes data)




}
