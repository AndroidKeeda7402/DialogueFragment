package com.dialoguefragment.code;

/**
 * Created by 43065 on 2/21/2018.
 */
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

public class AlertDFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new AlertDialog.Builder(getActivity())
                // Set Dialog Icon
                .setIcon(R.mipmap.ic_launcher_round)
                // Set Dialog Title
                .setTitle("Alert DialogFragment")
                // Set Dialog Message
                .setMessage("Alert DialogFragment Tutorial")

                // Positive button
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // Do something else
                    }
                })

                // Negative Button
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,	int which) {
                        // Do something else
                    }
                }).create();
    }
}