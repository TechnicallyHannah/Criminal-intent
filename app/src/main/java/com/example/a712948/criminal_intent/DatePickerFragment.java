package com.example.a712948.criminal_intent;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;

/**
 * @author Hannah Paulson
 * @since 1/25/16.
 */
public class DatePickerFragment extends android.support.v4.app.DialogFragment {
    public Dialog onCreateDialog(Bundle bundle) {
        return new AlertDialog.Builder(getActivity())
                .setTitle(R.string.date_picker_title)
                .setPositiveButton(android.R.string.ok, null)
                .create();
    }
}
