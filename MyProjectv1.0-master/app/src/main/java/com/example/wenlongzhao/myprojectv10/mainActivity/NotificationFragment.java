package com.example.wenlongzhao.myprojectv10.mainActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.wenlongzhao.myprojectv10.R;
import com.example.wenlongzhao.myprojectv10.notification.NotificationActivity;

import java.lang.reflect.Field;

/**
 * Created by Useradmin on 2017/4/5.
 */
public class NotificationFragment extends Fragment {

    public NotificationFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_notification,container,false);

        RadioButton rBtnComment = (RadioButton) view.findViewById(R.id.radioBtnComment);
        rBtnComment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), NotificationActivity.class);
                startActivity(intent);
            }

    });
        return view;
    }


}
