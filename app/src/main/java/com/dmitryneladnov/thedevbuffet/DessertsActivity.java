package com.dmitryneladnov.thedevbuffet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DessertsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desserts);

        ListView dessertsList = findViewById(R.id.list_view_desserts);

        Dish[] desserts = {
                new Dish("Weetabix and date bread", "Crunchy bread made with weetabix and moist date", 1250),
                new Dish("Stilton and lemon biscuits", "Crumbly biscuits made with stilton and fresh lemon", 1199),
                new Dish("Paneer and tofu kebab", "Skewer-cooked fried paneer and smoked tofu served in warm pitta pockets", 899),
                new Dish("Chilli and durian cheesecake", "A velvety cheesecake layered with spicy chilli and fresh durian", 1099),
                new Dish("Parsnip and dill stir fry", "Crunchy stir fry featuring fresh parsnips and dried dill", 1450),
                new Dish("Kohlrabi and prune pie", "A shortcrust pasty case filled with kohlrabi and fresh prune", 999),
                new Dish("Chocolate and caramel cheesecake", "A velvety cheesecake layered with white chocolate and caramel", 766),
                new Dish("Yeast and coconut bread", "Crunchy bread made with dried yeast and fresh coconut", 1210),
                new Dish("Mushroom and aubergine sushi", "Chanterelle mushroom and chargrilled aubergine on a bed of sushi rice", 1399),
                new Dish("Rhubarb and hazelnut cake", "Moist cake made with fresh rhubarb and hazelnut", 1099)
        };

        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, desserts);
        dessertsList.setAdapter(dishesAdapter);
    }
}