package com.example.lesson_3_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
     private FoodAdapter adapter;
    private ArrayList<String> foodList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        recyclerView = findViewById(R.id.rv_food);
        loadData();
        adapter = new FoodAdapter(foodList);
        recyclerView.setAdapter(adapter);

    }

    private void loadData() {
        foodList.add("Босо лагман");
        foodList.add("Шаурма");
        foodList.add("Тако");
        foodList.add("Рамен");
        foodList.add("Токпокки");
        foodList.add("Курица в кисло сладком");
        foodList.add("Беш бармак");
        foodList.add("Лаз-жи");
        foodList.add("Том-ям");
        foodList.add("Фетучини");
        foodList.add("Манты");
        foodList.add("Пельмени");
        foodList.add("Борщ");
        foodList.add("Картошка по-деревенски");
        foodList.add("Бризоль");
        foodList.add("Гамбургер");

    }
}