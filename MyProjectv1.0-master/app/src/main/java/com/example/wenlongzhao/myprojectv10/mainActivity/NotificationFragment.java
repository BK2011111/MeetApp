package com.example.wenlongzhao.myprojectv10.mainActivity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.wenlongzhao.myprojectv10.R;

/**
 * Created by Useradmin on 2017/4/5.
 */
public class NotificationFragment extends Fragment {

    public NotificationFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fg_content,container,false);
        TextView txt_content = (TextView) view.findViewById(R.id.txt_content);
        txt_content.setText("信息Fragment");
        return view;
    }
}
