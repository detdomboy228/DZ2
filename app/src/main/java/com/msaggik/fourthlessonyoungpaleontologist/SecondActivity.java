package com.msaggik.fourthlessonyoungpaleontologist;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Date;
import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    private Ticket tick;
    public TextView body;
    public Button button;
    public Button buttonReturn;
    public ImageView payed;

    @SuppressLint({"SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        body = findViewById(R.id.ticket);
        button = findViewById(R.id.button);
        buttonReturn = findViewById(R.id.buttonReturn);
        payed = findViewById(R.id.payed);

        button.setOnClickListener(listener -> {
            payed.setImageResource(R.drawable.payed);
            button.setText("ОПЛАЧЕНО");
        });

        buttonReturn.setOnClickListener(listener -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        });

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            tick = (Ticket) bundle.getSerializable(Ticket.class.getSimpleName());
        }
        Date time = new Date();
        long msecs = time.getTime();
        Date currDate = new Date(msecs);
        Random r = new Random();
        body.setText("Билет от " + currDate + '\n' +
                "Имя: " + tick.getName() + '\n' +
                "E-mail: " + tick.getEmail() + '\n' +
                "Место отравления: " + tick.getPlaceFrom() + '\n' +
                "Дата отпраления: " + tick.getDateFrom() + '\n' +
                "Место прибытия: " + tick.getPlaceTo() + '\n' +
                "Дата прибытия: " + tick.getDateTo() + '\n' +
                "СТОИМОСТЬ: " + (r.nextInt(3000) + 4000) + " рублей");
    }
}