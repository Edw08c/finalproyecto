package com.example.lid_infraestructura.finalu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Moodle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moodle);

        WebView view = (WebView) findViewById(R.id.moodle);
        view.setWebViewClient(new WebViewClient());
        view.loadUrl("http://virtual.uniremingtonmanizales.edu.co/moodle/login/index.php");
    }
}


