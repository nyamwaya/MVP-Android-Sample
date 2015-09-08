package com.example.aleckson.ioclearning.Loading.model;

import android.content.Context;
import android.util.Log;

import com.example.aleckson.ioclearning.rest.DIVIClient;
import com.google.gson.annotations.Expose;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Aleckson on 9/8/2015.
 */
public class FunFactModel {

    private static final String TAG = FunFactModel.class.getSimpleName();
    @Expose
    private String message;

    /**
     *
     * @return
     * The message
     */
    public String getMessage() {
        return message;
    }

    /**
     *
     * @param message
     * The message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    static public Observable<FunFactModel> requestData(Context context) {
        DIVIClient mDiviClient = new DIVIClient(context);
       return  mDiviClient.fetchFunFact();


    }

}
