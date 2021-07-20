package com.unn.mvpdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {


    private static final String TAG = "WelcomeActivity";
    ImageView profileImageView;
    TextView nameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        profileImageView = findViewById(R.id.welcome_imgview);
        nameTextView = findViewById(R.id.name_txtview);
        int imageResource = getResources().getIdentifier("@drawable/hcat", null, this.getPackageName());
        profileImageView.setImageResource(imageResource);
        Bundle extras = getIntent().getExtras();
        String userName = "";
        if (extras != null) {
            userName = extras.getString("Extra_message");
            // and get whatever type user account id is
        }
        nameTextView.setText(userName);

        Log.v(TAG,userName);

    }
}