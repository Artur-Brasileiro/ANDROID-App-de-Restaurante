package com.example.appderestaurante.model;

public class Food {
    public Food(int imgFood, String foodName, String foodDescription, String price) {
        this.imgFood = imgFood;
        this.foodName = foodName;
        this.foodDescription = foodDescription;
        this.price = price;
    }

    int imgFood;
    String foodName;
    String foodDescription;
    String price;

    public int getImgFood() {
        return imgFood;
    }

    public String getFoodName() {
        return foodName;
    }

    public String getFoodDescription() {
        return foodDescription;
    }

    public String getPrice() {
        return price;
    }
}
