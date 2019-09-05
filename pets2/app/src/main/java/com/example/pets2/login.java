package com.example.pets2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        int a = 10;
        int b  = 20;

        if (a == b){
            Toast.makeText(this, "Youre in the menu",Toast.LENGTH_SHORT).show();

        }else{
            Toast.makeText(this, "You dont have accss",Toast.LENGTH_SHORT).show();
        }
    }
}
