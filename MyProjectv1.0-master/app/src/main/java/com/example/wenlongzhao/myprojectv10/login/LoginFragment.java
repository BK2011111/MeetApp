package com.example.wenlongzhao.myprojectv10.login;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.wenlongzhao.myprojectv10.R;

/**
 * Created by Useradmin on 2017/4/5.
 */

public class LoginFragment extends Fragment {
     //Activity和Fragment进行交互的接口
    public interface LoginListener
     {
        void login(int index);
     }

     private LoginListener myListener;
     private Button btn1;
    @Override
    public void onAttach(Activity activity)
    {
        System.out.println("123");
        myListener = (LoginFragment.LoginListener) activity;
        if(myListener==null){
            System.out.println("122");
        }
        super.onAttach(activity);
    }
    public void onResume()
    {
        super.onResume();
        btn1 = (Button)getActivity().findViewById(R.id.login);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("111");
               myListener.login(1);

            }
        });
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        return view;
    }
}
