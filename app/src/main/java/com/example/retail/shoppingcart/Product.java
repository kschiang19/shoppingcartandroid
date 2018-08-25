package com.example.retail.shoppingcart;

import android.graphics.drawable.Drawable;

public class Product {

    public String title;
    public Drawable productImage;
    public String description;
    public double price;
    public double weight;
    public boolean selected;

    public Product(String title, Drawable productImage, String description,
                   double price, double weight) {
        this.title = title;
        this.productImage = productImage;
        this.description = description;
        this.price = price;
        this.weight = weight;
    }

}