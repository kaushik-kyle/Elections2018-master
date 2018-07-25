package com.arunm619.app.elections2018;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Intro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);


        open_form_activity();
    }

    private void open_form_activity() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                final Intent mainIntent = new Intent(Intro.this, FormMainActivity.class);
                Intro.this.startActivity(mainIntent);
                Intro.this.finish();
            }
        }, 1800);

    }
}
