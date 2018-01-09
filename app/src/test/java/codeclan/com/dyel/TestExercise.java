package codeclan.com.dyel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * MVP
 * 1. Set workouts(SS), prepopulated, set meso-cycles like C25K
 * 2. User inputs stats on first load (and can view stats from button on menu thereafter)
 * 3. Taken straight to 1st/next workout on load thereafter
 * 4. User can start, record(mark lifts as complete), and mark workouts as complete
 * 5. All completed workouts in programme can be scrolled/viewed
 * 6. Weights for next workout pre-set based on last workout
 * 7. User can see basic numeric stats on lift 1RMs - start, now, difference for each lift
 *
 * EXTENSION
 * 1. Splash screen added
 * 2. User can change settings from button on menu
 * 3. User can update/record stats from button on menu
 * 4. User can see graphs of stats from button on menu (lifts, weight etc.)
 * 5. Data persistence
 *
 * ADVANCED EXTENSION
 * 1. User can select from different workout programmes
 * 2. Workout programme = fresh workout journal > can be browsed with summary info
 * 3. A programme completed = old workout journal > can be browsed with summary info
 * 4. User can toggle to birds-eye view of programmes / journals (current, past, new)
 * 5. Intro/help/guidance screens for lifts, workouts, programmes
 *
 * QUESTIONS / ISSUES
 * 1. java.time.DateTime not working (API level - change settings or use older class)
 * 2. How does ViewPager work?
 * 3. SetRep>Lift>Workout>Programme Class interaction?
 * 4.
 * 5.
 *
 * TO DO
 *   Classes / Backend
     * 1. Add User class
     * 2. Add Settings class
     * 3.
     * 4.
     * 5.
 *   Activities / UI
     * 1. Add User setup page
     * 2. Add Settings page
     * 3. Add Splash screen
     * 4.
     * 5.
 */



public class TestExercise {

    public Exercise exercise;

    @Before
    public void before(){
        exercise = new Exercise("Back Squat", MovementPattern.SQUAT, Equipment.BARBELL);
    }

    @Test
    public void canGetMovementPatternSubcategory(){
        assertEquals("Lower Body", exercise.getMovementPatternSub());
    }
}
