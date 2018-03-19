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
public class HistoryFragment extends Fragment {


    public HistoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_places_plus_image, container, false);
        ImageView imageBackground = rootView.findViewById(R.id.background_image);
        imageBackground.setImageResource(R.drawable.history_constanta);

        List<Places> historyPlaces = new ArrayList<>();
        historyPlaces.add(new Places(R.string.name_ancient_constanta, R.string.description_ancient, R.drawable.history_map_ancient_constanta));
        historyPlaces.add(new Places(R.string.lighthouse, R.string.description_lighthouse, R.drawable.history_lighthouse_genovez));
        historyPlaces.add(new Places(R.string.name_histria, R.string.description_histria, R.drawable.history_fortress_histria));
        historyPlaces.add(new Places(R.string.name_port, R.string.description_port, R.drawable.history_port));
        historyPlaces.add(new Places(R.string.name_casino, R.string.description_cazino, R.drawable.history_cazino));

        PlacesAdaptor adaptor = new PlacesAdaptor(getActivity(), historyPlaces);
        ListView listView = rootView.findViewById(R.id.list_places);
        listView.setAdapter(adaptor);
        return rootView;
    }

}
