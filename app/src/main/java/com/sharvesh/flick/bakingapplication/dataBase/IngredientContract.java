package com.sharvesh.flick.bakingapplication.dataBase;

import android.net.Uri;
import android.provider.BaseColumns;

public class IngredientContract {

    public static final String AUTHORITY = "com.sharvesh.flick.bakingapplication";


    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + AUTHORITY);

    public static final String PATH_INGREDIENTS = "ingredients";


    public static final class IngredientEntry implements BaseColumns {

        public static final Uri CONTENT_URI =
                BASE_CONTENT_URI.buildUpon().appendPath(PATH_INGREDIENTS).build();

        public static final String TABLE_NAME = "ingredients";
        public static final String COLUMN_INGREDIENTS_RECIPE_ID = "recipeID";
        public static final String COLUMN_INGREDIENTS_RECIPE_NAME = "recipeName";
        public static final String COLUMN_INGREDIENTS_QUANTITY= "quantity";
        public static final String COLUMN_INGREDIENTS_MEASURE= "measure";
        public static final String COLUMN_INGREDIENTS_INGREDIENT= "ingredient";

    }
}
