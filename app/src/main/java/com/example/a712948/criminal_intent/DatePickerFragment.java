package com.example.a712948.criminal_intent;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;

/**
 * @author Hannah Paulson
 * @since 1/25/16.
 */
public class DatePickerFragment extends android.support.v4.app.DialogFragment {
    public Dialog onCreateDialog(Bundle bundle) {
        View v = LayoutInflater.from(getActivity()).inflate(R.layout.dialog_date, null);

        return new AlertDialog.Builder(getActivity())
                .setView(v)
                .setTitle(R.string.date_picker_title)
                .setPositiveButton(android.R.string.ok, null)
                .create();
    }
}
