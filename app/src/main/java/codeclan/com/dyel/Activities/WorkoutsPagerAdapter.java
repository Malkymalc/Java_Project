package codeclan.com.dyel.Activities;

import android.os.Bundle;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import codeclan.com.dyel.Programmes.StartingStrength;
import codeclan.com.dyel.R;
import codeclan.com.dyel.Workout;

/**
 * Created by user on 10/01/2018.
 */

public class WorkoutsPagerAdapter extends FragmentStatePagerAdapter {

    public WorkoutsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = activeWorkout.get(position);
        Bundle args = new Bundle();
        args.putInt(activeWorkout.ARG_OBJECT, position);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public int getCount() {
        return activeWorkouts.size();
    }



    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.workouts_fragment, parent, false);
        }

        Workout currentWorkout = getItem(position);

        TextView workoutTitle = (TextView) listItemView.findViewById(R.id.workoutTitle);
        workoutTitle.setText(StartingStrength.getName() + " - " + currentWorkout.getName());

        TextView number = (TextView) findViewById(R.id.exercise1);
        number.setText(currentWorkout.getNumber().toString() + "/" + StartingStrenght.workouts.size().toString());

        TextView ex1 = (TextView) findViewById(R.id.exercise1);
        ex1.setText(currentWorkout.getExercise(1));

        TextView ex2 = (TextView) listItemView.findViewById(R.id.exercise2);
        ex2.setText(currentWorkout.getExercise(2));

        TextView ex3 = (TextView) findViewById(R.id.exercise3);
        ex3.setText(currentWorkout.getExercise(3));

        TextView notes = (TextView) findViewById(R.id.notes);
        notes.setText(currentWorkout.getNotes());

        listItemView.setTag(currentWorkout);

        return listItemView;
    }
}
