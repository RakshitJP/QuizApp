package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton selectedRadioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = findViewById(R.id.radioGroup);
    }

    public void onsubmit(View view){
        int selectedRadioButtonId = radioGroup.getCheckedRadioButtonId();
        selectedRadioButton = findViewById(selectedRadioButtonId);

        if (selectedRadioButtonId != -1) {
            if(selectedRadioButtonId == R.id.radioButton2){
                Toast.makeText(getApplicationContext(),"Answer is Right",Toast.LENGTH_LONG).show();
            }
            else{
                Toast.makeText(getApplicationContext(),"Answer is Wrong",Toast.LENGTH_LONG).show();
            }
        } else {
            Toast.makeText(getApplicationContext(), "Nothing selected from the radio group", Toast.LENGTH_LONG).show();
        }
    }


}