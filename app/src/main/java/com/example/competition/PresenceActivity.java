package com.example.competition;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class PresenceActivity extends AppCompatActivity {
    Spinner spinner ;
    Button bttn ;
    EditText poste , reason , phone ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presence);
        spinner =(Spinner) findViewById(R.id.spinner1) ;
        bttn = (Button) findViewById( R.id.button4) ;
        poste = (EditText) findViewById(R.id.poste1) ;
        reason = (EditText) findViewById(R.id.raison1) ;
        phone = (EditText) findViewById(R.id.phone1) ;


        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,R.array.langues , android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String S = poste.getText().toString() ;
                String R = reason.getText().toString() ;
                String p = phone.getText().toString() ;
                if(S.isEmpty() || R.isEmpty() || p.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "please complete all fields",
                            Toast.LENGTH_SHORT).show();
                }
                else {
                    AlertDialog.Builder myAlertBuilder = new
                            AlertDialog.Builder(PresenceActivity.this);
                    // Set the dialog title and message.
                    myAlertBuilder.setTitle("Your request was sent successfully");
                    myAlertBuilder.setMessage("Click OK to go back, or Cancel to send another attendance certificate request:");
                    // Add the dialog buttons.
                    myAlertBuilder.setPositiveButton("OK", new
                            DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    // User clicked OK button.
                                    Intent i = new Intent(PresenceActivity.this ,EmployeActivity2.class) ;
                                    startActivity(i);
                                }
                            });
                    myAlertBuilder.setNegativeButton("Cancel", new
                            DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    // User cancelled the dialog.
                                    Intent i = new Intent(PresenceActivity.this ,PresenceActivity.class) ;
                                    startActivity(i);

                                }
                            });
// Create and show the AlertDialog.
                    myAlertBuilder.show();

                }

                }


        });
    }
}