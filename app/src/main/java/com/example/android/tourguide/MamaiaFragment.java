package com.example.android.tourguide;


import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.VideoView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class MamaiaFragment extends Fragment {


    public MamaiaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_places_plus_video, container, false);

        VideoView videoView = rootView.findViewById(R.id.video_view);
        Uri uri = Uri.parse("android.resource://" + getContext().getPackageName() + "/" + R.raw.mamaia);
        videoView.setVideoURI(uri);
        videoView.start();

        MediaController mediaController = new MediaController(getActivity());
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.requestFocus();

        List<Places> mamaiaPlaces = new ArrayList<>();
        mamaiaPlaces.add(new Places(R.string.name_aqua, R.string.description_aqua, R.drawable.aqua_magic_mamaia));
        mamaiaPlaces.add(new Places(R.string.name_beach, R.string.description_beach, R.drawable.beach_mamaia));
        mamaiaPlaces.add(new Places(R.string.name_fratelli, R.string.description_fratelli, R.drawable.fratelli_mamaia));
        mamaiaPlaces.add(new Places(R.string.name_phoenicia, R.string.description_phoenicia, R.drawable.phoenicia_mamaia));
        mamaiaPlaces.add(new Places(R.string.name_vega, R.string.description_vega, R.drawable.vega));

        PlacesAdaptor adaptor = new PlacesAdaptor(getActivity(), mamaiaPlaces);
        ListView listView = rootView.findViewById(R.id.list_general);

        listView.setAdapter(adaptor);
        return rootView;
    }

}
