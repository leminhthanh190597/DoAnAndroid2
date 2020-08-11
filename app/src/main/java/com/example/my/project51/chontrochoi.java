package com.example.my.project51;

import timchucai.tim1;
import timchucai.tim2;
import timchucai.tim3;
import timchucai.tim4;
import timchucai.tim5;

import com.example.my.project51.R;

import chonanhghepchu.chucai1;
import chonanhghepchu.chucai2;
import chonanhghepchu.chucai3;
import chonanhghepchu.chucai4;
import chonanhghepchu.chucai5;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class chontrochoi extends Activity {
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chontrochoi);
//        int[] a= new int[5]; 
//     // tạo dãy số liên tục từ 1 dến 5 
//     for (int i=0; i<5 ; i++) 
//     {
//    	 a[i]=i+1; 
//     }
//     // xao tron xuoi 
//     for (int i=0; i<5 ; i++)
//     {
//     for (int j=i+1;j<5;j++) 
//     { 
//     int temp=(int) (Math.random()*100); 
//     if (temp%2==0) 
//     { 
//     int x=a[i]; 
//     a[i]=a[j]; 
//     a[j]=x; 
//     } 
//     } 
//     }
//     // xao tron nguoc 
//     for (int i=4; i>=0 ; i--) 
//     {
//     for (int j=i-1;j>=0;j--) 
//     { 
//     int temp=(int) (Math.random()*100); 
//     if (temp%2==0) 
//     { 
//     int x=a[i]; 
//     a[i]=a[j]; 
//     a[j]=x; 
//     } 
//     } 
//     }
//     // lấy ra 5 số của dãy sau khi bị xáo trộn
//     final int b=a[0]; 
//     int c=a[1]; 
//     int d=a[2]; 
//     int e=a[3];
//     int f=a[4];
//        final choncauhoi ch= new choncauhoi();

choncauhoi ch= new choncauhoi();
	Button tc=(Button) findViewById(R.id.timchucai);
    tc.setOnClickListener(new View.OnClickListener() {
    	public void onClick(View v) {
     		if(choncauhoi.b==1)
			{
			Intent myintent=new Intent(chontrochoi.this, tim1.class);
			startActivityForResult(myintent, 1234);
			  finish(); 
      		}
			else if(choncauhoi.b==2)
			{
				Intent myintent=new Intent(chontrochoi.this, tim2.class);
				startActivityForResult(myintent, 1234);
				  finish(); 	
			}
			else if(choncauhoi.b==3)
			{
				Intent myintent=new Intent(chontrochoi.this, tim3.class);
				startActivityForResult(myintent, 1234);
				  finish(); 	
			}
			else if(choncauhoi.b==4)
			{
				Intent myintent=new Intent(chontrochoi.this, tim4.class);
				startActivityForResult(myintent, 1234);
				  finish(); 	
			}
			else if(choncauhoi.b==5)
			{
				Intent myintent=new Intent(chontrochoi.this, tim5.class);
				startActivityForResult(myintent, 1234);
				  finish(); 	
			}
		}
		
	});
    Button ta=(Button) findViewById(R.id.chonanhghepchu);
    ta.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View v) {
			if(choncauhoi.b==1)
			{
			Intent myintent=new Intent(chontrochoi.this, chucai1.class);
			startActivityForResult(myintent, 1234);
			  finish(); 
      		}
			else if(choncauhoi.b==2)
			{
				Intent myintent=new Intent(chontrochoi.this, chucai2.class);
				startActivityForResult(myintent, 1234);
				  finish(); 	
			}
			else if(choncauhoi.b==3)
			{
				Intent myintent=new Intent(chontrochoi.this, chucai3.class);
				startActivityForResult(myintent, 1234);
				  finish(); 	
			}
			else if(choncauhoi.b==4)
			{
				Intent myintent=new Intent(chontrochoi.this, chucai4.class);
				startActivityForResult(myintent, 1234);
				  finish(); 	
			}
			else if(choncauhoi.b==5)
			{
				Intent myintent=new Intent(chontrochoi.this, chucai5.class);
				startActivityForResult(myintent, 1234);
				  finish(); 	
			}
		}
		
	});
    Button tctc=(Button) findViewById(R.id.tritue);
    tctc.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View v) {
			Intent myintent=new Intent(chontrochoi.this, trochoi.class);
			startActivityForResult(myintent, 1234);
			  finish(); 
		}
		
	});
    Button back=(Button) findViewById(R.id.quaylai);
    back.setOnClickListener(new View.OnClickListener() {
		
		public void onClick(View v) {
			Intent myintent=new Intent(chontrochoi.this, GameS.class);
			startActivityForResult(myintent, 1234);
			  finish(); 
		}
		
	});
}
}
