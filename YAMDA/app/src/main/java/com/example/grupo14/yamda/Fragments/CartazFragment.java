package com.example.grupo14.yamda.Fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.grupo14.yamda.R;

/**
 * Created by imarcinschi on 10/29/2015.
 */
public class CartazFragment extends Fragment {

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.v("YAMDA", "CartazFragment - onAttach ");

    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Log.v("YAMDA", "CartazFragment - onViewCreated ");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.v("YAMDA", "CartazFragment - onCreateView ");
        return  inflater.inflate(R.layout.estreia_list, container, false);

    }
}
