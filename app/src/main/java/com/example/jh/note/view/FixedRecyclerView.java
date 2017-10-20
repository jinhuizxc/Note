package com.example.jh.note.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/**
 * Created by jinhui on 2017/10/19.
 * Email：1004260403@qq.com
 */

public class FixedRecyclerView extends RecyclerView {

    public FixedRecyclerView(Context context) {
        super(context);
    }

    public FixedRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public FixedRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public boolean canScrollVertically(int direction) {
        // 检查是否滚动 check if scrolling up
        if(direction < 1){
            boolean original = super.canScrollVertically(direction);
            return  !original && getChildAt(0) != null && getChildAt(0).getTop() < 0 || original;
        }
        return super.canScrollVertically(direction);
    }
}
