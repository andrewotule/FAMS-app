package com.andrew.famsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val web = findViewById<WebView>(R.id.web2)
        web.webViewClient = WebViewClient()
        web.loadUrl("https://fams-cit.com/login")

    }
}