package com.example.jinadiwathsala.mytabapplication;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Jinadi Wathsala on 4/5/2018.
 */

public class tab3 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View myview = inflater.inflate(R.layout.tab3_frag,container,false);
        return myview;
    }
}
