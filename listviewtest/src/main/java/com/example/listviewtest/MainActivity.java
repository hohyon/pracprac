package com.example.listviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button btnAdd;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        btnAdd = findViewById(R.id.btnAdd);
        listView = findViewById(R.id.listView);


        final ArrayList<String> add = new ArrayList<>();
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_single_choice,add);
        listView.setAdapter(adapter);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = editText.getText().toString();
                add.add(str);
                adapter.notifyDataSetChanged(); //어댑터 안에 데이터를 새로고침 해준다(최신화)
                editText.setText(""); //항목추가 후 editText 공백으로 다시..
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int position;
                position = i;
                if(position != ListView.INVALID_POSITION){
                    String str = add.get(position);
                    add.remove(position);
                    Toast.makeText(MainActivity.this, str +"삭제",Toast.LENGTH_SHORT).show();
                    adapter.notifyDataSetChanged();
                }
            }
        });

    }
}
