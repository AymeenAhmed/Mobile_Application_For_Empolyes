package com.example.competition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
   Button buttonAdmin  ;
   Button buttonEmpl ;
   Button buttonAdminstr ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonAdmin = (Button)findViewById(R.id.btn1);
        buttonEmpl = (Button)findViewById(R.id.btn2);
        buttonAdminstr = (Button)findViewById(R.id.btn3);

        buttonEmpl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,EmployeActivity.class) ;
                startActivity(i);
                            }
        });


    }
}