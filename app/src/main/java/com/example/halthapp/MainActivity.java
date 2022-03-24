package com.example.halthapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.halthapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    public static int weight;
    public static int value=0;
    String[] food = {
            "Raw Egg",

            "Boiled Egg",
            "Fried Egg",
            "Poached Egg",
           " Shirred Egg",
            "Scrambled Egg",
            "Egg nogs",
            "Egg rolls",
            "Egg Yolk",
            "Omelette",
            "honey",
            "dates","Maple Syrup","molasses","agave nectar"
    };
    int [] cal={215,233,294,214,304,222,132,294,483,231,456,423,415,390,435,465};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayAdapter ad
                = new ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item,
                food);
        binding.coursesspinner.setAdapter(ad);

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               int temp=binding.coursesspinner.getSelectedItemPosition();
               value=value+cal[temp];

            }
        });
        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(MainActivity.this,value+"",Toast.LENGTH_LONG);
                 weight = Integer.parseInt( binding.editTextTextPersonName.getText().toString());


                startActivity(new Intent(MainActivity.this,MainActivity2.class));
            }

        });


    }

}
