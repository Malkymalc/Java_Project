package codeclan.com.dyel;

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
    private HashMap<? extends DateTime, Double> weights;
    private boolean weightUnit;
    private boolean heightUnit;

    public UserProfile(String name, int age, boolean gender, Double height, HashMap<DateTime, Double> weights, boolean weightUnit, boolean heightUnit) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weights = weights;
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
    public void setHeight(float height) {
        this.height = height;
    }

    public HashMap getCurrentWeight() {
        mostRecent = Collections.max(weights.keySet());
        return weights.get(mostRecent);
    }
    public HashMap getWeights() {
        return weights;
    }
    public void addWeight(Float weight) {
        weights.put(DateTime.now(), weight);
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
}
