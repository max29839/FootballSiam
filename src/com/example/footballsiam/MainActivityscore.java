package com.example.footballsiam;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;



public class MainActivityscore extends Activity {
	


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mainscore);
		
		WebView myWebView = (WebView) findViewById(R.id.webView1);
		 WebSettings webSettings = myWebView.getSettings();
		 webSettings.setJavaScriptEnabled(true);
		 myWebView.loadUrl("http://www.siamsport.co.th/tablet/table.php?sub=16");
	
}
    
	
	public void backButton(View v){
		Intent intent = new Intent(this,MainActivity.class);
		startActivityForResult(intent,101);
		finish();
	}

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
