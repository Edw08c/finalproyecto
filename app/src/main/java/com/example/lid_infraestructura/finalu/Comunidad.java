package com.example.lid_infraestructura.finalu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Comunidad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comunidad);

        WebView view = (WebView) findViewById(R.id.comunidad);
        view.setWebViewClient(new WebViewClient());
        view.loadUrl("http://www.uniremington.edu.co/manizales/general/comunidad/calendario-eventos.html");

    }
}
