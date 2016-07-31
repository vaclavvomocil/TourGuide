package com.example.android.tourguide;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class RestaurantFragment extends Fragment {


    public RestaurantFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        final ArrayList<ListItem> list = new ArrayList<ListItem>();
        list.add(new ListItem(R.string.subjectRestaurantA, R.string.descriptionRestaurantA));
        list.add(new ListItem(R.string.subjectRestaurantB, R.string.descriptionRestaurantB));
        list.add(new ListItem(R.string.subjectRestaurantC, R.string.descriptionRestaurantC));
        list.add(new ListItem(R.string.subjectRestaurantD, R.string.descriptionRestaurantD));

        ListItemAdapter adapter = new ListItemAdapter(getActivity(),list);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
