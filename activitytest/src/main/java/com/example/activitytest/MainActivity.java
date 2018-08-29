package com.example.activitytest;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RadioGroup group = findViewById(R.id.allRadio);

        Button movepage = findViewById(R.id.movePage);

        movepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;

                switch (group.getCheckedRadioButtonId()) {
                    case R.id.second:
                        intent = new Intent(MainActivity.this, SecondPage.class);
                        startActivity(intent);
                        break;
                    case R.id.third:
                        intent = new Intent(MainActivity.this, ThirdPage.class);
                        startActivity(intent);
                        break;
                    default:
                        AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                        dlg.setTitle("경고");
                        dlg.setNegativeButton("OK",null);
                        dlg.setMessage("라디오 버튼 체크 해");
                        dlg.create();
                        dlg.show();


                }
            }
        });


//        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup radioGroup, int i) {
//
//                Intent intent;
//
//                switch (radioGroup.getCheckedRadioButtonId()) {
//                    case R.id.second:
//                        intent = new Intent(MainActivity.this, SecondPage.class);
//                        startActivity(intent);
//                        break;
//                    case R.id.third:
//                        intent = new Intent(MainActivity.this, ThirdPage.class);
//                        startActivity(intent);
//                }
//            }
//        });


    }
}
