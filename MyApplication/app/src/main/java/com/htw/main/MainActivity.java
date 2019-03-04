package com.htw.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView = null;
    private WebView mWebView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        //mTextView = (TextView) findViewById(R.id.show_text);
        mWebView = (WebView) findViewById(R.id.webWview);
        mWebView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                Log.e("huangtanwen","shouldOverrideUrlLoading");
                return super.shouldOverrideUrlLoading(view, request);
            }
        });
        mWebView.loadUrl("http://www.baidu.com");
    }
}
