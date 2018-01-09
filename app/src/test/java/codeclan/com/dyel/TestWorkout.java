package codeclan.com.dyel;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by user on 09/01/2018.
 */

public class TestWorkout {
    public Reps fives = new Reps("five", 5, false, false);
    public Set ssFives = new Set("ssFives", fives, 0.85);
    public SetRepScheme startingStrength3x5 = new SetRepScheme("Starting Strength 3x5");
    public Exercise backSquat = new Exercise("Back Squat", MovementPattern.SQUAT, Equipment.BARBELL);
    public Exercise deadlift = new Exercise("Deadlift", MovementPattern.HINGE, Equipment.BARBELL);
    public Exercise bench = new Exercise("Bench Press", MovementPattern.HORIZONTAL_PUSH, Equipment.BARBELL);
    public Exercise press = new Exercise("Press", MovementPattern.VERTICAL_PUSH, Equipment.BARBELL);
    public Exercise pullup = new Exercise("Pull-up", MovementPattern.VERTICAL_PULL, Equipment.BODYWEIGHT);
    public Exercise powerClean = new Exercise("Power Clean", MovementPattern.HORIZONTAL_PULL, Equipment.BARBELL);
    public Lift ssBackSquat = new Lift(backSquat, startingStrength3x5);
    public Lift ssDeadlift = new Lift(deadlift, startingStrength3x5);
    public Lift ssBench = new Lift(bench, startingStrength3x5);
    public Lift ssPress = new Lift(press, startingStrength3x5);
    public Lift ssPullup = new Lift(pullup, startingStrength3x5);
    public Lift ssPowerClean = new Lift(powerClean, startingStrength3x5);
    public Workout ssA = new Workout("Starting Strength A", ssBackSquat, ssBench, ssPowerClean);
    public Workout ssB = new Workout("Starting Strength B", ssBackSquat, ssPress, ssDeadlift);
    public Programme startingStrength = new Programme ();

    @Before
    public void before(){

    }

    @Test
    public void canGetWorkoutSummary(){

    }

    @Test
    public void canStartAndEndWorkout(){

    }

    @Test
    public void canAddWorkoutNotes(){

    }
}
