package com.li.gohome.view;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.li.gohome.R;
import com.li.gohome.baen.HomeModel;
import com.li.gohome.presenter.MainPresenter;

public class HomePageActivity extends AppCompatActivity implements IMainView{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainPresenter presenter = new MainPresenter(this);
        presenter.getNetWorkInfo();

    }

    @Override
    public void getHomeModel(HomeModel homeModel) {
        Log.v("aa",homeModel.getbannerList().get(0).getIcon());
    }
}
