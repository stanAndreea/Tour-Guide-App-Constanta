package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class EventsFragment extends Fragment {


    public EventsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_places_plus_image, container, false);
        ImageView imageBackgroud = rootView.findViewById(R.id.background_image);
        imageBackgroud.setImageResource(R.drawable.navy_day);

        List<Places> eventsPlaces = new ArrayList<>();
        eventsPlaces.add(new Places(R.string.name_neversea, R.string.description_nerversea, R.drawable.event_nerverse));
        eventsPlaces.add(new Places(R.string.name_dakini, R.string.description_dakini, R.drawable.event_dakini));
        eventsPlaces.add(new Places(R.string.name_shells, R.string.description_shells, R.drawable.event_shells));
        eventsPlaces.add(new Places(R.string.name_navy, R.string.description_navy, R.drawable.navy_day));
        eventsPlaces.add(new Places(R.string.name_sunwaves, R.string.description_sunwaves, R.drawable.event_sunwaves));

        PlacesAdaptor adaptor = new PlacesAdaptor(getActivity(), eventsPlaces);
        ListView listView = rootView.findViewById(R.id.list_places);
        listView.setAdapter(adaptor);
        return rootView;
    }

}
