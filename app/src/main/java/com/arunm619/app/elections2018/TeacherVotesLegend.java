package com.arunm619.app.elections2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TeacherVotesLegend extends AppCompatActivity {

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_votes_legend);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
