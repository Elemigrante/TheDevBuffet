package com.dmitryneladnov.thedevbuffet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class StartersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters);

        ListView startersList = findViewById(R.id.list_view_starters);

        Dish[] starterDishes = {
                new Dish("Salmon and fish dumplings", "Thin pastry cases stuffed with freshly-caught salmon and fish", 999),
                new Dish("Feta and rosemary dumplings", "Thin pastry cases stuffed with tangy feta and fresh rosemary", 1148),
                new Dish("Aubergine and sweetcorn dumplings", "Thin pastry cases stuffed with salted aubergine and creamed sweetcorn", 545),
                new Dish("Ginger and tofu soup", "Fresh ginger and marinaded tofu combined into creamy soup", 625),
                new Dish("Tomatillo and broccoli soup", "Fresh tomatillo and broccoli combined into chunky soup", 1056),
                new Dish("Broccoli and cucumber soup", "Fresh broccoli and cucumber combined into creamy soup", 899),
                new Dish("Chilli and aubergine dip", "A dip made from scotch bonnet chilli and fresh aubergine", 799),
                new Dish("Chickpea and chilli gyoza", "Thin pastry cases stuffed with fresh chickpea and green chilli", 699),
                new Dish("Sprout and pineapple soup", "Fresh sprout and pineapple combined into creamy soup", 599),
                new Dish("Egusi and borscht soup", "Egusi and borscht combined into creamy soup", 1299)
        };

        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, starterDishes);

        startersList.setAdapter(dishesAdapter);

    }
}