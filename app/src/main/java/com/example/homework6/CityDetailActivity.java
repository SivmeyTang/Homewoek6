package com.example.homework6;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class CityDetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_detail);

        TextView detailTextView = findViewById(R.id.detailTextView);
        String cityName = getIntent().getStringExtra("CITY_NAME");
        detailTextView.setText(cityName);
    }
}
