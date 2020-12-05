package com.example.competition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CardsActivity extends AppCompatActivity {
Button btnSodexo ,btnIdentification,btnInsurance ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cards);
        btnSodexo=(Button) findViewById(R.id.btn1) ;
        btnIdentification=(Button) findViewById(R.id.btn2) ;
        btnInsurance=(Button) findViewById(R.id.btn3) ;
        btnIdentification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CardsActivity.this , IdentificationActivity.class) ;
                startActivity(i);
            }
        });

    }
}