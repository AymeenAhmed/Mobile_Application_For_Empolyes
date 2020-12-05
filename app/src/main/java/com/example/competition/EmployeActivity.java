package com.example.competition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EmployeActivity extends AppCompatActivity {
Button signup ;
Button signin ;
EditText namein ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employe);
        signin = (Button)findViewById(R.id.button);
        signup = (Button) findViewById(R.id.button2) ;
        namein = (EditText) findViewById(R.id.Namein);



        signin.setOnClickListener(new View.OnClickListener() {
            String resultat = namein.getText().toString() ;
            @Override
            public void onClick(View view) {
                Intent i = new Intent(EmployeActivity.this , EmployeActivity2.class ) ;
                i.putExtra("cle",namein.getText().toString()  );
                startActivity(i);
            }
        });


    }
}