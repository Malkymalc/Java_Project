package codeclan.com.dyel;

/**
 * Created by user on 07/01/2018.
 */

public class Lift {
    private Exercise exercise;
    private SetRepScheme setRepScheme;
    private Float trainingMax;


    public Lift(Exercise exercise, SetRepScheme setRepScheme) {
        this.exercise = exercise;
        this.setRepScheme = setRepScheme;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    public SetRepScheme getSetRepScheme() {
        return setRepScheme;
    }

    public void setSetRepScheme(SetRepScheme setRepScheme) {
        this.setRepScheme = setRepScheme;
    }

    public Float getTrainingMax() {
        return trainingMax;
    }

    public void setTrainingMax(Float trainingMax) {
        this.trainingMax = trainingMax;
    }
}
