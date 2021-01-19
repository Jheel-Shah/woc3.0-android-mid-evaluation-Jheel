package com.example.time_table;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Monday(View view)
    {
        Intent intent = new Intent(this, monday.class);
        startActivity(intent);
    }
    public void Tuesday(View view)
    {
        Intent intent = new Intent(this, tuesday.class);
        startActivity(intent);
    }
    public void Wednesday(View view)
    {
        Intent intent = new Intent(this, wednesday.class);
        startActivity(intent);
    }
    public void Thursday(View view)
    {
        Intent intent = new Intent(this, thursday.class);
        startActivity(intent);
    }
    public void Friday(View view)
    {
        Intent intent = new Intent(this, friday.class);
        startActivity(intent);
    }
    public void Saturday(View view)
    {
        Intent intent = new Intent(this, saturday.class);
        startActivity(intent);
    }
}