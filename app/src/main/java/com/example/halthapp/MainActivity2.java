package com.example.halthapp;

import static com.example.halthapp.MainActivity.value;
import static com.example.halthapp.MainActivity.weight;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Toast;

import com.example.halthapp.databinding.ActivityMain2Binding;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {
    ActivityMain2Binding binding;
    String[] line;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        line = new String[]{"Low-Fat Doesn’t Mean Healthy", "Eggs Are One of the Healthiest Foods You Can Eat"
                , "Sugary drinks are the most fattening food in the Western diet", "Almonds are part of the peach family", "" +
                "Apples give you more energy than coffee.", "Honey is considered a food in its own right and never spoils", "Low-fat usually means “sugar added” and should be considered unhealthy",
                "A Healthy Diet Is More Effective Than Exercise", "Healthy Foods Can Make You Happier", "" +
                "Broccoli contains more protein than steak!", "Apples give you more energy than coffee!", "Pecans are rich with antioxidants!", "" +
                "Pistachios are actually fruits!", "Bananas are berries... and strawberries aren't!", "" +
                "Artificial Trans Fats Are Very Unhealthy!", "Refined Carbohydrates Are Bad for You!", "" +
                "Unprocessed Food Is Healthiest!", "Take News Headlines With a Grain of Salt!"
                , "Meat Doesn’t Rot in Your Colon!"};

//        Random random=new Random(line);
        int random_int = (int)Math.floor(Math.random()*(19-1+1)+1);
        binding.textView3.setText(line[random_int]);
//        Toast.makeText(MainActivity2.this,line.length+"",Toast.LENGTH_LONG).show();
        if (weight <= 30) {
            if (value < 2200) {
                binding.textView.setText("Yes, You are in limit");
            } else {
                binding.textView.setText("No, You are out of in limit");
            }
        } else {
            if (weight > 30 && weight <= 40) {
                if (value < 2800) {
                    binding.textView.setText("Yes, You are in limit");
                } else {
                    binding.textView.setText("No, You are out of in limit");
                }
            } else {
                if (weight > 40 && weight <= 50) {
                    if (value < 2600) {
                        binding.textView.setText("Yes, You are in limit");
                    } else {
                        binding.textView.setText("No, You are out of in limit");
                    }
                } else {
                    if (weight > 50 && weight <= 60) {
                        if (value < 2590) {
                            binding.textView.setText("Yes, You are in limit");
                        } else {
                            binding.textView.setText("No, You are out of in limit");
                        }
                    } else {
                        if (weight > 60 && weight <= 70) {
                            if (value < 2590) {
                                binding.textView.setText("Yes, You are in limit");
                            } else {
                                binding.textView.setText("No, You are out of in limit");
                            }
                        } else {
                            if (weight > 70 && weight <= 80) {
                                if (value < 2000) {
                                    binding.textView.setText("Yes, You are in limit");
                                } else {
                                    binding.textView.setText("No, You are out of in limit");
                                }
                            } else {

                                if (value < 1800) {
                                    binding.textView.setText("Yes, You are in limit");
                                } else {
                                    binding.textView.setText("No, You are out of in limit");
                                }
                            }
                        }
                    }


                }
            }
        }
    }

}