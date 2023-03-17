package com.example.recyclerview2;

public class User {
int userId;
int userImageId;
String username;
    public User(int userId, int userImageId, String username) {
     this.userId=userId;
     this.userImageId=userImageId;
     this.username=username;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserImageId(int userImageId) {
        this.userImageId = userImageId;
    }

    public int getUserImageId() {
        return userImageId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
