package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ListItem {


    private int mSubjectId;
    private int mDesriptionId;
    private int mImageId;

    public ListItem(int subjectId, int descriptionId) {
        mSubjectId = subjectId;
        mDesriptionId = descriptionId;
    }

    public ListItem(int subjectId, int descriptionId, int imageId) {
        mSubjectId = subjectId;
        mDesriptionId = descriptionId;
        mImageId = imageId;
    }

    public int getSubjectId() {
        return mSubjectId;
    }

    public int getDesriptionId() {
        return mDesriptionId;
    }

    public int getImageId() {
        return mImageId;
    }

}
