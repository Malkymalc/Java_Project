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
    private ArrayList<Workout> completedWorkouts;


    public Programme(String name, Enum<ProgrammeLevel> programmeLevelEnum, Double yearlyProgressUpper, Double yearlyProgressLower, Integer workoutListRepeats, Integer cycleLength, Workout... args) {
        this.name = name;
        this.programmeLevelEnum = programmeLevelEnum;
        this.yearlyProgressUpper = yearlyProgressUpper;
        this.yearlyProgressLower = yearlyProgressLower;
        this.workoutListRepeats = workoutListRepeats;
        this.cycleLength = cycleLength;
        this.completedWorkouts = new ArrayList<>();
        this.workouts = new ArrayList<>();
        Collections.addAll(workouts, args);
    }


}
