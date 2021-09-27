package com.karinastatinaite.myportfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class FifthProjectActivity extends AppCompatActivity {

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
                .load("https://i.postimg.cc/1tktdrF8/Screenshot-20210912-094851-Self-Promo-App.jpg")
                .into(firstImage);
        ImageView secondImage = findViewById(R.id.second_image);
        Glide.with(this)
                .asBitmap()
                .load("https://i.postimg.cc/ZqgK9xVw/Screenshot-20210912-094937-Self-Promo-App.jpg")
                .into(secondImage);
        TextView projectTitle = findViewById(R.id.project_title);
        projectTitle.setText("Self-Promo App");
        TextView projectDescription = findViewById(R.id.project_description);
        projectDescription.setText("My first application in Kotlin. User input is transferred to a different activity where a message can be previewed before sending it.\nI learned: ");
        TextView projectLearned = findViewById(R.id.project_learned);
        projectLearned.setText("Kotlin\nNull Safety\nLogcat & Debugging\nPassing Data\nImplicit Intent\nSerialization\nLocalization");
    }
}
