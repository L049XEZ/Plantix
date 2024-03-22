package com.example.plant;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CropManagementActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crop_management);

        TextView textView = findViewById(R.id.textViewCropManagement);
        textView.setText("Information about Crop Management.");
    }
}
