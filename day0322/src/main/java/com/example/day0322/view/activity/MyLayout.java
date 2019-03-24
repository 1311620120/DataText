package com.example.day0322.view.activity;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.day0322.R;

/**
 * @Auther: 白俊岭
 * @Date: 2019/3/22 10:29:08
 * @Description:
 */
public class MyLayout extends LinearLayout {

    private TextView finish_id;
    private EditText sech_cont_id;
    private ViewGroup flowtLayout_1_id;
    private TextView sech_id;
    private LinearLayout linrar;
    private MainActivity activity;

    public MyLayout(Context context) {
        super(context);
    }

    public MyLayout(final Context context, AttributeSet attrs) {
        super(context, attrs);
     //   activity = (MainActivity) context;
        View view = LayoutInflater.from(context).inflate(R.layout.view_self, this);
        finish_id = view.findViewById(R.id.finish_id);
        sech_cont_id = view.findViewById(R.id.sech_cont_id);
        sech_id = view.findViewById(R.id.sech_id);
        flowtLayout_1_id = view.findViewById(R.id.FlowtLayout_1_id);
        linrar = view.findViewById(R.id.Linrar_id);

//         sech_id.setOnClickListener(new OnClickListener() {
////             @Override
////             public void onClick(View v) {
////                 String count = sech_cont_id.getText().toString();
////                 final TextView textView = new TextView(context);
////                 textView.setTag(count);
////                 textView.setText(count);
////                 textView.setText(count);
////                 flowtLayout_1_id.addView(textView);
////             }
////         });
    }

    public MyLayout(Context context,  AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
