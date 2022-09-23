package com.example.clickcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button_novekvo;
    private TextView textview;
    private Button button_csokkeno;
    private  int szam;




    private void init(){
        button_novekvo = findViewById(R.id.button_novekvo);
        button_csokkeno = findViewById(R.id.button_csokkeno);
        textview = findViewById(R.id.textview);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        button_novekvo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                szam ++;

                textview.setText(String.valueOf(szam));

                if (szam > 0) {
                    textview.setTextColor(Color.parseColor("#00ff00"));
                }
                else if (szam < 0){
                    textview.setTextColor(Color.parseColor("#FF0000"));
                }
                else{
                    textview.setTextColor(Color.parseColor("#0000FF"));
                }

            }
        });

        button_csokkeno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                szam --;
                textview.setText(String.valueOf(szam));

                if (szam > 0) {
                    textview.setTextColor(Color.parseColor("#00FF00"));
                }
                else if (szam < 0){
                    textview.setTextColor(Color.parseColor("#FF0000"));
                }
                else{
                    textview.setTextColor(Color.parseColor("#0000FF"));
                }

            }
        });

        textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                szam = 0;
                textview.setText(String.valueOf(szam));

                textview.setTextColor(Color.parseColor("#0000FF"));

            }

            });
    }
}

