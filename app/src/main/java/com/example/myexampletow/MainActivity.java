package com.example.myexampletow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner=findViewById(R.id.span);
    }

    public void btnonclick(View view) {
        String item=spinner.getSelectedItem().toString();
        Toast.makeText(this,item,Toast.LENGTH_SHORT).show();

    }
}