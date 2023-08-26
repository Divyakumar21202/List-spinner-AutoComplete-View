package com.example.listimplementation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> arrayList=new ArrayList<>();
    Spinner idSpinner;
    TextView spinner_btn;
    Button btn_auto_complete_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_auto_complete_view=findViewById(R.id.btn_autoComplete_view);
        btn_auto_complete_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_autoComplete=new Intent(getApplicationContext(),AutoCompleteViewActivity.class);
                startActivity(intent_autoComplete);
            }
        });
        spinner_btn=findViewById(R.id.select_id_btn_txt);
        idSpinner=findViewById(R.id.spinner_id_list);
        arrayList.add("Di Patel");
        arrayList.add("DivyaKu atel");
        arrayList.add("DivyaKumar Patel");
        arrayList.add(" Patel");
        arrayList.add("DivyaKumar Patel");
        arrayList.add("DivyaKumar Patel");
        arrayList.add("DivyaKumar Patel");
        arrayList.add("DivyaKumar ");
        arrayList.add("DivyaKumar Patel");

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(getApplication(), android.R.layout.simple_spinner_dropdown_item,arrayList);

        idSpinner.setAdapter(arrayAdapter);


    }
}