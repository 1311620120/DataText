package com.example.day0322.presenter;

/**
 * @Auther: 白俊岭
 * @Date: 2019/3/22 13:58:56
 * @Description:
 */
public class BasePresenter<V> {
     private  V view;

    public void setView(V view) {
        this.view = view;
    }

    public V getView() {
        return view;
    }
    public  void  datech(){

        this.view=null;
    }
}
