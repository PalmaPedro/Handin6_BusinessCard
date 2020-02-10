package com.example.handin_week6_businesscard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
    }

    // handles logo image onclick, redirects to MainActivity
    public void goToMainView(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    // handles "contact" button, forwards to page 3
    public void goToPage3(View view) {
        Intent intent = new Intent(this, Page3.class);
        startActivity(intent);
    }


}
