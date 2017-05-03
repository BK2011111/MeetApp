package com.example.wenlongzhao.myprojectv10.login;


import android.app.Fragment;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.wenlongzhao.myprojectv10.R;
import com.example.wenlongzhao.myprojectv10.mainActivity.MainContentActivity;

public class RegisterActivity extends AppCompatActivity implements RegisterFragment.RegisterListener{

    Fragment registerFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        registerFragment = new RegisterFragment();
        getFragmentManager().beginTransaction().replace(R.id.frag_register, registerFragment).commit();
    }

    public void register(int index){

        if (index==1)
        {
            Intent intent = new Intent(RegisterActivity.this,LoginActivity.class);
            intent.setPackage(this.getPackageName());
            startActivity(intent);
            this.finish();
        }
    }


}
