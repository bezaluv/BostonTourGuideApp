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
public class EatFragment extends Fragment {

    public EatFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final ArrayList<Item> items = new ArrayList<>();
        final View rootView = inflater.inflate(R.layout.list, container, false);

        // Info from TripAdvisor.com
        items.add(new Item(getString(R.string.antico_forno), getString(R.string.antico_forno_address), getString(R.string.antico_forno_phone), getString(R.string.antico_forno_website), R.drawable.antico_forno, getString(R.string.antico_forno_info)));
        items.add(new Item(getString(R.string.legal_sea_foods), getString(R.string.legal_sea_foods_address), getString(R.string.legal_sea_foods_phone), getString(R.string.legal_sea_foods_website), R.drawable.legal_sea_foods, getString(R.string.legal_sea_foods_info)));
        items.add(new Item(getString(R.string.boston_chops), getString(R.string.Boston_chops_address), getString(R.string.boston_chops_phone), getString(R.string.boston_chops_website), R.drawable.boston_chops, getString(R.string.boston_chops_info)));

        ItemAdapter adapter = new ItemAdapter(getActivity(), items);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
