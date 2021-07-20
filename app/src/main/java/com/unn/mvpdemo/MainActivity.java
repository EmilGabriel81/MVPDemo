package com.unn.mvpdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Contract.IView{

    private static final String TAG = "MainActivity";
    EditText email_txt, password_txt;
    Button login_btn;
    Contract.IPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email_txt = findViewById(R.id.email);
        password_txt = findViewById(R.id.password);
        login_btn = findViewById(R.id.btn_login);

        presenter = new Presenter(this);
        login_btn.setOnClickListener((View v) -> {
            String email = email_txt.getText().toString();
            String password = password_txt.getText().toString();
            performLogin(email, password);
        });

    }

    private void performLogin(String email, String password) {
        presenter.doLogin(email,password);
    }


    @Override
    public void onSuccess(String message) {
        //Toast toast = Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
        Log.v(TAG,message);
        Intent intent = new Intent(this,WelcomeActivity.class);
        String name = email_txt.getText().toString();
        intent.putExtra("Extra_message", name);
        startActivity(intent);
    }

    @Override
    public void onError(String message) {
        Log.v(TAG,message);
        Intent intent = new Intent(this,DeniedActivity.class);
        startActivity(intent);
    }
}