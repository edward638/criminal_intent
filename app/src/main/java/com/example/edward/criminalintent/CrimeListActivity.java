package com.example.edward.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by edwar on 3/18/2018.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
