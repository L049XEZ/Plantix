package com.example.plant;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class EducationalResourcesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_educational_resources); // No need to replace "your_layout_name", assuming it's correctly set to activity_educational_resources
        setContentView(R.layout.activity_educational_resources);

        WebView webView = findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient()); // Handle navigation
        webView.getSettings().setJavaScriptEnabled(true); // Enable JavaScript

        // Load the YouTube video
        String videoUrl = "https://www.youtube.com/embed/m_k9ym3pzRE"; // Use the embed URL
        webView.loadUrl(videoUrl);
    }
}