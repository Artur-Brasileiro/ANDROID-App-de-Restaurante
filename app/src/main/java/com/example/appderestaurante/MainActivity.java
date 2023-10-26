package com.example.appderestaurante;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import com.example.appderestaurante.adapter.FoodAdapter;
import com.example.appderestaurante.databinding.ActivityMainBinding;
import com.example.appderestaurante.model.Food;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private FoodAdapter foodAdapter;
    private ArrayList<Food> foodList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        RecyclerView recyclerViewFood = binding.RecyclerViewFood;
        recyclerViewFood.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewFood.setHasFixedSize(true);
        foodAdapter = new FoodAdapter(foodList, this);
        recyclerViewFood.setAdapter(foodAdapter);
        getFood();
    }

    private  void getFood() {
        Food food1 = new Food(
            R.drawable.food1,
            "food1",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna.",
            "$ 120.00"
        );
        foodList.add(food1);

        Food food2 = new Food(
                R.drawable.food2,
                "food2",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna.",
                "$ 80.00"
        );
        foodList.add(food2);

        Food food3 = new Food(
                R.drawable.food3,
                "food3",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna.",
                "$ 75.00"
        );
        foodList.add(food3);

        Food food4 = new Food(
                R.drawable.food4,
                "food4",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna.",
                "$ 45.00"
        );
        foodList.add(food4);

        Food food5 = new Food(
                R.drawable.food5,
                "food5",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna.",
                "$ 50.00"
        );
        foodList.add(food5);
    }
}