package com.karinastatinaite.myportfolio;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class ThirdProjectActivity extends AppCompatActivity {

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
                .load("https://i.postimg.cc/4Nbd8tx3/Screenshot-20210912-094731-Kyoto-days.jpg")
                .into(firstImage);
        ImageView secondImage = findViewById(R.id.second_image);
        Glide.with(this)
                .asBitmap()
                .load("https://i.postimg.cc/9M7XywkC/Screenshot-20210912-094745-Kyoto-days.jpg")
                .into(secondImage);
        TextView projectTitle = findViewById(R.id.project_title);
        projectTitle.setText("Kyoto Trip Guide");
        TextView projectDescription = findViewById(R.id.project_description);
        projectDescription.setText("When I was going on a short trip to Kyoto I wanted to have my itinerary handy at all times so I made an app for it.\nI practiced:");
        TextView projectLearned = findViewById(R.id.project_learned);
        projectLearned.setText("App Dependencies\nCard View settings\nArray Adapters\nRecycler View");
    }
}
