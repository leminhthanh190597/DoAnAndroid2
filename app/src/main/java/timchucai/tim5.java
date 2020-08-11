package timchucai;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;
import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;

import com.example.my.project51.R;
import com.example.my.project51.chontrochoi;

public class tim5 extends Activity {
	MediaPlayer mp3;
	MediaPlayer amr;
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timchu);
        mp3=MediaPlayer.create(tim5.this,R.raw.o);
        mp3.start();
        Button nghelai=(Button) findViewById(R.id.nghelai);
		nghelai.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				mp3=MediaPlayer.create(tim5.this,R.raw.o);
		        mp3.start();
				
			}
		});
        GridView g = (GridView) findViewById(R.id.myGrid);
		g.setAdapter(new ImageAdapter(this));
		g.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View v,
					int position, long id) {
				if (+position == 0) {
					mp3 = MediaPlayer.create(tim5.this, R.raw.chinhxac);
					mp3.start();
					Toast.makeText(getApplicationContext(),"Chính xác", Toast.LENGTH_SHORT).show();
				}

				if (+position == 1) {
					Toast.makeText(getApplicationContext(),"Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 2) {
					Toast.makeText(getApplicationContext(),"Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 3) {
					Toast.makeText(getApplicationContext(),"Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 4) {
					Toast.makeText(getApplicationContext(),"Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 5) {
					Toast.makeText(getApplicationContext(),"Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 6) {
					Toast.makeText(getApplicationContext(),"Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 7) {
					Toast.makeText(getApplicationContext(),"Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 8) {
					Toast.makeText(getApplicationContext(),"Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 9) {
					Toast.makeText(getApplicationContext(),"Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 10) {
					Toast.makeText(getApplicationContext(),"Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 11) {
					Toast.makeText(getApplicationContext(),"Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 12) {
					Toast.makeText(getApplicationContext(),"Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 13) {
					Toast.makeText(getApplicationContext(),"Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 14) {
					Toast.makeText(getApplicationContext(),"Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 15) {
					Toast.makeText(getApplicationContext(),"Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 16) {
					Toast.makeText(getApplicationContext(),"Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 17) {
					Toast.makeText(getApplicationContext(),"Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 18) {
					Toast.makeText(getApplicationContext(),"Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 19) {
					Toast.makeText(getApplicationContext(),"Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 20) {
					Toast.makeText(getApplicationContext(),"Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 21) {
					Toast.makeText(getApplicationContext(),"Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 22) {
					Toast.makeText(getApplicationContext(),"Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 23) {
					Toast.makeText(getApplicationContext(),"Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 24) {
					Toast.makeText(getApplicationContext(),"Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 25) {
					Toast.makeText(getApplicationContext(),"Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 26) {
					Toast.makeText(getApplicationContext(),"Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 27) {
					Toast.makeText(getApplicationContext(),"Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 28) {
					Toast.makeText(getApplicationContext(),"Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 29) {
					Toast.makeText(getApplicationContext(),"Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 30) {
					Toast.makeText(getApplicationContext(),"Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 31) {
					Toast.makeText(getApplicationContext(),"Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 32) {
					Toast.makeText(getApplicationContext(),"Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 33) {
					Toast.makeText(getApplicationContext(),"Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 34) {
					Toast.makeText(getApplicationContext(),"Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 35) {
					Toast.makeText(getApplicationContext(),"Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 36) {
					Toast.makeText(getApplicationContext(),"Sai", Toast.LENGTH_SHORT).show();
				}
				if (+position == 37) {
					Toast.makeText(getApplicationContext(),"Sai", Toast.LENGTH_SHORT).show();
				}
			}
		});
		Button back=(Button) findViewById(R.id.back);
		back.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent i = new Intent(tim5.this,chontrochoi.class);
				startActivity(i);
				finish();
				
			}
		});
	
		Button ketiep=(Button) findViewById(R.id.ketiep);
		ketiep.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
//				if(choncauhoi.f==1)
//				{
//					Intent myintent=new Intent(tim5.this, tim1.class);
//					startActivityForResult(myintent, 1234);
//					  finish(); 	
//				}
//				else if(choncauhoi.f==2)
//				{
//					Intent myintent=new Intent(tim5.this, tim2.class);
//					startActivityForResult(myintent, 1234);
//					  finish(); 	
//				}
//				else if(choncauhoi.f==3)
//				{
//					Intent myintent=new Intent(tim5.this, tim3.class);
//					startActivityForResult(myintent, 1234);
//					  finish(); 	
//				}
//				else if(choncauhoi.f==4)
//				{
//					Intent myintent=new Intent(tim5.this, tim4.class);
//					startActivityForResult(myintent, 1234);
//					  finish(); 	
//				}
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
		private Integer[] mThumbIds = { R.drawable.o, R.drawable.x,
				R.drawable.u1, R.drawable.v, R.drawable.t9, R.drawable.e,
				R.drawable.p, R.drawable.y, R.drawable.a2, R.drawable.d1,
				R.drawable.t1, R.drawable.i, R.drawable.h, R.drawable.l,
				R.drawable.t3, R.drawable.n, R.drawable.t6, R.drawable.d,
				R.drawable.o2, R.drawable.a1, R.drawable.q, R.drawable.r,
				R.drawable.s, R.drawable.t, R.drawable.u, R.drawable.t2,
				R.drawable.b, R.drawable.t1, R.drawable.d, R.drawable.r,
				R.drawable.e1, R.drawable.m, R.drawable.t4, R.drawable.t5,
				R.drawable.a, R.drawable.k, R.drawable.t8, R.drawable.c };
}
}
