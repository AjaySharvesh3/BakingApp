package com.sharvesh.flick.bakingapplication.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.sharvesh.flick.bakingapplication.R;
import com.sharvesh.flick.bakingapplication.fragments.RecipeDetailFragment;


public class RecipeDetailActivity extends AppCompatActivity  {

    private boolean mTwoPane;
    public static final String EXTRA_CURSOR_POSITION ="CursorPosition";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_detail);

        if (findViewById(R.id.container_Step) != null) {
            mTwoPane = true;
        } else {
            mTwoPane = false;
        }

        RecipeDetailFragment recipeDetailFragment = new RecipeDetailFragment();
        recipeDetailFragment.isTwoPane(mTwoPane);
        getSupportFragmentManager().beginTransaction()
                .add(R.id.container_Ingred, recipeDetailFragment)
                .commit();
    }}
