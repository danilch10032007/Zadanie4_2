package com.example.zadanie4_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText nameIn;
    private EditText toIn;
    private EditText fromIn;
    private EditText dateIn;
    private EditText timeIn;
    private Button button;
    private String name;
    private String to;
    private String from;
    private String date;
    private String time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameIn = findViewById(R.id.nameIn);
        toIn = findViewById(R.id.toIn);
        fromIn = findViewById(R.id.fromIn);
        dateIn = findViewById(R.id.dateIn);
        timeIn = findViewById(R.id.timeIn);
        button = findViewById(R.id.end);

        button.setOnClickListener(listener);
    }

    private final View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            name = nameIn.getText().toString();
            to = toIn.getText().toString();
            from = fromIn.getText().toString();
            date = dateIn.getText().toString();
            time = timeIn.getText().toString();

            Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
            intent.putExtra("name", name);
            intent.putExtra("to", to);
            intent.putExtra("from", from);
            intent.putExtra("date", date);
            intent.putExtra("time", time);
            startActivity(intent);
        }
    };
}