package com.example.footballsiam;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;

public class MainActivitydata extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_maindata);
		
		final AlertDialog.Builder adb = new AlertDialog.Builder(this);
 
		final ImageButton imgbtn = (ImageButton) findViewById(R.id.imageButton1);

		imgbtn.setImageResource(R.drawable.ic_launcher);

		imgbtn.setOnClickListener(new View.OnClickListener() {

		public void onClick(View v) {

        AlertDialog ad = adb.create();

		ad.setMessage("ชื่อทีมEng SCGMuangthongUnited"
		+"\nชื่อทีมThai เอสซีจี เมืองทอง ยูไนเต็ด"
		+"\nฉายา กิเลนผยอง"
		+"\nสนาม  เอสซีจีสเตเดียม" 
		+"\nอันดับ 2");

		ad.show();

		}

		});
		
		final AlertDialog.Builder adb1 = new AlertDialog.Builder(this);
		 
		final ImageButton imgbtn1 = (ImageButton) findViewById(R.id.imageButton2);

		imgbtn1.setImageResource(R.drawable.ic_launcher2);

		imgbtn1.setOnClickListener(new View.OnClickListener() {

		public void onClick(View v) {

        AlertDialog ad = adb1.create();

		ad.setMessage("ชื่อทีมEng Samut Songkhram FC"
		+"\nชื่อทีมThai สมุทรสงคราม เอฟซี"
		+"\nฉายา  ปลาทูคะนอง"
		+"\nสนาม   สนามกีฬาสมุทรสงคราม" 
		+"\nอันดับ 15");

		ad.show();

		}

		});
		
		final AlertDialog.Builder adb2 = new AlertDialog.Builder(this);
		 
		final ImageButton imgbtn2 = (ImageButton) findViewById(R.id.imageButton3);

		imgbtn2.setImageResource(R.drawable.ic_launcher3);

		imgbtn2.setOnClickListener(new View.OnClickListener() {

		public void onClick(View v) {

        AlertDialog ad = adb2.create();

		ad.setMessage("ชื่อทีมEng Chonburi FC "
		+"\nชื่อทีมThai ชลบุรี เอฟซี"
		+"\nฉายา   ฉลามชล"
		+"\nสนาม   ชลบุรีสเตเดียม" 
		+"\nอันดับ 3");

		ad.show();

		}

		});
		
		final AlertDialog.Builder adb3 = new AlertDialog.Builder(this);
		 
		final ImageButton imgbtn3 = (ImageButton) findViewById(R.id.imageButton4);

		imgbtn3.setImageResource(R.drawable.ic_launcher4);

		imgbtn3.setOnClickListener(new View.OnClickListener() {

		public void onClick(View v) {

        AlertDialog ad = adb3.create();

		ad.setMessage("ชื่อทีมEng ChiangraiUnited "
		+"\nชื่อทีมThai เชียงราย ยูไนเต็ด"
		+"\nฉายา   กว่างโซ้ง"
		+"\nสนาม   ยูไนเต็ดสเตเดียม" 
		+"\nอันดับ 16");

		ad.show();

		}

		});
		
		final AlertDialog.Builder adb4 = new AlertDialog.Builder(this);
		 
		final ImageButton imgbtn4 = (ImageButton) findViewById(R.id.imageButton5);

		imgbtn4.setImageResource(R.drawable.ic_launcher5);

		imgbtn4.setOnClickListener(new View.OnClickListener() {

		public void onClick(View v) {

        AlertDialog ad = adb4.create();

		ad.setMessage("ชื่อทีมEng Chainat FC "
		+"\nชื่อทีมThai ชัยนาท เอฟซี"
		+"\nฉายา   นกใหญ่พิฆาต"
		+"\nสนาม   สนามกีฬาเขาพลอง" 
		+"\nอันดับ 11");

		ad.show();

		}

		});
		
		final AlertDialog.Builder adb5 = new AlertDialog.Builder(this);
		 
		final ImageButton imgbtn5 = (ImageButton) findViewById(R.id.imageButton6);

		imgbtn5.setImageResource(R.drawable.ic_launcher6);

		imgbtn5.setOnClickListener(new View.OnClickListener() {

		public void onClick(View v) {

        AlertDialog ad = adb5.create();

		ad.setMessage("ชื่อทีมEng TOT SC "
		+"\nชื่อทีมThai ทีโอที เอสซี"
		+"\nฉายา  ฮัลโหล"
		+"\nสนาม   สนามฟุตบอลทีโอที" 
		+"\nอันดับ 12");

		ad.show();

		}

		});
		
		final AlertDialog.Builder adb6 = new AlertDialog.Builder(this);
		 
		final ImageButton imgbtn6 = (ImageButton) findViewById(R.id.imageButton7);

		imgbtn6.setImageResource(R.drawable.ic_launcher7);

		imgbtn6.setOnClickListener(new View.OnClickListener() {

		public void onClick(View v) {

        AlertDialog ad = adb6.create();

		ad.setMessage("ชื่อทีมEng BangkokGlassFC "
		+"\nชื่อทีมThai บางกอกกล๊าส เอฟซี"
		+"\nฉายา  กระต่ายแก้ว"
		+"\nสนาม   ลีโอสเตเดียม" 
		+"\nอันดับ 7");

		ad.show();

		}

		});
		
		final AlertDialog.Builder adb7 = new AlertDialog.Builder(this);
		 
		final ImageButton imgbtn7 = (ImageButton) findViewById(R.id.imageButton8);

		imgbtn7.setImageResource(R.drawable.ic_launcher8);

		imgbtn7.setOnClickListener(new View.OnClickListener() {

		public void onClick(View v) {

        AlertDialog ad = adb7.create();

		ad.setMessage("ชื่อทีมEng BECTeroSasana "
		+"\nชื่อทีมThai บีอีซี เทโรศาสน"
		+"\nฉายา  มังกรไฟ"
		+"\nสนาม  เฉลิมพระเกียรติ 72 พรรษา" 
		+"\nอันดับ 6");

		ad.show();

		}

		});
		
		final AlertDialog.Builder adb8 = new AlertDialog.Builder(this);
		 
		final ImageButton imgbtn8 = (ImageButton) findViewById(R.id.imageButton9);

		imgbtn8.setImageResource(R.drawable.ic_launcher9);

		imgbtn8.setOnClickListener(new View.OnClickListener() {

		public void onClick(View v) {

        AlertDialog ad = adb8.create();

		ad.setMessage("ชื่อทีมEng BuriramUnited "
		+"\nชื่อทีมThai บุรีรัมย์ ยูไนเต็ด"
		+"\nฉายา  ปราสาทสายฟ้า"
		+"\nสนาม  นิวไอโมบายสเตเดียม" 
		+"\nอันดับ 1");

		ad.show();

		}

		});
		
		final AlertDialog.Builder adb9 = new AlertDialog.Builder(this);
		 
		final ImageButton imgbtn9 = (ImageButton) findViewById(R.id.imageButton10);

		imgbtn9.setImageResource(R.drawable.ic_launcher10);

		imgbtn9.setOnClickListener(new View.OnClickListener() {

		public void onClick(View v) {

        AlertDialog ad = adb9.create();

		ad.setMessage("ชื่อทีมEng Bangkok United "
		+"\nชื่อทีมThai แบงค็อก ยูไนเต็ด"
		+"\nฉายา  เข่งเทพ"
		+"\nสนาม  กีฬา ไทย-ญี่ปุ่น ดินแดง" 
		+"\nอันดับ 14");

		ad.show();

		}

		});
		
		final AlertDialog.Builder adb10 = new AlertDialog.Builder(this);
		 
		final ImageButton imgbtn10 = (ImageButton) findViewById(R.id.imageButton11);

		imgbtn10.setImageResource(R.drawable.ic_launcher11);

		imgbtn10.setOnClickListener(new View.OnClickListener() {

		public void onClick(View v) {

        AlertDialog ad = adb10.create();

		ad.setMessage("ชื่อทีมEng PattayaUnited "
		+"\nชื่อทีมThai พัทยา ยูไนเต็ด"
		+"\nฉายา โลมามหาภัย"
		+"\nสนาม  เทศบาลเมืองหนองปรือ" 
		+"\nอันดับ 17");

		ad.show();

		}

		});
		
		final AlertDialog.Builder adb11 = new AlertDialog.Builder(this);
		 
		final ImageButton imgbtn11 = (ImageButton) findViewById(R.id.imageButton12);

		imgbtn11.setImageResource(R.drawable.ic_launcher12);

		imgbtn11.setOnClickListener(new View.OnClickListener() {

		public void onClick(View v) {

        AlertDialog ad = adb11.create();

		ad.setMessage("ชื่อทีมEng Ratchaburi FC "
		+"\nชื่อทีมThai ราชบุรี มิตรผล เอฟซี"
		+"\nฉายา ราชันมังกร"
		+"\nสนาม ดรากอน อารีนา" 
		+"\nอันดับ 13");

		ad.show();

		}

		});
		
		final AlertDialog.Builder adb12 = new AlertDialog.Builder(this);
		 
		final ImageButton imgbtn12 = (ImageButton) findViewById(R.id.imageButton13);

		imgbtn12.setImageResource(R.drawable.ic_launcher13);

		imgbtn12.setOnClickListener(new View.OnClickListener() {

		public void onClick(View v) {

        AlertDialog ad = adb12.create();

		ad.setMessage("ชื่อทีมEng Sisaket FC "
		+"\nชื่อทีมThai ศรีสะเกษ เอฟซี"
		+"\nฉายา กรูปรีอัตราย"
		+"\nสนาม สนามศรีนครลำดวน" 
		+"\nอันดับ 18");

		ad.show();

		}

		});
		
		final AlertDialog.Builder adb13 = new AlertDialog.Builder(this);
		 
		final ImageButton imgbtn13 = (ImageButton) findViewById(R.id.imageButton14);

		imgbtn13.setImageResource(R.drawable.ic_launcher14);

		imgbtn13.setOnClickListener(new View.OnClickListener() {

		public void onClick(View v) {

        AlertDialog ad = adb13.create();

		ad.setMessage("ชื่อทีมEng SongkhlaUnited "
		+"\nชื่อทีมThai สงขลา ยูไนเต็ด"
		+"\nฉายา วัวชน"
		+"\nสนาม สนามติณสูลานนท์" 
		+"\nอันดับ  9");

		ad.show();

		}

		});
		
		final AlertDialog.Builder adb14 = new AlertDialog.Builder(this);
		 
		final ImageButton imgbtn14 = (ImageButton) findViewById(R.id.imageButton15);

		imgbtn14.setImageResource(R.drawable.ic_launcher15);

		imgbtn14.setOnClickListener(new View.OnClickListener() {

		public void onClick(View v) {

        AlertDialog ad = adb14.create();

		ad.setMessage("ชื่อทีมEng Suphanburi FC "
		+"\nชื่อทีมThai สุพรรณบุรี เอฟซี"
		+"\nฉายา ช้างศึกยุธทหัตถี"
		+"\nสนาม สนามกีฬากลาง" 
		+"\nอันดับ  4");

		ad.show();

		}

		});
		
		final AlertDialog.Builder adb15 = new AlertDialog.Builder(this);
		 
		final ImageButton imgbtn15 = (ImageButton) findViewById(R.id.imageButton16);

		imgbtn15.setImageResource(R.drawable.ic_launcher16);

		imgbtn15.setOnClickListener(new View.OnClickListener() {

		public void onClick(View v) {

        AlertDialog ad = adb15.create();

		ad.setMessage("ชื่อทีมEng Army United "
		+"\nชื่อทีมThai อาร์มี่ ยูไนเต็ด"
		+"\nฉายา ตรากงจักร"
		+"\nสนาม สนามกีฬากองทัพบก" 
		+"\nอันดับ  5");

		ad.show();

		}

		});
		
		final AlertDialog.Builder adb16 = new AlertDialog.Builder(this);
		 
		final ImageButton imgbtn16 = (ImageButton) findViewById(R.id.imageButton17);

		imgbtn16.setImageResource(R.drawable.ic_launcher17);

		imgbtn16.setOnClickListener(new View.OnClickListener() {

		public void onClick(View v) {

        AlertDialog ad = adb16.create();

		ad.setMessage("ชื่อทีมEng PoliceUnitedFC "
		+"\nชื่อทีมThai อินทรีเพื่อนตำรวจ"
		+"\nฉายา สุภาพบุรุษโล่เงิน"
		+"\nสนาม สนามธรรมศาสตร์ รังสิต" 
		+"\nอันดับ  10");

		ad.show();

		}

		});
		
		final AlertDialog.Builder adb17 = new AlertDialog.Builder(this);
		 
		final ImageButton imgbtn17 = (ImageButton) findViewById(R.id.imageButton18);

		imgbtn17.setImageResource(R.drawable.ic_launcher18);

		imgbtn17.setOnClickListener(new View.OnClickListener() {

		public void onClick(View v) {

        AlertDialog ad = adb17.create();

		ad.setMessage("ชื่อทีมEng OsotspaM-150SaraburiFC "
		+"\nชื่อทีมThai โอสถสภา เอ็ม150 สระบุรี"
		+"\nฉายา พลังเอ็ม"
		+"\nสนาม สนามกีฬากลาง" 
		+"\nอันดับ  8");

		ad.show();

		}

		});
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
