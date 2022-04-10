package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void sendnow(View view){
        Toast.makeText(this, "Sending Data From My App", Toast.LENGTH_SHORT).show();
    }
    public  void  receivenow(View view){
        Toast.makeText(this, "Receiving Data From App", Toast.LENGTH_SHORT).show();
    }
    public void deletenow(View view){
        Toast.makeText(this, "Deleting Data From App", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}