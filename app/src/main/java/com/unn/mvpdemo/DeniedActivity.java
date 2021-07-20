package com.unn.mvpdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class DeniedActivity extends AppCompatActivity {

    ImageView deniedImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_denied);
        deniedImageView = findViewById(R.id.denied_imgview);

        int imageResource = getResources().getIdentifier("@drawable/cat2", null, this.getPackageName());
        deniedImageView.setImageResource(imageResource);
    }
}