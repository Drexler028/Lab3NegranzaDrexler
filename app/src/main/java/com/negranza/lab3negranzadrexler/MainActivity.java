package com.negranza.lab3negranzadrexler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    EditText et1, et2, et3, et4, et5, et6, et7, et8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.editText2);
        et2 = findViewById(R.id.editText3);
        et3 = findViewById(R.id.editText4);
        et4 = findViewById(R.id.editText5);
        et5 = findViewById(R.id.editText6);
        et6 = findViewById(R.id.editText7);
        et7 = findViewById(R.id.editText8);
        et8 = findViewById(R.id.editText9);
    }


    public void next(View v) {
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);
    }

    public void saveData(View v) {
        String data1 = et1.getText().toString();
        String data2 = et2.getText().toString();
        String data3 = et3.getText().toString();
        String data4 = et4.getText().toString();
        String data5 = et5.getText().toString();
        String data6 = et6.getText().toString();
        String data7 = et7.getText().toString();
        String data8 = et8.getText().toString();
        String BigData = data1 + " " + data2 + " " + data3 + " " + data4 + " " + data5 + " " + data6 + " " + data7 + " " + data8;
        FileOutputStream writer = null;
        try {
            writer = openFileOutput("data.txt", MODE_PRIVATE);
            writer.write(data1.getBytes());
            writer.write(data2.getBytes());
            writer.write(data3.getBytes());
            writer.write(data4.getBytes());
            writer.write(data5.getBytes());
            writer.write(data6.getBytes());
            writer.write(data7.getBytes());
            writer.write(data8.getBytes());
        } catch (FileNotFoundException e) {
            Log.d("Error", "File not found");
        } catch (IOException e){
            Log.d("Error", "IO Error");
        } finally {
            try {
                writer.close();
            } catch (IOException e) {
                Log.d("Error", "File not found");
            }
        }
        Toast.makeText(this, "Data saved", Toast.LENGTH_LONG).show();
    }

}