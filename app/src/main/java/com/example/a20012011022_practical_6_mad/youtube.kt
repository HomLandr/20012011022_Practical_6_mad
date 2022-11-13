package com.example.a20012011022_practical_6_mad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class youtube : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)
        val youtubeid = "dphagk4O5qA"
        val mywebview = findViewById<WebView>(R.id.webview)
        val settings = mywebview.settings
        settings.javaScriptEnabled = true
        settings.loadWithOverviewMode = true
        settings.useWideViewPort = true
        mywebview.loadUrl("https://www.youtube.com/embed/$youtubeid")
    }
}