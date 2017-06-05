package com.example.lid_infraestructura.finalu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Pasto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasto);

        WebView view = (WebView) findViewById(R.id.pasto);
        view.setWebViewClient(new WebViewClient());
        view.loadUrl("http://www.uniremington.edu.co/pasto/");
    }
}
