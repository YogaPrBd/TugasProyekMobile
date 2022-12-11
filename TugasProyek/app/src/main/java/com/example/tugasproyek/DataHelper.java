package com.example.tugasproyek;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
public class DataHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "dataRumahSakit.db";
    private static final int DATABASE_VERSION = 1;
    public DataHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
// TODO Auto-generated constructor stub
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
// TODO Auto-generated method stub
        String sql1 = "create table daftarRS(idRS integer primary key, namaRS text null, noTelp integer null, alamat text null);";
        String sql2 = "create table fasilitas(idFsl integer primary key, namaFsl text null);";
        Log.d("Data", "onCreate: " + sql1);
        Log.d("Data", "onCreate: " + sql2);
        db.execSQL(sql1);
        sql1 = "INSERT INTO daftarRS (idRS, namaRS, noTelp, alamat) VALUES ('1001', 'RSPAU. Hardjolukito', '0274444715', 'Jl. Ringroad Timur, Karang Janbe, Banguntapan, Kec. Banguntapan, Kabupaten Bantul, Daerah Istimewa Yogyakarta');";
        db.execSQL(sql1);

        db.execSQL(sql2);
        sql2 = "INSERT INTO fasilitas (idFsl, namaFsl) VALUES ('1101','Instalasi Gawat Darurat'), ('1102','Poliklinik Paru'), ('1103','Poliklinik Bedah'), ('1104','Poliklinik Jantung'), ('1105','Poliklinik Syaraf')";
        db.execSQL(sql2);
    }
    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2)
    {
// TODO Auto-generated method stub
    }
}