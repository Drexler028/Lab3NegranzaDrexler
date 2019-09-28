package com.negranza.lab3negranzadrexler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

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
            Log.d("Error", "No file");
        }
        catch (IOException e){
            Log.d("Error", "IO Error");
        }
        String arr[] = data.split(" ");
        C1.setText(arr[0]);
        C2.setText(arr[1]);
        C3.setText(arr[2]);
        C4.setText(arr[3]);
        C5.setText(arr[4]);
        C6.setText(arr[5]);
        C7.setText(arr[6]);
        C8.setText(arr[7]);
    }

    public void showData(View v){
        String ck = "You are enrolled in: ";
        if(C1.isChecked()){
            ck = ck + " " + C1.getText().toString();
        }
        if(C2.isChecked()){
            ck = ck + " " + C2.getText().toString();
        }
        if(C3.isChecked()){
            ck = ck + " " + C3.getText().toString();
        }
        if(C4.isChecked()){
            ck = ck + " " + C4.getText().toString();
        }
        if(C5.isChecked()){
            ck = ck + " " + C5.getText().toString();
        }
        if(C6.isChecked()){
            ck = ck + " " + C6.getText().toString();
        }
        if(C7.isChecked()){
            ck = ck + " " + C7.getText().toString();
        }
        if(C8.isChecked()){
            ck = ck + " " + C8.getText().toString();
        }
        Toast.makeText(this, ck, Toast.LENGTH_LONG).show();
    }

}
