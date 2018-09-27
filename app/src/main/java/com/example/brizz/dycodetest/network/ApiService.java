package com.example.brizz.dycodetest.network;

import com.example.brizz.dycodetest.model.ResponseActors;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("actors")
    Call<ResponseActors> request_all_data();
}
