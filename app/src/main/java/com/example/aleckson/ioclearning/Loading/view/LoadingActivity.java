package com.example.aleckson.ioclearning.Loading.view;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.aleckson.ioclearning.Loading.model.FunFactModel;
import com.example.aleckson.ioclearning.Loading.presenter.LoadingPresenter;
import com.example.aleckson.ioclearning.R;


public class LoadingActivity extends Activity implements ILoading {
    private TextView mMesage;



    LoadingPresenter mLoadingPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        mLoadingPresenter = new LoadingPresenter(this);
        mLoadingPresenter.getData();


        mMesage = (TextView) findViewById(R.id.funfact);




    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_loading, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



    @Override
    public void displayFunFact(FunFactModel funFactModel) {

        this.runOnUiThread(() -> mMesage.setText(funFactModel.getMessage()));
    }
}
