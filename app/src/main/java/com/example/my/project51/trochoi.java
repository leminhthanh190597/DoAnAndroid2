package com.example.my.project51;

import java.util.ArrayList;
import java.util.List;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class trochoi extends Activity {
	Button back;

	TextView tv;
	RadioButton rdo_a,rdo_b,rdo_c,rdo_d;
	Button bt;
	Database db;
	int socau=10;
	int index=0;
	List<Dayhoc> ds_cauhoi;
	Dayhoc cauhientai;
	int caudung=0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_trochoi);
		back=(Button) findViewById(R.id.quaylai);
		back.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent i = new Intent(trochoi.this,chontrochoi.class);
				startActivity(i);
				finish();
				
			}
		});
		tv=(TextView)findViewById(R.id.textView1);
		bt=(Button)findViewById(R.id.button1);
		rdo_a=(RadioButton)findViewById(R.id.radio0);
		rdo_b=(RadioButton)findViewById(R.id.radio1);
		rdo_c=(RadioButton)findViewById(R.id.radio2);
		rdo_d=(RadioButton)findViewById(R.id.radio3);
		
		db=new Database(this);
		try{
			db.CreateDataBase();
			
		}catch(Exception e)
		{
			Toast.makeText(getApplicationContext(),"bi loi", Toast.LENGTH_SHORT).show();
		}
		db.close();
		db=new Database(this);
/*	
		Cursor contro=db.laytatcacauhoi();
		contro.moveToFirst();
		String chuoi="";
		do
		{
			chuoi+=contro.getString(0)+" ";
			chuoi+=contro.getString(1) + "\n";
		}while(contro.moveToNext());
		tv.setText(chuoi);
*/
		

		ds_cauhoi=new ArrayList<Dayhoc>();
		ds_cauhoi=db.layNcaungaunghien(socau);
		hienthi(index);
		
		bt.setOnClickListener(new View.OnClickListener() {
			
	      //@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String cautraloi="";
				if(rdo_a.isChecked()==true)
					cautraloi="a";
				else if(rdo_b.isChecked()==true)
					cautraloi="b";
				else if(rdo_c.isChecked()==true)
					cautraloi="c";
				else if(rdo_d.isChecked()==true)
					cautraloi="d";
				else
					cautraloi="boqua";
				
				if(cautraloi.equalsIgnoreCase(cauhientai.dapan))
					caudung=caudung+1;
				
				index++;
				if(index<socau)
					hienthi(index);
				else
				{
					Toast.makeText(getApplicationContext(),"Số câu trả lời đúng là:"+ caudung +"/10 câu", Toast.LENGTH_SHORT).show();
				}
			}
		});
		
	}

	public void hienthi(int vitri)
	{
		cauhientai=ds_cauhoi.get(vitri);
		tv.setText(cauhientai.cauhoi);
		rdo_a.setText(cauhientai.cau_a);
		rdo_b.setText(cauhientai.cau_b);
		rdo_c.setText(cauhientai.cau_c);
		rdo_d.setText(cauhientai.cau_d);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.trochoi, menu);
		return true;
	}

}
