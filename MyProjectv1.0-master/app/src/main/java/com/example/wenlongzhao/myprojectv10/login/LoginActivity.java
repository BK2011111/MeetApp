package com.example.wenlongzhao.myprojectv10.login;

import android.app.Fragment;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.wenlongzhao.myprojectv10.R;
import com.example.wenlongzhao.myprojectv10.mainActivity.MainContentActivity;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener ,LoginFragment.LoginListener {
    private Button login , register;
    private Fragment fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login = (Button) findViewById(R.id.btnlogin);
        register= (Button) findViewById(R.id.btnregister);
        login.setOnClickListener(this);
        register.setOnClickListener(this);
        fragment = new LoginFragment();
        login.setTextColor(0xFF0000FF);
        getFragmentManager().beginTransaction().replace(R.id.frag_login, fragment).commit();
    }
    @Override
    public void onClick(View v) {
       // Fragment fragLayout = null;
        switch (v.getId()) {
            case R.id.btnlogin:
              //  fragLayout = new LoginFragment();
                login.setTextColor(0xFF0000FF);
                register.setTextColor(0xFF000000);
                break;
            case R.id.btnregister:
              //  fragLayout = new RegisterFragment();
                register.setTextColor(0xFF0000FF);
                login.setTextColor(0xFF000000);

                Intent rIntent = new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(rIntent);
                break;
        }
       // getFragmentManager().beginTransaction().replace(R.id.frag, fragLayout).commit();
    }

    public void login(int index){
        if (index==1)
        {
            Intent intent = new Intent(LoginActivity.this,MainContentActivity.class);
            intent.setPackage(this.getPackageName());
            startActivity(intent);
            this.finish();
        }
    }





}
