package com.example.azxca.retrofittutorial;

import com.google.gson.annotations.SerializedName;

public class Post {
    @SerializedName("id")
    int id;
    @SerializedName("postId")
    int postId;
    @SerializedName("email")
    String email;
    @SerializedName("name")
    String name;
    @SerializedName("body")
    String body;

    public Post(int id, int postId, String email, String name, String body) {
        this.id = id;
        this.postId = postId;
        this.email = email;
        this.name = name;
        this.body = body;
    }

    public int getId() {
        return id;
    }

    public int getPostId() {
        return postId;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getBody() {
        return body;
    }
}
