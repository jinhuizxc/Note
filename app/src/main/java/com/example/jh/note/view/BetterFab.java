package com.example.jh.note.view;

import android.content.Context;
import android.support.design.widget.FloatingActionButton;
import android.util.AttributeSet;

/**
 * Created by jinhui on 2017/10/19.
 * Email：1004260403@qq.com
 */

public class BetterFab extends FloatingActionButton {

    private boolean forceHide = false;

    public BetterFab(Context context) {
        super(context);
    }

    public BetterFab(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BetterFab(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
//    getter/setter方法
    public boolean isForceHide() {
        return forceHide;
    }

    public void setForceHide(boolean forceHide) {
        this.forceHide = forceHide;
        if(!forceHide){
            setVisibility(VISIBLE);
        }else{
            setVisibility(GONE);
        }
    }
    //if hide，disable animation
    public boolean canAnimation(){
        return !isForceHide();
    }
}
