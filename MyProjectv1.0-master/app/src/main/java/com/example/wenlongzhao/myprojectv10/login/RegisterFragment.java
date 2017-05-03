package com.example.wenlongzhao.myprojectv10.login;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.wenlongzhao.myprojectv10.R;

/**
 * Created by Useradmin on 2017/4/5.
 */

public class RegisterFragment extends Fragment {

    private RegisterListener registerListener;
    Button btnRegister;


    public interface RegisterListener{
        void register(int index);
    }

    @Override
    public void onAttach(Context context)
    {

        registerListener = (RegisterFragment.RegisterListener) context;
        super.onAttach(context);
    }
    public void onResume()
    {
        super.onResume();
        btnRegister = (Button)getActivity().findViewById(R.id.register);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerListener.register(1);
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_register, container, false);
        return view;
    }
}
