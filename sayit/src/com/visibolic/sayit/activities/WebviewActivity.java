package com.visibolic.sayit.activities;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

import com.visibolic.sayit.R;

public class WebviewActivity extends Activity {

	@Override
	  public void onCreate(Bundle bundle) {
	    super.onCreate(bundle);
	    setContentView(R.layout.webview);
	   
	    Bundle extras = getIntent().getExtras();
	    String inputString = extras.getString("url");
	    WebView view = (WebView) findViewById(R.id.webview1);
	    view.getSettings().setJavaScriptEnabled(true);
	    view.loadUrl(inputString);
	    
	    
	  }
}
