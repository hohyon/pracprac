package com.example.fileculhea;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnwrite = findViewById(R.id.btnWrite);
        Button btnread = findViewById(R.id.btnRead);


//        btnwrite 클릭시 이벤트 실행
        btnwrite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    String string = "김갱범쓰11111";
                    FileOutputStream outputStream = openFileOutput("file.txt", Context.MODE_PRIVATE);

                    outputStream.write(string.getBytes());
                    outputStream.close();

                    Toast.makeText(MainActivity.this,"file.txt 를 생성하여 내용 writing 완료",Toast.LENGTH_SHORT).show();

                }catch(Exception e){

                }
            }
        });
//        btnwrite 클릭시 이벤트 실행 끝


//        btnread 클릭시 이벤트 실행
        btnread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{

                    FileInputStream inputStream = openFileInput("file.txt");
                    byte[] txt = new byte[30];
                    inputStream.read(txt);

                    String string = new String(txt);
                    Toast.makeText(MainActivity.this, string,Toast.LENGTH_SHORT).show();
                    inputStream.close();

                }catch (Exception e){
                    Toast.makeText(MainActivity.this,"파일 없음",Toast.LENGTH_SHORT).show();
                }
            }
        });
//        btnread클릭시 이벤트 실행끝
    }
}
