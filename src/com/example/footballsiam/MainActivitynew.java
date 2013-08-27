package com.example.footballsiam;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivitynew extends Activity {
	


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mainnew);
		
		TextView txt = (TextView)findViewById(R.id.textView2);
		txt.setText("คู่แรก สุพรรณบุรีเอฟซี vs บีอีซีเทโร"
				+"\nคู่สอง สมุทรสงครามเอฟซี vs ชลบุรีเอฟซี"
				+"\nคู่สาม  เชียงรายยูไนเต็ด vs ชัยนาทเอฟซี"
				+"\nคู่สี่ ทีโอทีเอสซี vs บางกอกกล๊าสเอฟซี" 
				+"\nคู่ห้า บุรีรัมย์ยูไนเต็ด vs เอสซีจีเมืองทองยูไนเต็ด");
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
