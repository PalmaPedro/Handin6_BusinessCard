package com.example.handin_week6_businesscard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // method to handle button click
    public void goToPage2(View view){
        Intent intent=new Intent(this, Page2Activity.class);
        startActivity(intent);

    }
}
