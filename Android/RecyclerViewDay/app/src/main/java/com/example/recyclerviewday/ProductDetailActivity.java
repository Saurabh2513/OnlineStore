package com.example.recyclerviewday;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class ProductDetailActivity extends Activity {
    TextView txtProductTitle, txtProductPrice;
    ImageView imgProduct;
    Product product;
    String title;
    int imageId, id, price;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_details);
        initViews();
        inputExtraction();
    }

    private void initViews() {
        imgProduct = findViewById(R.id.imageProduct);
        txtProductTitle = findViewById(R.id.txtProductTitle);
        txtProductPrice =findViewById(R.id.txtProductPrice);
    }

    private void inputExtraction() {
        Intent intent =getIntent();
        id = intent.getIntExtra("imageId",R.mipmap.ic_launcher_round);
        title = intent.getStringExtra("title");
        price = intent.getIntExtra("price",-1);

        imgProduct.setImageResource(imageId);
        txtProductTitle.setText(title);
        txtProductPrice.setText(title+"");


        product  = (Product) intent.getSerializableExtra("product");
        product.getId();
        imgProduct.setImageResource(product.getImgId());
        txtProductTitle.setText(product.getTitle());
        txtProductPrice.setText(product.getPrice()+"");
    }
}

