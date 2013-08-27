package com.example.footballsiam;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	}
public void newButton(View v){
		Intent intent = new Intent(this,MainActivitynew.class);
		startActivityForResult(intent,101);
		finish();
}
public void resultsButton(View v){
	Intent intent = new Intent(this,MainActivityresults.class);
	startActivityForResult(intent,101);
	finish();
}
	public void dataButton(View v){
		
		Intent intent = new Intent(this,MainActivitydata.class);
		startActivityForResult(intent,101);
		finish();
	}
	public void scoreButton(View v){
		Intent intent = new Intent(this,MainActivityscore.class);
		startActivityForResult(intent,101);
		finish();
	}

	
	
	
	
	
    
	
	public void exitButton(View v){

		finish();
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
