package com.example.competition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class EmployeActivity2 extends AppCompatActivity {
    TextView text1 ;
    Button btn ,btn2, btnReclamation;
    Spinner spi ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employe2);
        text1= (TextView) findViewById(R.id.textView) ;
        btn = (Button) findViewById(R.id.btnSearch) ;
        spi = (Spinner) findViewById(R.id.spinner) ;
        btnReclamation = (Button) findViewById(R.id.btnRec) ;
        btn2 = (Button) findViewById(R.id.btnCard) ;


        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,R.array.intents , android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spi.setAdapter(adapter);

        Bundle extras= getIntent().getExtras();
        String n= extras.getString("cle");
        text1.setText("Welcome "+n);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = spi.getSelectedItemPosition();
                Intent intent = null ;
                switch (position) {
                    case 0 :
                        Toast.makeText(getApplicationContext(), "Choose a request please",
                                Toast.LENGTH_SHORT).show();
                        break ;
                    case 1 :
                        intent=new Intent(EmployeActivity2.this,PresenceActivity.class) ;
                        startActivity(intent);
                        break ;
                    case 2 :
                        intent=new Intent(EmployeActivity2.this,SalaryActivity.class) ;
                        startActivity(intent);
                        break ;
                    case 3 :
                        intent=new Intent(EmployeActivity2.this,WorkActivity.class) ;
                        startActivity(intent);
                        break ;
                    case 4 :
                        intent=new Intent(EmployeActivity2.this,JobActivity.class) ;
                        startActivity(intent);
                        break ;
                    case 5 :
                        intent=new Intent(EmployeActivity2.this,LeaveActivity.class) ;
                        startActivity(intent);
                        break ;
                    case 6 :
                        intent=new Intent(EmployeActivity2.this,FreeActivity.class) ;
                        startActivity(intent);
                        break ;
                }
            }
        });
        btnReclamation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(EmployeActivity2.this,ReclamationActivity.class) ;
                startActivity(i);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(EmployeActivity2.this,CardsActivity.class) ;
                startActivity(i);
            }
        });




    }
}