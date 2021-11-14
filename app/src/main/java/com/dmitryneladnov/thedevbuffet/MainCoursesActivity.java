package com.dmitryneladnov.thedevbuffet;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class MainCoursesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_courses);

        ListView mainCoursesList = findViewById(R.id.list_view_main_courses);

        Dish[] mainCoursesDishes = {
                new Dish("Padron and breadfruit salad", "Padron and breadfruit served on a bed of lettuce", 1255),
                new Dish("Tubetti and lobster fusilli", "Fresh egg pasta in a sauce made from tubetti and fresh lobster", 1180),
                new Dish("Tzatziki and crayfish salad", "A crisp salad featuring tzatziki and crayfish", 1020),
                new Dish("Pepper and polenta loaf", "Crunchy bread made with green pepper and polenta", 588),
                new Dish("Tumeric and mango madras", "Medium-hot madras made with tumeric and dried mango", 899),
                new Dish("Pepper and tomato gnocchi", "Gnocchi served in a sauce made from green pepper and cherry tomatoes", 799),
                new Dish("Ginger and cucumber soup", "Hot ginger and fresh cucumber combined into chunky soup", 999),
                new Dish("Cialledda and coconut milk salad", "Cialledda and coconut milk served on a bed of lettuce", 1099),
                new Dish("Chilli and squash sausages", "asty sausages made from spicy chilli and acorn squash, served in a roll", 1399),
                new Dish("Socca and scallop salad", "A crisp salad featuring socca and scallop", 1599)
        };

        ArrayAdapter<Dish> dishArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mainCoursesDishes);

        mainCoursesList.setAdapter(dishArrayAdapter);
    }
}
