package com.karinastatinaite.myportfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class SixthProjectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        findViews();

    }

    private void findViews() {
        ImageView firstImage = findViewById(R.id.first_image);
        Glide.with(this)
                .asBitmap()
                .load("https://i.postimg.cc/63mJwgkM/Screenshot-20210912-151109-Karina-Statinaite-Portfolio.jpg")
                .into(firstImage);
        ImageView secondImage = findViewById(R.id.second_image);
        Glide.with(this)
                .asBitmap()
                .load("https://i.postimg.cc/90w3f1VC/Screenshot-20210912-151123-Karina-Statinaite-Portfolio.jpg")
                .into(secondImage);
        TextView projectTitle = findViewById(R.id.project_title);
        projectTitle.setText("Portfolio");
        TextView projectDescription = findViewById(R.id.project_description);
        projectDescription.setText("I created this portfolio application to display my progress. Challenged myself in finding a best practice way of opening different Activities from items in the Recycler View.\nI practiced:");
        TextView projectLearned = findViewById(R.id.project_learned);
        projectLearned.setText("Java\nRecycler View\nExplicit Intents\nGlide\nCircle Image View");
    }
}
