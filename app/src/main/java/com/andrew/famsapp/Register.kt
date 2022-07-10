package com.andrew.famsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val webview = findViewById<WebView>(R.id.web3)
        webview.webViewClient = WebViewClient()
        webview.loadUrl("https://fams-cit.com/register")

    }
}