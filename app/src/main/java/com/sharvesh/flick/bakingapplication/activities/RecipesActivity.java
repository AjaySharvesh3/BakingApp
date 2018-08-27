package com.sharvesh.flick.bakingapplication.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.sharvesh.flick.bakingapplication.R;
import com.sharvesh.flick.bakingapplication.fragments.RecipesFragment;


public class RecipesActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipes);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new RecipesFragment())
                .commit();


    }

}
