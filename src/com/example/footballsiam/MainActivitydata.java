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

		ad.setMessage("���ͷ��Eng SCGMuangthongUnited"
		+"\n���ͷ��Thai ��ʫը� ���ͧ�ͧ �����"
		+"\n���� ���Ź��ͧ"
		+"\nʹ��  ��ʫը�������" 
		+"\n�ѹ�Ѻ 2");

		ad.show();

		}

		});
		
		final AlertDialog.Builder adb1 = new AlertDialog.Builder(this);
		 
		final ImageButton imgbtn1 = (ImageButton) findViewById(R.id.imageButton2);

		imgbtn1.setImageResource(R.drawable.ic_launcher2);

		imgbtn1.setOnClickListener(new View.OnClickListener() {

		public void onClick(View v) {

        AlertDialog ad = adb1.create();

		ad.setMessage("���ͷ��Eng Samut Songkhram FC"
		+"\n���ͷ��Thai ��ط�ʧ���� �Ϳ��"
		+"\n����  ��ҷ٤йͧ"
		+"\nʹ��   ʹ��������ط�ʧ����" 
		+"\n�ѹ�Ѻ 15");

		ad.show();

		}

		});
		
		final AlertDialog.Builder adb2 = new AlertDialog.Builder(this);
		 
		final ImageButton imgbtn2 = (ImageButton) findViewById(R.id.imageButton3);

		imgbtn2.setImageResource(R.drawable.ic_launcher3);

		imgbtn2.setOnClickListener(new View.OnClickListener() {

		public void onClick(View v) {

        AlertDialog ad = adb2.create();

		ad.setMessage("���ͷ��Eng Chonburi FC "
		+"\n���ͷ��Thai �ź��� �Ϳ��"
		+"\n����   ������"
		+"\nʹ��   �ź���������" 
		+"\n�ѹ�Ѻ 3");

		ad.show();

		}

		});
		
		final AlertDialog.Builder adb3 = new AlertDialog.Builder(this);
		 
		final ImageButton imgbtn3 = (ImageButton) findViewById(R.id.imageButton4);

		imgbtn3.setImageResource(R.drawable.ic_launcher4);

		imgbtn3.setOnClickListener(new View.OnClickListener() {

		public void onClick(View v) {

        AlertDialog ad = adb3.create();

		ad.setMessage("���ͷ��Eng ChiangraiUnited "
		+"\n���ͷ��Thai ��§��� �����"
		+"\n����   ���ҧ��"
		+"\nʹ��   �����������" 
		+"\n�ѹ�Ѻ 16");

		ad.show();

		}

		});
		
		final AlertDialog.Builder adb4 = new AlertDialog.Builder(this);
		 
		final ImageButton imgbtn4 = (ImageButton) findViewById(R.id.imageButton5);

		imgbtn4.setImageResource(R.drawable.ic_launcher5);

		imgbtn4.setOnClickListener(new View.OnClickListener() {

		public void onClick(View v) {

        AlertDialog ad = adb4.create();

		ad.setMessage("���ͷ��Eng Chainat FC "
		+"\n���ͷ��Thai ��¹ҷ �Ϳ��"
		+"\n����   ���˭�Ԧҵ"
		+"\nʹ��   ʹ�������Ҿ�ͧ" 
		+"\n�ѹ�Ѻ 11");

		ad.show();

		}

		});
		
		final AlertDialog.Builder adb5 = new AlertDialog.Builder(this);
		 
		final ImageButton imgbtn5 = (ImageButton) findViewById(R.id.imageButton6);

		imgbtn5.setImageResource(R.drawable.ic_launcher6);

		imgbtn5.setOnClickListener(new View.OnClickListener() {

		public void onClick(View v) {

        AlertDialog ad = adb5.create();

		ad.setMessage("���ͷ��Eng TOT SC "
		+"\n���ͷ��Thai ���ͷ� ��ʫ�"
		+"\n����  ������"
		+"\nʹ��   ʹ���ص��ŷ��ͷ�" 
		+"\n�ѹ�Ѻ 12");

		ad.show();

		}

		});
		
		final AlertDialog.Builder adb6 = new AlertDialog.Builder(this);
		 
		final ImageButton imgbtn6 = (ImageButton) findViewById(R.id.imageButton7);

		imgbtn6.setImageResource(R.drawable.ic_launcher7);

		imgbtn6.setOnClickListener(new View.OnClickListener() {

		public void onClick(View v) {

        AlertDialog ad = adb6.create();

		ad.setMessage("���ͷ��Eng BangkokGlassFC "
		+"\n���ͷ��Thai �ҧ�͡����� �Ϳ��"
		+"\n����  ��е������"
		+"\nʹ��   ����������" 
		+"\n�ѹ�Ѻ 7");

		ad.show();

		}

		});
		
		final AlertDialog.Builder adb7 = new AlertDialog.Builder(this);
		 
		final ImageButton imgbtn7 = (ImageButton) findViewById(R.id.imageButton8);

		imgbtn7.setImageResource(R.drawable.ic_launcher8);

		imgbtn7.setOnClickListener(new View.OnClickListener() {

		public void onClick(View v) {

        AlertDialog ad = adb7.create();

		ad.setMessage("���ͷ��Eng BECTeroSasana "
		+"\n���ͷ��Thai ���ի� �����ʹ"
		+"\n����  �ѧ���"
		+"\nʹ��  ����������õ� 72 �����" 
		+"\n�ѹ�Ѻ 6");

		ad.show();

		}

		});
		
		final AlertDialog.Builder adb8 = new AlertDialog.Builder(this);
		 
		final ImageButton imgbtn8 = (ImageButton) findViewById(R.id.imageButton9);

		imgbtn8.setImageResource(R.drawable.ic_launcher9);

		imgbtn8.setOnClickListener(new View.OnClickListener() {

		public void onClick(View v) {

        AlertDialog ad = adb8.create();

		ad.setMessage("���ͷ��Eng BuriramUnited "
		+"\n���ͷ��Thai ��������� �����"
		+"\n����  ����ҷ��¿��"
		+"\nʹ��  ����������������" 
		+"\n�ѹ�Ѻ 1");

		ad.show();

		}

		});
		
		final AlertDialog.Builder adb9 = new AlertDialog.Builder(this);
		 
		final ImageButton imgbtn9 = (ImageButton) findViewById(R.id.imageButton10);

		imgbtn9.setImageResource(R.drawable.ic_launcher10);

		imgbtn9.setOnClickListener(new View.OnClickListener() {

		public void onClick(View v) {

        AlertDialog ad = adb9.create();

		ad.setMessage("���ͷ��Eng Bangkok United "
		+"\n���ͷ��Thai ầ��͡ �����"
		+"\n����  ��෾"
		+"\nʹ��  ���� ��-����� �Թᴧ" 
		+"\n�ѹ�Ѻ 14");

		ad.show();

		}

		});
		
		final AlertDialog.Builder adb10 = new AlertDialog.Builder(this);
		 
		final ImageButton imgbtn10 = (ImageButton) findViewById(R.id.imageButton11);

		imgbtn10.setImageResource(R.drawable.ic_launcher11);

		imgbtn10.setOnClickListener(new View.OnClickListener() {

		public void onClick(View v) {

        AlertDialog ad = adb10.create();

		ad.setMessage("���ͷ��Eng PattayaUnited "
		+"\n���ͷ��Thai �ѷ�� �����"
		+"\n���� ����������"
		+"\nʹ��  �Ⱥ�����ͧ˹ͧ����" 
		+"\n�ѹ�Ѻ 17");

		ad.show();

		}

		});
		
		final AlertDialog.Builder adb11 = new AlertDialog.Builder(this);
		 
		final ImageButton imgbtn11 = (ImageButton) findViewById(R.id.imageButton12);

		imgbtn11.setImageResource(R.drawable.ic_launcher12);

		imgbtn11.setOnClickListener(new View.OnClickListener() {

		public void onClick(View v) {

        AlertDialog ad = adb11.create();

		ad.setMessage("���ͷ��Eng Ratchaburi FC "
		+"\n���ͷ��Thai �Ҫ���� �Եü� �Ϳ��"
		+"\n���� �Ҫѹ�ѧ��"
		+"\nʹ�� ��ҡ͹ ���չ�" 
		+"\n�ѹ�Ѻ 13");

		ad.show();

		}

		});
		
		final AlertDialog.Builder adb12 = new AlertDialog.Builder(this);
		 
		final ImageButton imgbtn12 = (ImageButton) findViewById(R.id.imageButton13);

		imgbtn12.setImageResource(R.drawable.ic_launcher13);

		imgbtn12.setOnClickListener(new View.OnClickListener() {

		public void onClick(View v) {

        AlertDialog ad = adb12.create();

		ad.setMessage("���ͷ��Eng Sisaket FC "
		+"\n���ͷ��Thai ������� �Ϳ��"
		+"\n���� ��ٻ���ѵ���"
		+"\nʹ�� ʹ����չ���Ӵǹ" 
		+"\n�ѹ�Ѻ 18");

		ad.show();

		}

		});
		
		final AlertDialog.Builder adb13 = new AlertDialog.Builder(this);
		 
		final ImageButton imgbtn13 = (ImageButton) findViewById(R.id.imageButton14);

		imgbtn13.setImageResource(R.drawable.ic_launcher14);

		imgbtn13.setOnClickListener(new View.OnClickListener() {

		public void onClick(View v) {

        AlertDialog ad = adb13.create();

		ad.setMessage("���ͷ��Eng SongkhlaUnited "
		+"\n���ͷ��Thai ʧ��� �����"
		+"\n���� ��Ǫ�"
		+"\nʹ�� ʹ���Գ���ҹ���" 
		+"\n�ѹ�Ѻ  9");

		ad.show();

		}

		});
		
		final AlertDialog.Builder adb14 = new AlertDialog.Builder(this);
		 
		final ImageButton imgbtn14 = (ImageButton) findViewById(R.id.imageButton15);

		imgbtn14.setImageResource(R.drawable.ic_launcher15);

		imgbtn14.setOnClickListener(new View.OnClickListener() {

		public void onClick(View v) {

        AlertDialog ad = adb14.create();

		ad.setMessage("���ͷ��Eng Suphanburi FC "
		+"\n���ͷ��Thai �ؾ�ó���� �Ϳ��"
		+"\n���� ��ҧ�֡�ظ��ѵ��"
		+"\nʹ�� ʹ�����ҡ�ҧ" 
		+"\n�ѹ�Ѻ  4");

		ad.show();

		}

		});
		
		final AlertDialog.Builder adb15 = new AlertDialog.Builder(this);
		 
		final ImageButton imgbtn15 = (ImageButton) findViewById(R.id.imageButton16);

		imgbtn15.setImageResource(R.drawable.ic_launcher16);

		imgbtn15.setOnClickListener(new View.OnClickListener() {

		public void onClick(View v) {

        AlertDialog ad = adb15.create();

		ad.setMessage("���ͷ��Eng Army United "
		+"\n���ͷ��Thai ������� �����"
		+"\n���� ��ҡ��ѡ�"
		+"\nʹ�� ʹ�����ҡͧ�Ѿ��" 
		+"\n�ѹ�Ѻ  5");

		ad.show();

		}

		});
		
		final AlertDialog.Builder adb16 = new AlertDialog.Builder(this);
		 
		final ImageButton imgbtn16 = (ImageButton) findViewById(R.id.imageButton17);

		imgbtn16.setImageResource(R.drawable.ic_launcher17);

		imgbtn16.setOnClickListener(new View.OnClickListener() {

		public void onClick(View v) {

        AlertDialog ad = adb16.create();

		ad.setMessage("���ͷ��Eng PoliceUnitedFC "
		+"\n���ͷ��Thai �Թ������͹���Ǩ"
		+"\n���� ���Ҿ���������Թ"
		+"\nʹ�� ʹ��������ʵ�� �ѧ�Ե" 
		+"\n�ѹ�Ѻ  10");

		ad.show();

		}

		});
		
		final AlertDialog.Builder adb17 = new AlertDialog.Builder(this);
		 
		final ImageButton imgbtn17 = (ImageButton) findViewById(R.id.imageButton18);

		imgbtn17.setImageResource(R.drawable.ic_launcher18);

		imgbtn17.setOnClickListener(new View.OnClickListener() {

		public void onClick(View v) {

        AlertDialog ad = adb17.create();

		ad.setMessage("���ͷ��Eng OsotspaM-150SaraburiFC "
		+"\n���ͷ��Thai ��ʶ��� ����150 ��к���"
		+"\n���� ��ѧ����"
		+"\nʹ�� ʹ�����ҡ�ҧ" 
		+"\n�ѹ�Ѻ  8");

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
