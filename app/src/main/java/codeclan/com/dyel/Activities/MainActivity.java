package codeclan.com.dyel.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.RadioGroup;

import codeclan.com.dyel.R;

public class MainActivity extends AppCompatActivity {

    private EditText name;
    private DatePicker dob;
    private RadioGroup gender;
    private NumberPicker height;
    private RadioGroup

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onSubmit(View v){

    }
}
