package com.example.recycleview1;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

    private ArrayList<String> products;

    public ProductAdapter(ArrayList<String> products) {
        this.products = products;
    }

     class ProductViewHolder extends RecyclerView.ViewHolder {
        public TextView txtProduct;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            txtProduct = (TextView) itemView;
            txtProduct.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(itemView.getContext(), txtProduct.getText(), Toast.LENGTH_SHORT).show();
                }
            });

        }
    }

    @NonNull
    @Override
    public ProductAdapter.ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
     TextView txtProduct = new TextView(parent.getContext());

     txtProduct.setTextColor(Color.BLACK);
     txtProduct.setLayoutParams(new ViewGroup.LayoutParams(
             ViewGroup.LayoutParams.MATCH_PARENT,
             ViewGroup.LayoutParams.WRAP_CONTENT
     ));
     txtProduct.setTextSize(30);
     txtProduct.setPadding(20,20,20,20);
    return new ProductViewHolder(txtProduct);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductAdapter.ProductViewHolder holder, int position) {
    holder.txtProduct.setText(products.get(position));
    }

    @Override
    public int getItemCount() {
        return products.size();
    }


}
