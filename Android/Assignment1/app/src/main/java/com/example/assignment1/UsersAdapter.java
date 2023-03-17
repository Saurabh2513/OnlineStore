package com.example.assignment1;


import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assignment1.User;

import java.util.ArrayList;

public class UsersAdapter extends RecyclerView.Adapter<UsersAdapter.UserViewHolder> {
    ArrayList<User> users;

    public UsersAdapter(ArrayList<User> users) {
        this.users = users;
    }

    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View userView = layoutInflater.inflate(R.layout.userview, null);
        userView.findViewById(R.id.txtUsername).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(v.getContext(), "usernameClicked", Toast.LENGTH_LONG).show();
                    }
                }
        );
        userView.findViewById(R.id.userImageView).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(v.getContext(), "userImageClicked", Toast.LENGTH_LONG).show();
                    }
                }
        );

        return new UserViewHolder(userView);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        User user = users.get(position);
        holder.userImageView.setImageResource(user.getUserImageId());
        holder.txtUsername.setText(user.getUsername());


       holder.userImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),user.userImageId,Toast.LENGTH_LONG).show();
            }
        });
        holder.txtUsername.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),user.username,Toast.LENGTH_LONG).show();
            }
        });

   }

    @Override
    public int getItemCount() {
        return users.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {
        ImageView userImageView;
        TextView txtUsername;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);

            userImageView = itemView.findViewById(R.id.userImageView);
            txtUsername = itemView.findViewById(R.id.txtUsername);

            txtUsername.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    User user = users.get(getAdapterPosition());
                    Toast.makeText(v.getContext(), user.getUsername(), Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(v.getContext(), UserView.class);
                    intent.putExtra("user", users);
                    v.getContext().startActivity(intent);
                }
            });
        }
    }
}

