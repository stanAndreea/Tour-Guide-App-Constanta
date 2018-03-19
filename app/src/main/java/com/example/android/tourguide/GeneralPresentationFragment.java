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


public class GeneralPresentationFragment extends Fragment {

    public GeneralPresentationFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_places_plus_video, container, false);

        VideoView videoView = rootView.findViewById(R.id.video_view);
        Uri uri = Uri.parse("android.resource://" + getContext().getPackageName() + "/" + R.raw.cazino);
        videoView.setVideoURI(uri);
        videoView.start();

        MediaController mediaController = new MediaController(getActivity());
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.requestFocus();

        List<Places> generalThings = new ArrayList<>();
        generalThings.add(new Places(R.string.general_name_constanta, R.string.general_description_constanta, R.drawable.color_run));
        generalThings.add(new Places(R.string.general_name_mamaia, R.string.general_description_mamaia, R.drawable.terase));
        generalThings.add(new Places(R.string.name_casino, R.string.general_description_casino, R.drawable.cazino));
        generalThings.add(new Places(R.string.general_name_shopping, R.string.general_description_shopping, R.drawable.city));

        PlacesAdaptor adaptor = new PlacesAdaptor(getActivity(), generalThings);
        ListView listView = rootView.findViewById(R.id.list_general);
        listView.setAdapter(adaptor);
        return rootView;
    }


}
