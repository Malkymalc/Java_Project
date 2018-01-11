package codeclan.com.dyel.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

import codeclan.com.dyel.R;
import codeclan.com.dyel.UserProfile;

public class UserDetailsActivity extends AppCompatActivity {

    private EditText name;
    private EditText dob;
    private RadioGroup genderRadioGroup;
    private EditText height;
    private RadioGroup heightRadioGroup;
    private EditText weight;
    private RadioGroup weightRadioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.nameInput);
        dob = findViewById(R.id.dobInput);
        genderRadioGroup = findViewById(R.id.genderRadio);
        height = findViewById(R.id.heightInput);
        heightRadioGroup = findViewById(R.id.heightRadio);
        weight = findViewById(R.id.weightInput);
        weightRadioGroup = findViewById(R.id.weightRadio);
    }


    public void onSubmit(View v){

        // Convert field inputs to correct types for creating user profile
        String nameInput = name.getText().toString();
        String dobInput = dob.getText().toString();
        Double heightInput = Double.parseDouble(height.getText().toString());
        Double weightInput = Double.parseDouble(weight.getText().toString());
        int genderId = genderRadioGroup.getCheckedRadioButtonId();
        String genderInput = findViewById(genderId).toString();
        int heightUnitId = heightRadioGroup.getCheckedRadioButtonId();
        String heightUnitInput = findViewById(heightUnitId).toString();
        int weightUnitId = weightRadioGroup.getCheckedRadioButtonId();
        String weightUnitInput = findViewById(weightUnitId).toString();

        //Create new user profile
        UserProfile userProfile = new UserProfile(nameInput, dobInput, genderInput,
                heightInput, weightInput, heightUnitInput, weightUnitInput);

        //Pass user profile through to next screen
        Intent intent = new Intent();
        intent.putExtra("userProfile", userProfile);
        startActivity(intent);
    }
}
