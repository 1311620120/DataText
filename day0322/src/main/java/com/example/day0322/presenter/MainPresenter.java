package com.example.day0322.presenter;

import android.util.Log;

import com.example.day0322.model.Constants;
import com.example.day0322.model.HttpUtils;
import com.example.day0322.model.DataBean;
import com.example.day0322.view.activity.MainActivity;
import com.example.day0322.view.interfaces.IMainView;

/**
 * @Auther: 白俊岭
 * @Date: 2019/3/22 14:03:38
 * @Description:
 */
public class MainPresenter extends  BasePresenter<IMainView<DataBean>> {

    private final HttpUtils instance;

    public MainPresenter(MainActivity mainActivity){
        instance = HttpUtils.getInstance();


    }

    public  void ShowData(String keyword,int page,int count){
        //?keyword=高&page=2&count=16
        Log.e("zzzz",count+"");
      instance.getData(Constants.BASE_URL+"?"+"keyword="+keyword+"&"+"page="+page+"&"+"count="+count, DataBean.class, new HttpUtils.CallBackData() {
          @Override
          public void onResponse(Object o) {

              getView().onSeccuss((DataBean)o);
          }

          @Override
          public void onFail(String err) {

          }
      });
    }
}
