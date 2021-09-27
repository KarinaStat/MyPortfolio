package com.karinastatinaite.myportfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class SeventhProjectActivity extends AppCompatActivity {

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
                .load("https://i.postimg.cc/rww8QPHh/Screenshot-20210912-095127-Record-Keeper.jpg")
                .into(firstImage);
        ImageView secondImage = findViewById(R.id.second_image);
        Glide.with(this)
                .asBitmap()
                .load("https://i.postimg.cc/N0WBGfjV/Screenshot-20210912-095130-Record-Keeper.jpg")
                .into(secondImage);
        TextView projectTitle = findViewById(R.id.project_title);
        projectTitle.setText("Record Keeper");
        TextView projectDescription = findViewById(R.id.project_description);
        projectDescription.setText("Latest project in Kotlin where I have started learning some more advanced topics of application programming.\nI learned:");
        TextView projectLearned = findViewById(R.id.project_learned);
        projectLearned.setText("Fragments\nBottom Navigation Bar\nConstraint Layout\nVectors\nView Binding\nInterfaces\nDynamic Toolbar Titles");
    }
}
