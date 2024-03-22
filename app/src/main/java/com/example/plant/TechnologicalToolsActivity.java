package com.example.plant;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TechnologicalToolsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technological_tools); // Make sure this matches your XML file name

        // Initialize your TextViews
        TextView tvCropHealth = findViewById(R.id.tvCropHealth);
        TextView tvWeatherConditions = findViewById(R.id.tvWeatherConditions);
        TextView tvPestOutbreaks = findViewById(R.id.tvPestOutbreaks);

        // Here you would replace these with real data fetched from your backend
        tvCropHealth.setText("Crop Health: Good"); // Example of what real data might look like
        tvWeatherConditions.setText("Weather: Sunny, 24°C");
        tvPestOutbreaks.setText("Pest Outbreaks: None detected");
    }
}

