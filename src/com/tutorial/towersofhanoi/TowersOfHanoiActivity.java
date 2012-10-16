package com.tutorial.towersofhanoi;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class TowersOfHanoiActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_towers_of_hanoi);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_towers_of_hanoi, menu);
        return true;
    }
}
