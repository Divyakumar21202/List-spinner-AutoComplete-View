package com.example.listimplementation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;

public class AutoCompleteViewActivity extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTextView;
    ArrayList<String> arrayList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_view);
        autoCompleteTextView=findViewById(R.id.view_autoComplete);
       for(int i=1;i<100;i++)
       {
           String c=String.valueOf(i);
           arrayList.add("B122"+c);
       }
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,arrayList);
        autoCompleteTextView.setAdapter(arrayAdapter);


    }
}