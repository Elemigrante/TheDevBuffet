package com.dmitryneladnov.thedevbuffet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class StartersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters);

        ListView startersList = findViewById(R.id.list_view_starters);

        String[] starterDishes = {
                "Spinach and cheese wontons",
                "Spinach and pesto gyoza",
                "Thyme and pesto soup",
                "Chilli and persimmon dumplings",
                "Parsley and squid soup",
                "Pineapple and orange soup",
                "Ricotta and pheasant gyoza",
                "Pancetta and cannellini soup",
                "Cheese and squash gyoza",
                "Stilton and trout soup",
                "Trout and leek parcels",
                "Rabbit and beetroot soup",
                "Ricotta and horseradish wontons",
                "Cabbage and sausage soup",
                "Garam masala and pigeon parcels",
                "Cardamom and fennel soup",
                "Leek and chicken wontons",
                "Trout and sausage wontons",
                "Peppercorn and crab gyoza",
                "Aubergine and salmon uramaki"
        };

    }
}