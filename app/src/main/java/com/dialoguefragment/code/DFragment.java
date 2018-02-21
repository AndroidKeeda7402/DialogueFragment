package com.dialoguefragment.code;

/**
 * Created by 43065 on 2/21/2018.
 */

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DFragment extends DialogFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.dialogfragment, container,
                false);
        getDialog().setTitle("DialogFragment Tutorial");
        // Do something else
        return rootView;
    }
}
