package com.example.day0322.view.activity;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;

/**
 * @Auther: 白俊岭
 * @Date: 2019/3/22 08:45:47
 * @Description:
 */
public class SouView extends ViewGroup {
    private  int mleftMargin=20;
    private  int mtopMargin=20;
    public SouView(Context context) {
        super(context);
    }

    public SouView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SouView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        measureChildren(widthMeasureSpec,heightMeasureSpec);
         int leftMargin =mleftMargin;
         int topMargin =mtopMargin;
//         int viewHeight =0;
//         int viewWidth =0;

        int sizeWidth = MeasureSpec.getSize(widthMeasureSpec);
        int modeWidth = MeasureSpec.getMode(widthMeasureSpec);
        int sizeHeight = MeasureSpec.getSize(heightMeasureSpec);
        int modeHeight = MeasureSpec.getMode(heightMeasureSpec);

         switch ( modeHeight){
             case MeasureSpec.AT_MOST:
                 int measuredHeight = 0;
                 for (int j=0;j<getChildCount();j++){
                     int measuredWidth = getChildAt(j).getMeasuredWidth();
                      measuredHeight = getChildAt(j).getMeasuredHeight();
                      if (leftMargin+measuredWidth+mleftMargin>getWidth()){
                          leftMargin=mleftMargin;
                          topMargin+=measuredHeight+mtopMargin;
                      }
                      leftMargin+=measuredWidth+mleftMargin;
                 }
                 topMargin+=measuredHeight+mtopMargin;
                 break;

                 case MeasureSpec.EXACTLY:
                     break;
         }
         setMeasuredDimension(sizeWidth,topMargin);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
          int leftMargin=mleftMargin;
          int topMargin=mtopMargin;

          for (int j=0;j<getChildCount();j++){
              int measuredWidth = getChildAt(j).getMeasuredWidth();
              int measuredHeight = getChildAt(j).getMeasuredHeight();
              if (leftMargin+measuredWidth+mleftMargin>getWidth()){

                  leftMargin=mleftMargin;
                  topMargin+=measuredHeight+mtopMargin;
                  getChildAt(j).layout(leftMargin,topMargin,leftMargin+measuredWidth,topMargin+measuredHeight);

              }else {
                  getChildAt(j).layout(leftMargin,topMargin,leftMargin+measuredWidth,topMargin+measuredHeight);
              }
              leftMargin+=measuredWidth+mleftMargin;
          }
    }


}
