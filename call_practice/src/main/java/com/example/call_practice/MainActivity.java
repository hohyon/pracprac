package com.example.call_practice;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("test");
        android.util.Log.i("test","onCreate()");

        Button btnCall = findViewById(R.id.call);
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("tel:010-4049-1840");
                Intent intent = new Intent(Intent.ACTION_DIAL,uri);
                startActivity(intent)q;
            }
        });
    }
}
