package com.example.android.bostontourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PlayFragment extends Fragment {

    public PlayFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final ArrayList<Item> items = new ArrayList<>();
        final View rootView = inflater.inflate(R.layout.list, container, false);

        // Info from TripAdvisor.com
        items.add(new Item(getString(R.string.charles_river), getString(R.string.charles_river_address), getString(R.string.charles_river_phone), getString(R.string.charles_river_website), R.drawable.charles_river, getString(R.string.charles_river_info)));
        items.add(new Item(getString(R.string.boston_common), getString(R.string.boston_common_address), getString(R.string.boston_common_phone), getString(R.string.boston_common_website), R.drawable.boston_common, getString(R.string.boston_common_info)));
        items.add(new Item(getString(R.string.neaquarium), getString(R.string.neaquarium_address), getString(R.string.neaquarium_phone), getString(R.string.neaquarium_website), R.drawable.neaquarium, getString(R.string.neaquarium_info)));

        ItemAdapter adapter = new ItemAdapter(getActivity(), items);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
