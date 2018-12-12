package com.example.vsvll.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;



public class programmingRecyclerView extends RecyclerView.Adapter<programmingRecyclerView.myViewHolder> {

    //here we will create a constructor

    String[] data;
    programmingRecyclerView(String[] Data){

        this.data = Data;

    }


    @Override
    public myViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        //Here we will inflate the data

        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());

        //here the source file of the view has been sent to access on View holder.
        View view = layoutInflater.inflate(R.layout.data,viewGroup,false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder( myViewHolder myViewHolder, int i) {

        //here it gives the position of the each view
        String position = data[i];
        myViewHolder.textView.setText(position);
    }

    @Override
    public int getItemCount() {

        // Here we need to return the length of the data
        return data.length;
    }

    //Now I will create an inner class for View holder
    public class myViewHolder extends RecyclerView.ViewHolder {

        //here we will have 2 fields (Image and textField)
        ImageView imageView;
        TextView textView;

        //Now I will create and constructor to access the id of the 2 fields above
        myViewHolder(View view) {
            super(view);

            imageView = view.findViewById(R.id.imageView);
            textView = view.findViewById(R.id.textView);

        }

    }
}
