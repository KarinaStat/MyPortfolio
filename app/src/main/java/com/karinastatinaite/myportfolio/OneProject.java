package com.karinastatinaite.myportfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class OneProject extends AppCompatActivity {

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
                .load("https://i.postimg.cc/QMMHKtsd/Screenshot-20210912-094555-BMICalc.jpg")
                .into(firstImage);
        ImageView secondImage = findViewById(R.id.second_image);
        Glide.with(this)
                .asBitmap()
                .load("https://i.postimg.cc/KcT4MCXB/Screenshot-20210912-094620-BMICalc.jpg")
                .into(secondImage);
        TextView projectTitle = findViewById(R.id.project_title);
        projectTitle.setText("BMI Calculator");
        TextView projectDescription = findViewById(R.id.project_description);
        projectDescription.setText("Functional BMI calculator that accounts for sex, age, height, and weight. \nI learned:");
        TextView projectLearned = findViewById(R.id.project_learned);
        projectLearned.setText("Variables\nMethods\nConditional Logic");
    }

}

