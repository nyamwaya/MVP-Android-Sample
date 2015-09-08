package com.example.aleckson.ioclearning.Loading.presenter;

import android.app.Activity;
import android.content.Context;

import com.example.aleckson.ioclearning.Loading.model.FunFactModel;
import com.example.aleckson.ioclearning.Loading.view.ILoading;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Aleckson on 9/8/2015.
 */
public class LoadingPresenter {

    ILoading view;
    Context context;


    public LoadingPresenter(ILoading mIloader) {
        this.view = mIloader;
        this.context = ((Activity)mIloader);
    }



    public void getData(){
        Observable<FunFactModel> factModelObservable = FunFactModel.requestData(context);
        factModelObservable.observeOn(AndroidSchedulers.mainThread())
                .observeOn(Schedulers.io())
                .subscribe(this::displayDataInView, Throwable::printStackTrace );
    }

    private void displayDataInView(FunFactModel funFactModel) {
        view.displayFunFact(funFactModel);
    }


}
