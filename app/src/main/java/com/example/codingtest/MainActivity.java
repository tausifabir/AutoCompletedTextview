package com.example.codingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private AutoCompleteTextView autoCompleteTextView;
    private ArrayList<String> arrayList = new ArrayList<>();
    private String [] wordList = {"Hello","World"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        autoCompleteTextView = findViewById(R.id.autoCompleteTextView);

        arrayList.add("Hello");
        arrayList.add("World");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,wordList);
        autoCompleteTextView.setAdapter(arrayAdapter);



        if(editText.toString().equals("hellllllo")){
            editText.setText(arrayList.get(0));
        }else if(editText.toString().equals("Wooooorld")){
            editText.setText(arrayList.get(1));
        }



    }
}