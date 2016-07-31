package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class UndergroudFragment extends Fragment {

    public UndergroudFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        final ArrayList<ListItem> list = new ArrayList<ListItem>();
        list.add(new ListItem(R.string.subjectUndergroundA, R.string.descriptionUndergroundA));
        list.add(new ListItem(R.string.subjectUndergroundB, R.string.descriptionUndergroundB));
        list.add(new ListItem(R.string.subjectUndergroundC, R.string.descriptionUndergroundC));
        list.add(new ListItem(R.string.subjectUndergroundD, R.string.descriptionUndergroundD));

        ListItemAdapter adapter = new ListItemAdapter(getActivity(),list);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
