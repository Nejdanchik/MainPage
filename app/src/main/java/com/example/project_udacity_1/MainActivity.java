package com.example.project_udacity_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean onCreateOptionsMenu(Menu menu){
        menu.add("Главная");
        menu.add("Продукция");
        menu.add("Отзывы");
return super.onCreateOptionsMenu(menu);
    }
}
