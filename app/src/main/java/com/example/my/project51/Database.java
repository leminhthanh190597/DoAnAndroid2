package com.example.my.project51;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.Cursor;


public class Database extends SQLiteOpenHelper{
	
	private static String DB_PATH="/data/data/com.example.my.project51/databases/";
	private static String DB_NAME="databasecauhoi.sqlite";
	private static final int DATABASE_VERSION=1;
	
	private static final String TABLE_NAME="tablecauhoi";
	private static final String KEY_ID="_id";
	private static final String KEY_CAUHOI="cauhoi";
	private static final String KEY_A="cau_a";
	private static final String KEY_B="cau_b";
	private static final String KEY_C="cau_c";
	private static final String KEY_D="cau_d";
	//private static final String KEY_DA="dapan";
	//private static final String KEY_T="demo";
	
	
	private SQLiteDatabase myDataBase;
	private final Context myContext;
	
	public Database(Context context) {
		super(context,DB_NAME, null, DATABASE_VERSION);
		// TODO Auto-generated constructor stub
		myContext=context;
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}
	
//	public void OpenDataBase() throws SQLException
//	{
//		String myPath=DB_PATH+DB_NAME;
//		myDataBase =SQLiteDatabase.openDatabase(myPath,null,SQLiteDatabase.OPEN_READONLY);
//		
//	}

	@Override
	public synchronized void close() {
		// TODO Auto-generated method stub
		if(myDataBase!=null)
			myDataBase.close();
		super.close();
	}
	
	private boolean checkDatabase()
	{
		SQLiteDatabase checkDB=null;
		try{
			String myPath=DB_PATH+DB_NAME;
			checkDB =SQLiteDatabase.openDatabase(myPath,null,SQLiteDatabase.OPEN_READONLY);
		}catch(Exception e)
		{
			
		}
		if(checkDB!=null)
			checkDB.close();
		return checkDB !=null?true:false;
	}
	private void copyDataBase() throws IOException
	{
		InputStream myInput =myContext.getAssets().open(DB_NAME);
		String outFileName=DB_PATH+DB_NAME;
		
		OutputStream myOutput=new FileOutputStream(outFileName);
		byte[] buffer =new byte[1024];
		int length;
		while((length=myInput.read(buffer))>0)
		{
			myOutput.write(buffer,0,length);
		}
		myOutput.flush();
		myOutput.close();
		myInput.close();
	}
	public void CreateDataBase() throws IOException{
		boolean dbExist=checkDatabase();
		if(dbExist)
		{
			
		}
		else
		{
			this.getReadableDatabase();
			try{
				copyDataBase();
			}
			catch(Exception e)
			{
				
			}
		}
	}
	
	public Cursor laytatcacauhoi()
	{
		SQLiteDatabase db=this.getReadableDatabase();
		Cursor contro=db.rawQuery("select * from "+TABLE_NAME,null);
		return contro;
	}
	
	public List<Dayhoc> layNcaungaunghien(int socau)
	{
		List<Dayhoc> ds=new ArrayList<Dayhoc>();
		String limit="0,"+socau;
		SQLiteDatabase db=this.getReadableDatabase();
		Cursor contro=db.query(TABLE_NAME,
				null, 
				null, 
				null, 
				null, 
				null, 
				"random()",
				limit);
		contro.moveToFirst();
		do{
			Dayhoc x=new Dayhoc();
			x._id=Integer.parseInt(contro.getString(0));
			x.cauhoi=contro.getString(1);
			x.cau_a=contro.getString(2);
			x.cau_b=contro.getString(3);
			x.cau_c=contro.getString(4);
			x.cau_d=contro.getString(5);
			x.dapan=contro.getString(6);
			ds.add(x);
		}while(contro.moveToNext());
		
		return ds;
		
	}
}
