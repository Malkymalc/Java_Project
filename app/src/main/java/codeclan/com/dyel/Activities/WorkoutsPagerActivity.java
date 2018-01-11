package codeclan.com.dyel.Activities;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

import codeclan.com.dyel.Programme;
import codeclan.com.dyel.Programmes.StartingStrength;
import codeclan.com.dyel.R;
import codeclan.com.dyel.Workout;

public class WorkoutsPagerActivity extends FragmentActivity {

    ViewPager mViewPager;
    private PagerAdapter mPagerAdapter;
    Programme programme;
    ArrayList<Workout> activeWorkouts;

    public WorkoutsPagerActivity(FragmentManager supportFragmentManager) {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workouts_pager);

        // Instantiate new programme
        this.programme = new StartingStrength().getProgramme();
        this.activeWorkouts = programme.getActiveWorkouts();

        // Get Intent Information


        // Grab the viewPager
        mViewPager = findViewById(R.id.viewPager);
        // Set the adapter of the pager to the adapter defined below
        mViewPager.setAdapter(new WorkoutsPagerAdapter(getSupportFragmentManager()));
    }
}
    // ViewPager adapter - defines behavior based on page number
















