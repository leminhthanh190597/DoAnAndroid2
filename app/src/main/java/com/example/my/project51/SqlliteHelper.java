package com.example.my.project51;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class SqlliteHelper extends SQLiteOpenHelper {
	public static final String  TABLE_TP ="tbtrieuphu";
    public static final String COLUMN_ID="_ID";
    public static final String COLUMN_Q="Question";
    public static final String COLUMN_A="DAA";		
    public static final String COLUMN_B="DAB";	
    public static final String COLUMN_C="DAC";	
    public static final String COLUMN_D="DAD";
    public static final String COLUMN_True="DATre";
    
    public static final String Database_Name="DB_AiLaTrieuPhu3333";
    private static final int Database_Version=1;

    private static final String DATABASE_CREATE="create table " + TABLE_TP
    		+"("+COLUMN_ID+ " integer primary key AUTOINCREMENT, "
    		+COLUMN_Q+" Text not null,"
    		+ COLUMN_A+" Text not null, "
    		+ COLUMN_B+" Text not null, "
    		+ COLUMN_C+" Text not null, "
    		+ COLUMN_D+" Text not null, "
    		+ COLUMN_True+" Text not null);";
   
   
    public SqlliteHelper(Context context, String name, CursorFactory factory,
			int version) {
		super(context, Database_Name, factory, Database_Version);
	
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		
		db.execSQL(DATABASE_CREATE);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		
		
	}


}
