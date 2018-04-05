package com.example.jinadiwathsala.mytabapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class StarredMessages extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starred_messages);

        getSupportActionBar().setTitle("Starred Messages");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
