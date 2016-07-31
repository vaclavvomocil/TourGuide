package com.example.android.tourguide;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListItemAdapter extends ArrayAdapter<ListItem> {

    public ListItemAdapter(Context context, ArrayList<ListItem> listItem) {
        super(context, 0, listItem);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        ListItem currentListItem = getItem(position);

        TextView subjectTextView = (TextView) listItemView.findViewById(R.id.subject);
        subjectTextView.setText(currentListItem.getSubjectId());


        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description);
        descriptionTextView.setText(currentListItem.getDesriptionId());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentListItem.getImageId());

        return listItemView;
    }



}
