package com.example.peppe.git;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //view layout
    private TextView vMessaggio;
    private Button vAggiungi;
    private Button vDiminuisci;
    private Button vAzzera;
    private CheckBox vRaddoppia;

    private int Contatore = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //imposto riferimenti layout
        vMessaggio= findViewById(R.id.textMessaggio);
        vAggiungi= findViewById(R.id.btnAggiungi);
        vDiminuisci=findViewById((R.id.btnDiminuisci));
        vAzzera= findViewById((R.id.btnAzzera));
        vRaddoppia= findViewById((R.id.checkRaddoppia));

        //imposto azioni pulsati
        vAggiungi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Contatore++;
                VisualizzaMessaggio();
            }
        });

        vDiminuisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Contatore--;
                VisualizzaMessaggio();
            }
        });
    }

    /**
     * funzione che visualizza il valore del contatore
     */

    private void VisualizzaMessaggio ()
    {
        vMessaggio.setText(getString(R.string.valore  +  Contatore));
    }

}
