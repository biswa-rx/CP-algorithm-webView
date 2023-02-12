package com.example.cpalgorithms;

import android.webkit.WebView;
import android.webkit.WebViewClient;

class WebviewControler extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String request) {
        view.loadUrl(request);
        return true;
    }
}