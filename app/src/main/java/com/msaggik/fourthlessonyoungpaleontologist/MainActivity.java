package com.msaggik.fourthlessonyoungpaleontologist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public Button button;
    public EditText name;
    public EditText email;
    public EditText placeFrom;
    public EditText dateFrom;
    public EditText placeTo;
    public EditText dateTo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        placeFrom = findViewById(R.id.placeFrom);
        dateFrom = findViewById(R.id.dateFrom);
        placeTo = findViewById(R.id.placeTo);
        dateTo = findViewById(R.id.dateTo);

        button.setOnClickListener(listener -> {
            Ticket ticket = new Ticket(name.getText().toString(), email.getText().toString(), placeFrom.getText().toString(), dateFrom.getText().toString(), placeTo.getText().toString(), dateTo.getText().toString());
            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
            intent.putExtra(Ticket.class.getSimpleName(), ticket);
            intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
            startActivity(intent);
        });
    }
}