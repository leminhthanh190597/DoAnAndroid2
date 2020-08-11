package com.example.my.project51;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;

public class Addddddd extends Activity {
	MediaPlayer mp3;
	MediaPlayer amr;
	Button back;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.play);
		GridView g = (GridView) findViewById(R.id.myGrid);
		g.setAdapter(new ImageAdapter(this));
		g.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View v,
					int position, long id) {
				if (+position == 0) {
					mp3 = MediaPlayer.create(Addddddd.this, R.raw.a);
					mp3.start();
				}

				if (+position == 1) {
					mp3 = MediaPlayer.create(Addddddd.this, R.raw.a1);
					mp3.start();
				}
				if (+position == 2) {
					mp3 = MediaPlayer.create(Addddddd.this, R.raw.a2);
					mp3.start();
				}
				if (+position == 3) {
					mp3 = MediaPlayer.create(Addddddd.this, R.raw.b);
					mp3.start();
				}
				if (+position == 4) {
					mp3 = MediaPlayer.create(Addddddd.this, R.raw.c);
					mp3.start();
				}
				if (+position == 5) {
					mp3 = MediaPlayer.create(Addddddd.this, R.raw.d);
					mp3.start();
				}
				if (+position == 6) {
					mp3 = MediaPlayer.create(Addddddd.this, R.raw.d1);
					mp3.start();
				}
				if (+position == 7) {
					mp3 = MediaPlayer.create(Addddddd.this, R.raw.e);
					mp3.start();
				}
				if (+position == 8) {
					mp3 = MediaPlayer.create(Addddddd.this, R.raw.e1);
					mp3.start();
				}
				if (+position == 9) {
					mp3 = MediaPlayer.create(Addddddd.this, R.raw.g);
					mp3.start();
				}
				if (+position == 10) {
					mp3 = MediaPlayer.create(Addddddd.this, R.raw.h);
					mp3.start();
				}
				if (+position == 11) {
					mp3 = MediaPlayer.create(Addddddd.this, R.raw.i);
					mp3.start();
				}
				if (+position == 12) {
					mp3 = MediaPlayer.create(Addddddd.this, R.raw.k);
					mp3.start();
				}
				if (+position == 13) {
					mp3 = MediaPlayer.create(Addddddd.this, R.raw.l);
					mp3.start();
				}
				if (+position == 14) {
					mp3 = MediaPlayer.create(Addddddd.this, R.raw.m);
					mp3.start();
				}
				if (+position == 15) {
					mp3 = MediaPlayer.create(Addddddd.this, R.raw.n);
					mp3.start();
				}
				if (+position == 16) {
					mp3 = MediaPlayer.create(Addddddd.this, R.raw.o);
					mp3.start();
				}
				if (+position == 17) {
					mp3 = MediaPlayer.create(Addddddd.this, R.raw.o1);
					mp3.start();
				}
				if (+position == 18) {
					mp3 = MediaPlayer.create(Addddddd.this, R.raw.o2);
					mp3.start();
				}
				if (+position == 19) {
					mp3 = MediaPlayer.create(Addddddd.this, R.raw.p);
					mp3.start();
				}
				if (+position == 20) {
					mp3 = MediaPlayer.create(Addddddd.this, R.raw.q);
					mp3.start();
				}
				if (+position == 21) {
					mp3 = MediaPlayer.create(Addddddd.this, R.raw.r);
					mp3.start();
				}
				if (+position == 22) {
					mp3 = MediaPlayer.create(Addddddd.this, R.raw.s);
					mp3.start();
				}
				if (+position == 23) {
					mp3 = MediaPlayer.create(Addddddd.this, R.raw.t);
					mp3.start();
				}
				if (+position == 24) {
					mp3 = MediaPlayer.create(Addddddd.this, R.raw.u);
					mp3.start();
				}
				if (+position == 25) {
					mp3 = MediaPlayer.create(Addddddd.this, R.raw.u1);
					mp3.start();
				}
				if (+position == 26) {
					mp3 = MediaPlayer.create(Addddddd.this, R.raw.v);
					mp3.start();
				}
				if (+position == 27) {
					mp3 = MediaPlayer.create(Addddddd.this, R.raw.x);
					mp3.start();
				}
				if (+position == 28) {
					mp3 = MediaPlayer.create(Addddddd.this, R.raw.y);
					mp3.start();
				}
				if (+position == 29) {
					amr = MediaPlayer.create(Addddddd.this, R.raw.mot);
					amr.start();
				}
				if (+position == 30) {
					amr = MediaPlayer.create(Addddddd.this, R.raw.hai);
					amr.start();
				}
				if (+position == 31) {
					amr = MediaPlayer.create(Addddddd.this, R.raw.ba);
					amr.start();
				}
				if (+position == 32) {
					amr = MediaPlayer.create(Addddddd.this, R.raw.bon);
					amr.start();
				}
				if (+position == 33) {
					amr = MediaPlayer.create(Addddddd.this, R.raw.nam);
					amr.start();
				}
				if (+position == 34) {
					amr = MediaPlayer.create(Addddddd.this, R.raw.sau);
					amr.start();
				}
				if (+position == 35) {
					amr = MediaPlayer.create(Addddddd.this, R.raw.bay);
					amr.start();
				}
				if (+position == 36) {
					amr = MediaPlayer.create(Addddddd.this, R.raw.tam);
					amr.start();
				}
				if (+position == 37) {
					amr = MediaPlayer.create(Addddddd.this, R.raw.chin);
					amr.start();
				}
			}
		});
		back=(Button) findViewById(R.id.back);
		back.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent i = new Intent(Addddddd.this,GameS.class);
				startActivity(i);
				finish();
				
			}
		});

	}

	public class ImageAdapter extends BaseAdapter {
		public ImageAdapter(Context c) {
			mContext = c;
		}

		public int getCount() {
			return mThumbIds.length;
		}

		public Object getItem(int position) {
			return position;
		}

		public long getItemId(int position) {
			return position;
		}

		public View getView(int position, View convertView, ViewGroup parent) {
			ImageView imageView;
			if (convertView == null) {
				imageView = new ImageView(mContext);
				imageView.setLayoutParams(new GridView.LayoutParams(80, 100));
				imageView.setAdjustViewBounds(false);
				imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
				imageView.setPadding(1, 1, 1, 1);
			} else {
				imageView = (ImageView) convertView;
			}
			imageView.setImageResource(mThumbIds[position]);
			return imageView;
		}

		private Context mContext;
		private Integer[] mThumbIds = { R.drawable.a, R.drawable.a1,
				R.drawable.a2, R.drawable.b, R.drawable.c, R.drawable.d,
				R.drawable.d1, R.drawable.e, R.drawable.e1, R.drawable.g,
				R.drawable.h, R.drawable.i, R.drawable.k, R.drawable.l,
				R.drawable.m, R.drawable.n, R.drawable.o, R.drawable.o1,
				R.drawable.o2, R.drawable.p, R.drawable.q, R.drawable.r,
				R.drawable.s, R.drawable.t, R.drawable.u, R.drawable.u1,
				R.drawable.v, R.drawable.x, R.drawable.y, R.drawable.t1,
				R.drawable.t2, R.drawable.t3, R.drawable.t4, R.drawable.t5,
				R.drawable.t6, R.drawable.t7, R.drawable.t8, R.drawable.t9 };
	}
}