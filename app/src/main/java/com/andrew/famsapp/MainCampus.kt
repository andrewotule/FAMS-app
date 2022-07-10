package com.andrew.famsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainCampus : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_campus)

        val webView = findViewById<WebView>(R.id.web)
        webView.webViewClient = WebViewClient()
        webView.loadUrl("https://www.mak.ac.ug/")

    }
}