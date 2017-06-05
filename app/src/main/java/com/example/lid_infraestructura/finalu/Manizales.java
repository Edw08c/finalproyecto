package com.example.lid_infraestructura.finalu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Manizales extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manizales);

        WebView view = (WebView) findViewById(R.id.manizales);
        view.setWebViewClient (new WebViewClient());
        view.loadUrl("http://www.uniremington.edu.co/manizales/");


    }
}
