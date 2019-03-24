package com.example.day0322.view.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.day0322.R;
import com.example.day0322.model.DataBean;

/**
 * @Auther: 白俊岭
 * @Date: 2019/3/22 14:57:25
 * @Description:
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    Context context;
    DataBean dataBean;
    public MyAdapter(Context context, DataBean dataBean) {

        this.context=context;
        this.dataBean = dataBean;


    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.view, parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
           holder.name.setText(dataBean.getResult().get(position).getCommodityName());
        Glide.with(context).load(dataBean.getResult().get(position).getMasterPic()).into(holder.img);
    }



    @Override
    public int getItemCount() {

     return dataBean.getResult().size();

    }

    public class ViewHolder extends RecyclerView.ViewHolder {

      ImageView img;
       TextView name;

        public ViewHolder(View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.img);
            name = itemView.findViewById(R.id.name);
        }
    }
}
