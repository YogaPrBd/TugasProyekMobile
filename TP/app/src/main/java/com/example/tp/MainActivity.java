package com.example.tp;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "mainactivity";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainmenu);

        Log.d(TAG, "onCreate()");
        Toast.makeText(this, "Create", Toast.LENGTH_LONG).show();
    }

    protected void onStart(){
        super.onStart();
        Log.d(TAG, "onStart");
        Toast.makeText(MainActivity.this, "Start", Toast.LENGTH_LONG).show();
    }

    protected void onResume(){
        super.onResume();
        Log.d(TAG, "onResume");
        Toast.makeText(this, "Resume", Toast.LENGTH_LONG).show();
    }

    protected void onPause(){
        super.onPause();
        Log.d(TAG, "onPause");
        Toast.makeText(this, "Pause", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
        Toast.makeText(this, "Stop", Toast.LENGTH_LONG).show();
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "onDestroy");
        Toast.makeText(this, "Destroy", Toast.LENGTH_LONG).show();
    }

    public void lihatDetail(View view){
        setContentView(R.layout.detail);
    }

    public void kembali(View view){
        setContentView(R.layout.mainmenu);
    }

    public void register(View view){
        setContentView(R.layout.regist);
    }

    public void login(){
        Toast.makeText(this, "Login", Toast.LENGTH_LONG) .show();
        setContentView(R.layout.login);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    public boolean onOptionItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.account:
                login();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}