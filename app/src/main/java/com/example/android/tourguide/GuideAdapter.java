package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

public class GuideAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public GuideAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    public Fragment getItem(int position) {
        if (position == 0) {
            return new MuseumFragment();
        } else if (position == 1) {
            return new RestaurantFragment();
        } else if (position == 2) {
            return new TheatherFragment();
        } else {
            return new UndergroudFragment();
        }
    }


    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.museum);
        } else if (position == 1) {
            return mContext.getString(R.string.restaurant);
        } else if (position == 2) {
            return mContext.getString(R.string.theather);
        } else {
            return mContext.getString(R.string.underground);
        }
    }

}
