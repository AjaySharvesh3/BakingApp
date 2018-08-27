package com.sharvesh.flick.bakingapplication.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.sharvesh.flick.bakingapplication.R;
import com.sharvesh.flick.bakingapplication.fragments.StepsDetailFragment;


public class StepsDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_steps_detail);


        getSupportFragmentManager().beginTransaction()
                .add(R.id.container_Step, new StepsDetailFragment())
                .commit();
    }

}
