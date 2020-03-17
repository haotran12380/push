package com.example.push;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toast("Hello Git Hub");
        toast("Hello Hao");
    }
    // a lon r cai e up la cai tren a
    private void  TestUpload(){
        int i = 1+1;
    }
    private void toast(String s){
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
}
