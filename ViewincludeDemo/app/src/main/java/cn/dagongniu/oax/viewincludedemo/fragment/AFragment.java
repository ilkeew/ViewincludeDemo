package cn.dagongniu.oax.viewincludedemo.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import cn.dagongniu.oax.viewincludedemo.R;

public class AFragment extends android.support.v4.app.Fragment {
    View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.afragment, container, false);
        view.findViewById(R.id.bt_fragmenta).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "C---AFragment::::Fragment", Toast.LENGTH_LONG).show();
            }
        });
        return view;

    }


}
