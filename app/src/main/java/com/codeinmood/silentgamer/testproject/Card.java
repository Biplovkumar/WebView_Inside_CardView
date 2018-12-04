package com.codeinmood.silentgamer.testproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Card extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);
        webView = findViewById(R.id.mweb);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setUserAgentString("biplov");
        webView.loadUrl("https://www.facebook.com/");

    }
}
