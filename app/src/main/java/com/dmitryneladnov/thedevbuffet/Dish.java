package com.dmitryneladnov.thedevbuffet;

import android.annotation.SuppressLint;

import androidx.annotation.NonNull;

public class Dish {

    String title;
    String description;
    int price;

    Dish(String title, String description, int price) {
        this.title = title;
        this.description = description;
        this.price = price;
    }

    @SuppressLint("DefaultLocale")
    @NonNull
    @Override
    public String toString() {
        return String.format("%s\n%s\n%d", title, description, price);
    }
}
