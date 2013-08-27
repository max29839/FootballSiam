package com.example.footballsiam;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivityresults extends Activity {
	  
	private ViewFlipper viewFlipper;
	private Button PreviousButton;
	private Button nextButton;
  

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mainresults);
		
		viewFlipper = (ViewFlipper)findViewById(R.id.viewFlipper1);
		PreviousButton = (Button)findViewById(R.id.button1_1);
		nextButton = (Button)findViewById(R.id.button2_2);
		
		PreviousButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				viewFlipper.showPrevious();
				
			}
		});
		
		nextButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				viewFlipper.showNext();
				
			
			}
		});
	
	}
	public void backButton(View v){
		Intent intent = new Intent(this,MainActivity.class);
		startActivityForResult(intent,101);
		finish();
	}
}
