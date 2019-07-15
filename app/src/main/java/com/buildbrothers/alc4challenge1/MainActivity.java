package com.buildbrothers.alc4challenge1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //method to start profile activity when profile button is tapped
    public void gotoProfile(View view) {
        startActivity(new Intent(this, ProfileActivity.class));
    }

    //method to start about activity when about button is tapped
    public void gotoAbout(View view) {
        startActivity(new Intent(this, AboutActivity.class));
    }
}
