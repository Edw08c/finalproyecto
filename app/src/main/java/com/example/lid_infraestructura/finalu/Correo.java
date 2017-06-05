package com.example.lid_infraestructura.finalu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Correo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correo);

        WebView view = (WebView) findViewById(R.id.correo);
        view.setWebViewClient(new WebViewClient());
        view.loadUrl("https://www.google.com/gmail/");
    }
}
