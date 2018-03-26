package com.example.peppe.git;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //view layout
    private TextView vMessaggio;
    private Button vAggiungi;
    private Button vDiminuisci;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //imposto riferimenti layout
        vMessaggio= findViewById(R.id.textMessaggio);
        vAggiungi= findViewById(R.id.btnAggiungi);
        vDiminuisci=findViewById((R.id.btnDiminuisci);
    }
}
