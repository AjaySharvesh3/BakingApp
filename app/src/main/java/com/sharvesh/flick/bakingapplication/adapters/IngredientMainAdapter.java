package com.sharvesh.flick.bakingapplication.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sharvesh.flick.bakingapplication.R;
import com.sharvesh.flick.bakingapplication.models.Ingredients;

import java.util.ArrayList;


public class IngredientMainAdapter extends RecyclerView.Adapter<IngredientMainAdapter.IngredientMainAdapterViewHolder>{

    int Position ;
    private ArrayList<Ingredients> mIngredient;
    private Context mContex;


    public IngredientMainAdapter(Context context, ArrayList<Ingredients> ArrayList) {
        this.mContex=context;
        this.mIngredient=ArrayList;
    }

    public class IngredientMainAdapterViewHolder extends RecyclerView.ViewHolder   {


        public TextView mDetailTextView;


        public IngredientMainAdapterViewHolder(View view) {
            super(view);
            mDetailTextView = (TextView) view.findViewById(R.id.recipe_Ingredients);
        }


    }

    @Override
    public IngredientMainAdapter.IngredientMainAdapterViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        Context context = viewGroup.getContext();
        int layoutIdForListItem = R.layout.recycle_view_ingre_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutIdForListItem, viewGroup, shouldAttachToParentImmediately);
        return new IngredientMainAdapter.IngredientMainAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(IngredientMainAdapterViewHolder holder, int position) {
        Ingredients ingredients=mIngredient.get(position);
        holder.mDetailTextView.setText(ingredients.getQuantity()+" "+ingredients.getMeasure()+" of "+ingredients.getIngredient());

    }




    @Override
    public int getItemCount() {
        if (null == mIngredient)
            return 0;
        return mIngredient.size();
    }



}
