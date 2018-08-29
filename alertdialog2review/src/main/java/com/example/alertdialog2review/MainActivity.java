package com.example.alertdialog2review;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView name,age,txt1;
    Button btnstart;
    EditText editName, editAge;
    View dialogView, toastView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("dialog");

        name = findViewById(R.id.name);
        age = findViewById(R.id.age);
        btnstart = findViewById(R.id.btnStart);

        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dialogView = View.inflate(getApplicationContext(),R.layout.dialog1,null);

                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("정보입력");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setView(dialogView);



                dlg.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        editName = dialogView.findViewById(R.id.editName);
                        editAge = dialogView.findViewById(R.id.editAge);

                        name.setText("이름 : " + editName.getText().toString());
                        age.setText("나이 : " + editAge.getText().toString());

                    }
                });

                dlg.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                        Toast toast = new Toast(getApplicationContext());
                        toastView = View.inflate(getApplicationContext(),R.layout.toast01,null);

                        txt1 = toastView.findViewById(R.id.txt1);
                        txt1.setText("우와 ~~ ");
                        toast.setView(toastView);
                        toast.show();

                    }
                });
                dlg.show();

            }
        });

    }
}
