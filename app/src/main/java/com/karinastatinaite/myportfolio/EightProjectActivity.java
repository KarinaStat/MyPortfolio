package com.karinastatinaite.myportfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class EightProjectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        findViews();

    }

    private void findViews() {
        TextView projectTitle = findViewById(R.id.project_title);
        projectTitle.setText("Recipe App");
        TextView projectDescription = findViewById(R.id.project_description);
        projectDescription.setText("This is the current project that I am working on.\nI will use:");
        TextView projectLearned = findViewById(R.id.project_learned);
        projectLearned.setText("ROOM Database\nDagger & Hilt\nRetrofit\nKotlin Coroutines\nData Binding\nFlow\nDiffUtil\nREST API\nand more...");
    }
}