package com.example.aleckson.ioclearning.rest;

import android.content.Context;

import com.example.aleckson.ioclearning.Loading.model.FunFactModel;
import com.example.aleckson.ioclearning.rest.models.SuperModel;

import java.util.List;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;


import retrofit.RestAdapter;
import retrofit.http.GET;

/**
 * Created by Aleckson on 9/2/2015.
 */
public class DIVIClient {

    public Context context;
    public DIVIAPI mDiviApi;
    private static final String BASE_ENDPOINT = "https://admin.diviup.org/api/v1";


    public DIVIClient(Context context) {
        this.context = context;

        RestAdapter restAdapter = new RestAdapter.Builder()
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .setEndpoint(BASE_ENDPOINT)
                .build();

        mDiviApi = restAdapter.create(DIVIAPI.class);
        this.context = context;

    }

    public Observable<List<SuperModel>> getBusinesses() {
        return mDiviApi.getBusinesses();
    }

    public Observable<FunFactModel> fetchFunFact(){
        return  mDiviApi.getFunFact();
    }



    public interface DIVIAPI {

            @GET("/businesses")
            Observable<List<SuperModel>> getBusinesses();


        @GET("/snippets/random")
        Observable<FunFactModel> getFunFact();

        }




}
