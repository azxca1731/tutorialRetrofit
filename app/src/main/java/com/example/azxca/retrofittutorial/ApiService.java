package com.example.azxca.retrofittutorial;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    String API_URL = "http://jsonplaceholder.typicode.com/";

    @GET("comments")
    Call<List<Post>> getComment(@Query("postId") int postId);

}
