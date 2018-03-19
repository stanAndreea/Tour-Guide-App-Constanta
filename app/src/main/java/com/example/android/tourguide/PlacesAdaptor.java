package com.example.android.tourguide;


import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PlacesAdaptor extends ArrayAdapter<Places> {
    public PlacesAdaptor(Context context, List<Places> placesList) {
        super(context, 0, placesList);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_places, parent, false);
        }
        Places currentPlaces = getItem(position);
        ImageView imageOfPlaces = listItemView.findViewById(R.id.image_places);

        imageOfPlaces.setImageResource(currentPlaces.getImageOfPlaces());


        TextView nameOfPlaces = listItemView.findViewById(R.id.name_text_view);
        nameOfPlaces.setText(currentPlaces.getNamePlaces());

        TextView descriptionPlaces = listItemView.findViewById(R.id.description_text_view);
        descriptionPlaces.setText(currentPlaces.getDescriptionPlaces());


        return listItemView;
    }
}
