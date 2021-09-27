package com.karinastatinaite.myportfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class FourthProjectActivity extends AppCompatActivity {

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
                .load("https://i.postimg.cc/8zpCx57m/Screenshot-20210912-094805-Pick-Your-Own-Story.jpg")
                .into(firstImage);
        ImageView secondImage = findViewById(R.id.second_image);
        Glide.with(this)
                .asBitmap()
                .load("https://i.postimg.cc/GmXpRCYw/Screenshot-20210912-094834-Pick-Your-Own-Story.jpg")
                .into(secondImage);
        TextView projectTitle = findViewById(R.id.project_title);
        projectTitle.setText("Pick Your Adventure");
        TextView projectDescription = findViewById(R.id.project_description);
        projectDescription.setText("I asked my husband to write a story that I could adapt into a simple 'pick-your-own-adventure' type game. In addition to practicing things I had already learned I was able to play around with the .xml design capabilities.\nI practiced:");
        TextView projectLearned = findViewById(R.id.project_learned);
        projectLearned.setText("App Interface Design\nXML Design\nOptimization");
    }

}