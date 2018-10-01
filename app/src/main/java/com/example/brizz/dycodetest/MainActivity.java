package com.example.brizz.dycodetest;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.Toast;

import com.example.brizz.dycodetest.adapter.ActorAdapter;
import com.example.brizz.dycodetest.model.ActorsItem;
import com.example.brizz.dycodetest.model.ResponseActors;
import com.example.brizz.dycodetest.network.ApiService;
import com.example.brizz.dycodetest.network.InitRetrofit;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.main_toolbar)
    Toolbar mainToolbar;
    @BindView(R.id.recview_actors)
    RecyclerView recviewActors;

    private ProgressDialog mProgress;
    private List<ActorsItem> actorsItems;
    private ActorAdapter actorAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(mainToolbar);
        getSupportActionBar().setTitle("Name of Hollywood Actors");

        mProgress = new ProgressDialog(this);
        recviewActors.setLayoutManager(new LinearLayoutManager(this));
        actorsItems = new ArrayList<>();

        showListActors();
    }

    private void showListActors() {
        mProgress.setMessage("Loading Data...");
        mProgress.show();

        ApiService apiService = InitRetrofit.getInstance();

        //Menyiapkan Request
        Call<ResponseActors> actorsCall = apiService.request_all_data();

        //Kirim Request
        actorsCall.enqueue(new Callback<ResponseActors>() {
            @Override
            public void onResponse(Call<ResponseActors> call, Response<ResponseActors> response) {
                if (response.isSuccessful()){
                    Log.i("response api", response.body().toString());

                    actorsItems = response.body().getActors();
                    actorAdapter = new ActorAdapter(MainActivity.this,actorsItems);
                    recviewActors.setAdapter(actorAdapter);

                    mProgress.dismiss();
                }else {
                    String err = response.errorBody().toString();
                    Toast.makeText(MainActivity.this, "Error "+err, Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ResponseActors> call, Throwable t) {

                t.printStackTrace();

            }
        });

    }
}
