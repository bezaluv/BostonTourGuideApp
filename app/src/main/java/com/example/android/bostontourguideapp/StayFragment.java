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
public class StayFragment extends Fragment {

    public StayFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final ArrayList<Item> items = new ArrayList<>();
        final View rootView = inflater.inflate(R.layout.list, container, false);

        // Info from TripAdvisor.com
        items.add(new Item(getString(R.string.omni_parker_house), getString(R.string.omni_address), getString(R.string.omni_phone), getString(R.string.omni_website), R.drawable.omniparkerhouse, getString(R.string.omni_info)));
        items.add(new Item(getString(R.string.marlowe), getString(R.string.marlowe_address), getString(R.string.marlowe_phone), getString(R.string.marlowe_website), R.drawable.marlow, getString(R.string.marlowe_info)));
        items.add(new Item(getString(R.string.ames), getString(R.string.ames_address), getString(R.string.ames_phone), getString(R.string.ames_website), R.drawable.ames, getString(R.string.ames_info)));

        ItemAdapter adapter = new ItemAdapter(getActivity(), items);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
