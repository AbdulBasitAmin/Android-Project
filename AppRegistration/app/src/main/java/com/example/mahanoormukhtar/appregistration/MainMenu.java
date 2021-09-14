package com.example.mahanoormukhtar.appregistration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {
    Button btn_showAll,btn_searchrecord;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        btn_showAll=(Button)findViewById(R.id.btn_ShowList);
        btn_searchrecord=(Button)findViewById(R.id.btn_search);

        btn_showAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this, ShowAllRecord.class);
                startActivity(intent);

            }
        });

        btn_searchrecord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenu.this, SearchRecord.class);
                startActivity(intent);
            }
        });
    }
}
