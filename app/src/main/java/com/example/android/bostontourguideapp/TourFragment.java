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
public class TourFragment extends Fragment {

    public TourFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final ArrayList<Item> items = new ArrayList<>();
        final View rootView = inflater.inflate(R.layout.list, container, false);

        // Info from TripAdvisor.com
        items.add(new Item(getString(R.string.duck_tours), getString(R.string.duck_tours_address), getString(R.string.duck_tours_phone), getString(R.string.duck_tours_website), R.drawable.duck, getString(R.string.duck_tours_info)));
        items.add(new Item(getString(R.string.harbor_cruises), getString(R.string.harbour_cruises_address), getString(R.string.harbor_cruises_phone), getString(R.string.harbor_cruises_website), R.drawable.harbor, getString(R.string.harbor_cruises_info)));
        items.add(new Item(getString(R.string.freedom_trail), getString(R.string.freedom_trail_address), getString(R.string.freedom_trail_phone), getString(R.string.freedom_trail_website), R.drawable.freedom, getString(R.string.freedom_trail_info)));

        ItemAdapter adapter = new ItemAdapter(getActivity(), items);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
