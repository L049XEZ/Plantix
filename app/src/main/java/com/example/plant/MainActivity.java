package com.example.plant;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;

import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCropManagement = findViewById(R.id.btnCropManagement);
        btnCropManagement.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, CropManagementActivity.class);
            startActivity(intent);
        });

        Button btnTechTools = findViewById(R.id.btnTechTools);
        btnTechTools.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, TechnologicalToolsActivity.class);
            startActivity(intent);
        });

        Button btnEducation = findViewById(R.id.btnEducation);
        btnEducation.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, EducationalResourcesActivity.class);
            startActivity(intent);
        });

        Button btnSustainability = findViewById(R.id.btnSustainability);
        btnSustainability.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, SustainabilityActivity.class);
            startActivity(intent);
        });
    }
}

