package com.example.alertdialog2;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView name, email,txt1;
    Button button1;
    EditText editName, editEmail;
    View dialogView, toastView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("User Info");

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        button1 = findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dialogView = View.inflate(getApplicationContext(),R.layout.dialog1,null);

                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("user info");
                dlg.setIcon(R.mipmap.ic_launcher);
                dlg.setView(dialogView);


                dlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        editName = dialogView.findViewById(R.id.editName);
                        editEmail = dialogView.findViewById(R.id.editEmail);

                        name.setText("name : " + editName.getText().toString());
                        email.setText("email : " + editEmail.getText().toString());
                    }
                });

                dlg.setNegativeButton("취소", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast toast = new Toast(getApplicationContext());
                        toastView = View.inflate(getApplicationContext(),R.layout.toast01,null);
                        txt1 = toastView.findViewById(R.id.txt1);
                        txt1.setText("CALCLE");
                        toast.setView(toastView);
                        toast.show();
                    }
                });

                dlg.create();
                dlg.show();
            }
        });

    }
}
