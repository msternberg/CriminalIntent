package com.example.mattsternberg.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Matt Sternberg on 8/5/2016.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
