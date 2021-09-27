package com.karinastatinaite.myportfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class SecondProject extends AppCompatActivity {

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
                .load("https://i.postimg.cc/1RD5t66K/Screenshot-20210912-094652-Things-to-See-in-Aichi-Prefecture.jpg")
                .into(firstImage);
        ImageView secondImage = findViewById(R.id.second_image);
        Glide.with(this)
                .asBitmap()
                .load("https://i.postimg.cc/90HmbF3T/Screenshot-20210912-094701-Things-to-See-in-Aichi-Prefecture.jpg")
                .into(secondImage);
        TextView projectTitle = findViewById(R.id.project_title);
        projectTitle.setText("Aichi Prefecture Guide");
        TextView projectDescription = findViewById(R.id.project_description);
        projectDescription.setText("After living in Aichi for almost a year I wanted to make an app with which I could share my favorite spots in the prefecture.\nI learned:");
        TextView projectLearned = findViewById(R.id.project_learned);
        projectLearned.setText("Actvities\nClasses & Objects\nArrays\nIntents\nCard View\nRecycler View");
    }
}