package com.example.drake.ratecatz;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class SettingsActivity extends AppCompatActivity {

    //private RadioGroup mRadioGroupCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        //mRadioGroupCategory = (RadioGroup)findViewById(R.id.rg_category);
    }

}
