package com.example.lid_infraestructura.finalu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Bienestar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienestar);

        WebView view = (WebView) findViewById(R.id.bienestar);
        view.setWebViewClient(new WebViewClient());
        view.loadUrl("http://www.uniremington.edu.co/internacionalizacion.html");


    }
}
