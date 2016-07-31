package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MuseumFragment extends Fragment {


    public MuseumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        final ArrayList<ListItem> list = new ArrayList<ListItem>();
        list.add(new ListItem(R.string.subjectKafka, R.string.descriptionKafka,
                R.drawable.kafka_museum));
        list.add(new ListItem(R.string.subjectNarodni, R.string.descriptionNarodni,
                R.drawable.narodni_muzeum));
        list.add(new ListItem(R.string.subjectNarodniTechnicke, R.string.descriptionNarodniTechnicke,
                R.drawable.narodni_technicke_museum));
        list.add(new ListItem(R.string.subjectPrague, R.string.descriptionPrague,
                R.drawable.prague_museum));

        ListItemAdapter adapter = new ListItemAdapter(getActivity(),list);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
