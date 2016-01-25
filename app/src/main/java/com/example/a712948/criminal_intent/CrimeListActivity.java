package com.example.a712948.criminal_intent;

import android.support.v4.app.Fragment;

/**
 * @author Hannah Paulson
 * @since 1/20/16.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
