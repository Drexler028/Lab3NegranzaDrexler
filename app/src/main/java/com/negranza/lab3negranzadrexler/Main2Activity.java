package com.negranza.lab3negranzadrexler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main2Activity extends AppCompatActivity {
    CheckBox C1, C2, C3, C4, C5, C6, C7, C8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        C1 = findViewById(R.id.checkBox);
        C2 = findViewById(R.id.checkBox2);
        C3 = findViewById(R.id.checkBox3);
        C4 = findViewById(R.id.checkBox4);
        C5 = findViewById(R.id.checkBox5);
        C6 = findViewById(R.id.checkBox6);
        C7 = findViewById(R.id.checkBox7);
        C8 = findViewById(R.id.checkBox8);

        FileInputStream reader = null;
        String data = "";
        try {
            reader = openFileInput("data.txt");
            int token;

            while ((token = reader.read()) !=-1){
                data = data + (char)token;
            }
        }
        catch (FileNotFoundException e){
            
        }
    }

}
