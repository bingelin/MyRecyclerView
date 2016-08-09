package com.binge.myrecyclerview.CustomWeight;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by binge on 2016/8/6.
 */
public class DividerItemDecoratio extends RecyclerView.ItemDecoration {


    private static final int[] ATTRS = new int[]{
            android.R.attr.listDivider
    };




    @Override
    public void onDraw(Canvas c, RecyclerView parent, RecyclerView.State state) {
        super.onDraw(c, parent, state);
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
    }
}
