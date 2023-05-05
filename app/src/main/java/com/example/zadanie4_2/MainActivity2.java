package com.example.zadanie4_2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    private TextView data;
    private Button restart;
    private String name;
    private String to;
    private String from;
    private String date;
    private String time;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        data = findViewById(R.id.dataMainActivity);
        restart = findViewById(R.id.restart);
        Bundle bundleIntent = getIntent().getExtras();
        name = bundleIntent.get("name").toString();
        to = bundleIntent.get("to").toString();
        from = bundleIntent.get("from").toString();
        date = bundleIntent.get("date").toString();
        time = bundleIntent.get("time").toString();
        final int number1 = new Random().nextInt(90)+10;
        final int number2 = new Random().nextInt(90)+10;
        final int number3 = new Random().nextInt(90)+10;

        data.setText("ФИО " + name + "\n" +
                "Куда " + to + "\n" +
                "Откуда " + from + "\n" +
                "Дата " + date + "\n" +
                "Время " + time + "\n" +
                "Номер " + number1 + number2 + number3);

        restart.setOnClickListener(listener);
    }

    private final View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        }
    };
}