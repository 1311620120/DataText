package com.example.day0322.view.activity;

import android.Manifest;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.day0322.R;
import com.example.day0322.model.DataBean;
import com.example.day0322.presenter.MainPresenter;
import com.example.day0322.view.adapter.MyAdapter;
import com.example.day0322.view.interfaces.IMainView;
import com.jcodecraeer.xrecyclerview.XRecyclerView;
import com.umeng.socialize.UMAuthListener;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.bean.SHARE_MEDIA;

import java.util.Map;

public class MainActivity extends AppCompatActivity implements IMainView {

    private MainPresenter mainPresenter;
    private String keyword="高";
     int page=1;
    private int count=14;
    private XRecyclerView xrexycler;
    private MyAdapter myAdapter;
    private GridLayoutManager gridLayoutManager;
    private LinearLayoutManager linearLayoutManager;
    private TextView ser;
    private EditText sech_cont_id;
    private EditText sech_cont_id1;
    private SouView flowtLayout_1_id;
    private Button butt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

           initView();
           initData();

    }

    private void initView() {
        xrexycler = findViewById(R.id.xrecycle);
        butt = findViewById(R.id.butt);
        View viewById = findViewById(R.id.myLayout);
        ser = findViewById(R.id.sech_id);
        sech_cont_id1 = findViewById(R.id.sech_cont_id);
        flowtLayout_1_id = findViewById(R.id.FlowtLayout_1_id);



        gridLayoutManager = new GridLayoutManager(this, 2);

        xrexycler.setLayoutManager(gridLayoutManager);
    }

    private void initData() {

        xrexycler.setLoadingMoreEnabled(true);
        xrexycler.setPullRefreshEnabled(true);

        mainPresenter = new MainPresenter(this);
        mainPresenter.ShowData(keyword,page,count);
        mainPresenter.setView(this);

       xrexycler.setLoadingListener(new XRecyclerView.LoadingListener() {
           @Override
           public void onRefresh() {
               page=1;
           mainPresenter.ShowData(keyword,page,count);
           xrexycler.refreshComplete();
            myAdapter.notifyDataSetChanged();

           }

           @Override
           public void onLoadMore() {
               new Handler().post(new Runnable() {
                   @Override
                   public void run() {
                       page++;

                       mainPresenter.ShowData(keyword,page,count);
                       xrexycler.loadMoreComplete();
                       myAdapter.notifyDataSetChanged();
                   }
               });

           }
       });


        ser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = sech_cont_id1.getText().toString();
                final TextView textView = new TextView(MainActivity.this);
               // textView.setTag(name);
                textView.setText(name);
                flowtLayout_1_id.addView(textView);

                flowtLayout_1_id.requestLayout();

                mainPresenter.ShowData(name,page,count);

            }
        });
        if(Build.VERSION.SDK_INT>=23) {
            String[] mPermissionList = new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.CALL_PHONE, Manifest.permission.READ_LOGS, Manifest.permission.READ_PHONE_STATE, Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.SET_DEBUG_APP, Manifest.permission.SYSTEM_ALERT_WINDOW, Manifest.permission.GET_ACCOUNTS, Manifest.permission.WRITE_APN_SETTINGS};
            ActivityCompat.requestPermissions(this, mPermissionList, 123);
        }
        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             UMShareAPI umShareAPI = UMShareAPI.get(MainActivity.this);
             umShareAPI.getPlatformInfo(MainActivity.this, SHARE_MEDIA.QQ, new UMAuthListener() {


                 @Override
                 public void onStart(SHARE_MEDIA share_media) {

                 }

                 @Override
                 public void onComplete(SHARE_MEDIA share_media, int i, Map<String, String> map) {

                 }

                 @Override
                 public void onError(SHARE_MEDIA share_media, int i, Throwable throwable) {

                 }

                 @Override
                 public void onCancel(SHARE_MEDIA share_media, int i) {

                 }
             });
            }
        });

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        UMShareAPI.get(this).onActivityResult(requestCode, resultCode, data);
    }
    @Override
    public void onSeccuss(Object o) {
        DataBean dataBean =(DataBean)o;
       Log.e("sssss", dataBean +"");

        myAdapter = new MyAdapter(MainActivity.this, dataBean);
        xrexycler.setAdapter(myAdapter);

    }

    @Override
    public void onFail(String err) {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mainPresenter!=null){
            mainPresenter.datech();
        }

    }

}
