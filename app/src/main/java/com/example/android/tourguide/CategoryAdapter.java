package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new GeneralPresentationFragment();
        } else if (position == 1) {
            return new HistoryFragment();
        } else if (position == 2) {
            return new EventsFragment();
        } else {
            return new MamaiaFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.title_activity_general);
        } else if (position == 1) {
            return mContext.getString(R.string.title_activity_history);
        } else if (position == 2) {
            return mContext.getString(R.string.title_activity_events);
        } else {
            return mContext.getString(R.string.title_activity_mamaia);
        }
    }
}
