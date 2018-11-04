package info.ffox.www.btcinfo

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.webkit.WebView

class webview_Activity : Activity() {

    override fun onResume() {
        super.onResume()
        window.decorView.systemUiVisibility = 4198
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview)

        val webView = findViewById<View>(R.id.webview) as WebView

        val webSettings = webView.settings
        webSettings.javaScriptEnabled = true
        webSettings.domStorageEnabled = true
        //webSettings.databaseEnabled = true
        webSettings.allowUniversalAccessFromFileURLs = true
        webView.loadUrl("file:///android_asset/index.html")
    }

}


// webSettings.allowUniversalAccessFromFileURLs = true