package codeclan.com.dyel.Programmes;

import java.io.Serializable;

import codeclan.com.dyel.Equipment;
import codeclan.com.dyel.Exercise;
import codeclan.com.dyel.Lift;
import codeclan.com.dyel.MovementPattern;
import codeclan.com.dyel.Programme;
import codeclan.com.dyel.ProgrammeLevel;
import codeclan.com.dyel.Reps;
import codeclan.com.dyel.Set;
import codeclan.com.dyel.SetRepScheme;
import codeclan.com.dyel.Workout;

/**
 * Created by user on 09/01/2018.
 */

public class StartingStrength implements Serializable {

    private Programme startingStrength;

    public void StartingStrength(){
         Reps fives = new Reps("five", 5, false, false);
         Set ssFives = new Set("ssFives", fives, 0.85);
         SetRepScheme startingStrength3x5 = new SetRepScheme("Starting Strength 3x5");

         Exercise backSquat = new Exercise("Back Squat", MovementPattern.SQUAT, Equipment.BARBELL);
         Exercise deadLift = new Exercise("Deadlift", MovementPattern.HINGE, Equipment.BARBELL);
         Exercise bench = new Exercise("Bench Press", MovementPattern.HORIZONTAL_PUSH, Equipment.BARBELL);
         Exercise press = new Exercise("Press", MovementPattern.VERTICAL_PUSH, Equipment.BARBELL);
         Exercise powerClean = new Exercise("Power Clean", MovementPattern.HORIZONTAL_PULL, Equipment.BARBELL);

         Lift ssBackSquat = new Lift(backSquat, startingStrength3x5);
         Lift ssDeadLift = new Lift(deadLift, startingStrength3x5);
         Lift ssBench = new Lift(bench, startingStrength3x5);
         Lift ssPress = new Lift(press, startingStrength3x5);
         Lift ssPowerClean = new Lift(powerClean, startingStrength3x5);

         Workout ssA = new Workout("Starting Strength A",ssBackSquat, ssBench, ssPowerClean );
         Workout ssB = new Workout("Starting Strength B", ssBackSquat, ssPress, ssDeadLift);

        this.startingStrength = new Programme ("Starting Strength", ProgrammeLevel.BEGINER, 195.0, 390.0, 2, 2, ssA, ssB);
    }

    public Programme getProgramme(){
        return startingStrength;
    }
}
