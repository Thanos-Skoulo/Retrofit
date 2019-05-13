package thanos.skoulopoulos.gr.retrofitexample1;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import retrofit2.Call;

public class UserActivity extends AppCompatActivity {
    private CustomAdapter adapter;
    private RecyclerView recyclerView;
    ProgressDialog progressDoalog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        progressDoalog = new ProgressDialog(UserActivity.this);
        progressDoalog.setMessage("Loading Posts....");
        progressDoalog.show();

        GetPostsService postServices = RetrofitClientInstance.getRetrofitInstance().create(GetPostsService.class);
        Call<List<RetroPosts>> call_posts = postServices.getAllPosts();
        call_posts.enqueue();
    }
}
