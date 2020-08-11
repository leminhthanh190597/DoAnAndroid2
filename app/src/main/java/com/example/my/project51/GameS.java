package com.example.my.project51;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class GameS extends Activity {
MediaPlayer mp3;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_s);
        mp3=MediaPlayer.create(GameS.this,R.raw.anhbahung);
        mp3.start();
//        Animation a = AnimationUtils.loadAnimation(this, R.anim.translate);
//        a.reset();
        Animation k = AnimationUtils.loadAnimation(this, R.anim.rotate);
        k.reset();
        TextView rText = (TextView) findViewById(R.id.textView1);
//        rText.clearAnimation();
//        rText.startAnimation(a);
        rText.clearAnimation();
        rText.startAnimation(k);
//        LinearLayout layout = (LinearLayout) findViewById(R.id.root);
//        layout.setOnClickListener(new OnClickListener() {
//        @Override public void onClick(View v) {
//        rText.startAnimation(a);
        Button n=(Button) findViewById(R.id.btnNewGame);
        n.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				Intent myintent=new Intent(GameS.this,Addddddd.class);
				startActivityForResult(myintent, 1234);
				  finish(); 
				//startActivity(myintent);
				// TODO Auto-generated method stub
				
			}
		});
        Button t=(Button) findViewById(R.id.btnnhandang);
        t.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				Intent myintent=new Intent(GameS.this,Goiplayss.class);
				startActivityForResult(myintent, 1234);
				  finish(); 
			}
			
		});
        Button tv=(Button) findViewById(R.id.tapvietchu);
        tv.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				Intent myintent=new Intent(GameS.this,vietchu.class);
				startActivityForResult(myintent, 1234);
				  finish(); 
			}
			
		});
        Button m=(Button) findViewById(R.id.trochoi);
        m.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				Intent j = new Intent(GameS.this,chontrochoi.class);
				startActivity(j);
				  finish(); 
			}
			
		});
        //back=(Button) findViewById(R.id.quay);
		//back.setOnClickListener(new OnClickListener() {
			
			//public void onClick(View v) {
				// TODO Auto-generated method stub
				
				//Intent i = new Intent(Goiplayss.this,GameS.class);
				//startActivity(i);
				//finish();
				
			//}
		//});
        Button e=(Button) findViewById(R.id.btnExit);
        e.setOnClickListener(new View.OnClickListener() {

			public void onClick(View v) {
				// TODO Auto-generated method stub
				AlertDialog.Builder dialog = new AlertDialog.Builder(GameS.this);
				dialog.setTitle("Bạn muốn thoát khỏi chương trình hay không ?");
				//dialog.setMessage("Cáº£m Æ¡n báº¡n Ä‘Ă£ tham gia!");
				// dialog.setIcon(R.drawable.icon_question_start);
				dialog.setPositiveButton("Thoát",
						new DialogInterface.OnClickListener() {

							public void onClick(DialogInterface dialog,
									int which) {
								finish();
								System.exit(0);
							};
						});

				dialog.setNegativeButton("Không",
						new DialogInterface.OnClickListener() {

							public void onClick(DialogInterface dialog,
									int which) {
							}
						});
				dialog.show();
			}
		});
    }
    protected void onPause(){ 
        super.onPause(); 
        mp3.release(); 
        finish(); 
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_game_s, menu);
        return true;
    }
}
