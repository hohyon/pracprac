package com.example.ho.pracprac;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout baseMenu;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        baseMenu = findViewById(R.id.baseMenu);
        button = findViewById(R.id.btnMenu);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu1,menu);
        return true; //옵션메뉴를 등록하여 출력
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.reset:
                baseMenu.setBackgroundColor(Color.WHITE);
                button.setRotation(0);
                button.setScaleX(1);
                return true;
            case R.id.itemRed:
                baseMenu.setBackgroundColor(Color.RED);
                return true;
            case R.id.itemBlue:
                baseMenu.setBackgroundColor(Color.BLUE);
                return true;
            case R.id.itemGreen:
                baseMenu.setBackgroundColor(Color.GREEN);
                return true;
            case R.id.subRotate:
                button.setRotation(45);
                return true;
            case R.id.subSize:
                button.setScaleX(2);
                return true;
        }
        return false; //정상동작을 막을경우 true
    }
}
