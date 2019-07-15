package com.buildbrothers.alc4challenge1;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        loadProfileImage();
    }

    //this method helps with loading profile photo from the assets folder
    private void loadProfileImage() {
        ImageView profileImageView = findViewById(R.id.profile_photo);
        try {
            // get input stream
            InputStream ims = getAssets().open("pius.jpg");
            // load image as Drawable
            Drawable d = Drawable.createFromStream(ims, null);
            // set image to ImageView
            profileImageView.setImageDrawable(d);
        }
        catch(IOException ex) {
            return;
        }
    }
}
