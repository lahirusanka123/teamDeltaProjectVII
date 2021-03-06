package com.example.mobidine.Seller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.mobidine.R;

public class SellerProductCategoryActivity extends AppCompatActivity {


    private ImageView burger, pizza, rice;
    private ImageView drinks, noodles, foods;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seller_product_category);



        burger = (ImageView) findViewById(R.id.hamburger);
        pizza = (ImageView) findViewById(R.id.pizza);
        rice = (ImageView) findViewById(R.id.rice);
        drinks = (ImageView) findViewById(R.id.drinks);
        noodles = (ImageView) findViewById(R.id.noodles);
        foods = (ImageView) findViewById(R.id.food);

        burger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(SellerProductCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("Category", "Burger");
                startActivity(intent);

            }
        });

        pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(SellerProductCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("Category", "Pizza");
                startActivity(intent);

            }
        });

        rice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(SellerProductCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("Category", "Rice");
                startActivity(intent);

            }
        });

        drinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(SellerProductCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("Category", "Drinks");
                startActivity(intent);

            }
        });

        noodles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(SellerProductCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("Category", "Noodles");
                startActivity(intent);
            }
        });

        foods.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(SellerProductCategoryActivity.this, SellerAddNewProductActivity.class);
                intent.putExtra("Category", "Others");
                startActivity(intent);

            }
        });

    }
}
