package com.karinastatinaite.myportfolio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements RecyclerViewAdapter.OnNoteListener {

    private static final String TAG = "MainActivity";
    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mLanguage = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");
        initImageBitMaps();

    }

    private void initImageBitMaps() {
        Log.d(TAG, "preparing bitmaps.");
        mImageUrls.add("https://i.postimg.cc/3RRbdztv/BMI.jpg");
        mNames.add("BMI calculator");
        mLanguage.add("Java");

        mImageUrls.add("https://i.postimg.cc/1RD5t66K/Screenshot-20210912-094652-Things-to-See-in-Aichi-Prefecture.jpg");
        mNames.add("Aichi Prefecture Guide");
        mLanguage.add("Java");

        mImageUrls.add("https://i.postimg.cc/4Nbd8tx3/Screenshot-20210912-094731-Kyoto-days.jpg");
        mNames.add("Kyoto Trip Guide");
        mLanguage.add("Java");

        mImageUrls.add("https://i.postimg.cc/8zpCx57m/Screenshot-20210912-094805-Pick-Your-Own-Story.jpg");
        mNames.add("Pick Your Adventure");
        mLanguage.add("Java");

        mImageUrls.add("https://i.postimg.cc/1tktdrF8/Screenshot-20210912-094851-Self-Promo-App.jpg");
        mNames.add("Self-Promo App");
        mLanguage.add("Kotlin");

        mImageUrls.add("https://i.postimg.cc/63mJwgkM/Screenshot-20210912-151109-Karina-Statinaite-Portfolio.jpg");
        mNames.add("Portfolio");
        mLanguage.add("Java");

        mImageUrls.add("https://i.postimg.cc/rww8QPHh/Screenshot-20210912-095127-Record-Keeper.jpg");
        mNames.add("Record Keeper");
        mLanguage.add("Kotlin");

        mImageUrls.add("https://i.postimg.cc/wTT332zd/brooke-lark-08b-OYn-H-r-E-unsplash.jpg");
        mNames.add("Recipe App");
        mLanguage.add("Kotlin");

        initRecyclerView();

    }

    private void initRecyclerView() {
        Log.d(TAG, "recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls, mLanguage, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void onNoteClick(int position) {
        Intent intent = new Intent();
        switch (position) {
            case 0:
                intent = new Intent(MainActivity.this, OneProject.class);
                startActivity(intent);
                break;
            case 1: //second item in Recycler view
                intent = new Intent(MainActivity.this, SecondProject.class);
                startActivity(intent);
                break;
            case 2: //third item in Recycler view
                intent = new Intent(MainActivity.this, ThirdProjectActivity.class);
                startActivity(intent);
                break;
            case 3:
                intent = new Intent(MainActivity.this, FourthProjectActivity.class);
                startActivity(intent);
                break;
            case 4:
                intent = new Intent(MainActivity.this, FifthProjectActivity.class);
                startActivity(intent);
                break;
            case 5:
                intent = new Intent(MainActivity.this, SixthProjectActivity.class);
                startActivity(intent);
                break;
            case 6:
                intent = new Intent(MainActivity.this, SeventhProjectActivity.class);
                startActivity(intent);
                break;
            case 7:
                intent = new Intent(MainActivity.this, EightProjectActivity.class);
                startActivity(intent);
                break;
        }
    }
}