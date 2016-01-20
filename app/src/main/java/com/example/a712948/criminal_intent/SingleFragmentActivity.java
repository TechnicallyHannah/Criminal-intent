package com.example.a712948.criminal_intent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

/**
 * @author Hannah Paulson
 * @since 12/29/15.
 */
public abstract class SingleFragmentActivity extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.container);
        if (fragment == null) {
            fragment = new CrimeFragment();
            fm.beginTransaction().add(R.id.container, fragment).commit();
        }
    }
}
