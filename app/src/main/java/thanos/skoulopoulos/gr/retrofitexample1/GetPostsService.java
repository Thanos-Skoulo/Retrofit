package thanos.skoulopoulos.gr.retrofitexample1;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetPostsService {
    @GET("/posts")
    Call<List<RetroPosts>> getAllPosts();


}

