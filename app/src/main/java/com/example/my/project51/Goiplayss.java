package com.example.my.project51;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

@SuppressWarnings("deprecation")
public class Goiplayss extends Activity {
	MediaPlayer amr;
	Button back;
	Integer[] imageIDs = { R.drawable.conca, R.drawable.concua,
			R.drawable.conga, R.drawable.conheo, R.drawable.contrau,
			R.drawable.maygiat, R.drawable.mayvitinh, R.drawable.ngoinha,
			R.drawable.oto, R.drawable.quacam, R.drawable.quachuoi,
			R.drawable.taubien, R.drawable.tauhoa, R.drawable.tulanh,
			R.drawable.xedap, R.drawable.xemay, R.drawable.tao, R.drawable.kk,
			R.drawable.kk, R.drawable.kk, R.drawable.kk, R.drawable.kk,
			R.drawable.kk, R.drawable.kk, R.drawable.kk, R.drawable.kk,
			R.drawable.kk, R.drawable.kk };

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.playss);
		Gallery gallery = (Gallery) findViewById(R.id.gallery1);
		final TextView txt1;
		txt1 = (TextView) findViewById(R.id.textView1);
		gallery.setAdapter(new ImageAdapter(getApplicationContext()));
	//	gallery.setAdapter(new ImageAdapter(getApplicationContext();
		gallery.setOnItemClickListener(new OnItemClickListener() {

			public void onItemClick(AdapterView<?> arg0, View arg1, int position,
					long id) {
				// TODO Auto-generated method stub
				Toast.makeText(getBaseContext(), "pic" + (position + 1)
						+ " selected", Toast.LENGTH_SHORT);
				ImageView imageView = (ImageView) findViewById(R.id.image1);
				imageView.setImageResource(imageIDs[position]);
				if (position == 0){
					amr = MediaPlayer.create(Goiplayss.this, R.raw.conca);
				    amr.start();
					txt1.setText("Con cá");}
				if (position == 1){
					amr = MediaPlayer.create(Goiplayss.this, R.raw.concua);
				    amr.start();
					txt1.setText("Con cua");}
				if (position == 2){
					amr = MediaPlayer.create(Goiplayss.this, R.raw.conga);
				    amr.start();
					txt1.setText("Con gà");}
				if (position == 3){
					amr = MediaPlayer.create(Goiplayss.this, R.raw.conheo);
				    amr.start();
					txt1.setText("Con heo");}
				if (position == 4){
					amr = MediaPlayer.create(Goiplayss.this, R.raw.contrau);
				    amr.start();
					txt1.setText("Con trâu");}
				if (position == 5){
					amr = MediaPlayer.create(Goiplayss.this, R.raw.maygiat);
				    amr.start();
					txt1.setText("Máy giặt");}
				if (position == 6){
					amr = MediaPlayer.create(Goiplayss.this, R.raw.mayvitinh);
				    amr.start();
					txt1.setText("Máy vi tính");}
				if (position == 7){
					amr = MediaPlayer.create(Goiplayss.this, R.raw.ngoinha);
				    amr.start();
					txt1.setText("Ngôi nhà");}
				if (position == 8){
					amr = MediaPlayer.create(Goiplayss.this, R.raw.oto);
				    amr.start();
					txt1.setText("Ô tô");}
				if (position == 9){
					amr = MediaPlayer.create(Goiplayss.this, R.raw.quacam);
				    amr.start();
					txt1.setText("Quả cam");}
				if (position == 10){
					amr = MediaPlayer.create(Goiplayss.this, R.raw.quachuoi);
				    amr.start();
					txt1.setText("Quả chuối");}
				if (position == 11){
					amr = MediaPlayer.create(Goiplayss.this, R.raw.tauthuy);
				    amr.start();
					txt1.setText("Tàu thuỷ");}
				if (position == 12){
					amr = MediaPlayer.create(Goiplayss.this, R.raw.tauhoa);
				    amr.start();
					txt1.setText("Tàu hoả");}
				if (position == 13){
					amr = MediaPlayer.create(Goiplayss.this, R.raw.tulanh);
				    amr.start();
					txt1.setText("Tủ lạnh");}
				if (position == 14){
					amr = MediaPlayer.create(Goiplayss.this, R.raw.xedap);
				    amr.start();
					txt1.setText(" Xe đạp");}
				if (position == 15){
					amr = MediaPlayer.create(Goiplayss.this, R.raw.xemay);
				    amr.start();
					txt1.setText(" Xe máy");}
				if (position == 16){
					amr = MediaPlayer.create(Goiplayss.this, R.raw.quatao);
				    amr.start();
					txt1.setText("Quả táo");}
				
			}
		});
		back=(Button) findViewById(R.id.quay);
		back.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent i = new Intent(Goiplayss.this,GameS.class);
				startActivity(i);
				finish();
				
			}
		});
	}


	public class ImageAdapter extends BaseAdapter {
		private Context context;
		private int itemBackground;

		public ImageAdapter(Context c) {
			context = c;
			// ---setting the style---
			TypedArray a = obtainStyledAttributes(R.styleable.Gallery1);
			itemBackground = a.getResourceId(
					R.styleable.Gallery1_android_galleryItemBackground, 0);
			a.recycle();
		}

		// ---returns the number of images---
		public int getCount() {
			return imageIDs.length;
		}

		// ---returns the ID of an item---
		public Object getItem(int position) {
			return position;
		}

		public long getItemId(int position) {
			return position;
		}
	

		// ---returns an ImageView view---
		public View getView(int position, View convertView, ViewGroup parent) {
			ImageView imageView = new ImageView(context);
			imageView.setImageResource(imageIDs[position]);
			imageView.setScaleType(ImageView.ScaleType.FIT_XY);
			imageView.setLayoutParams(new Gallery.LayoutParams(150, 120));
			imageView.setBackgroundResource(itemBackground);
			return imageView;
		}
	}
}