package com.example.jh.note.ui;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.util.TypedValue;
import android.view.WindowManager;

import com.example.jh.note.R;
import com.example.jh.note.di.component.ActivityComponent;
import com.example.jh.note.utils.ThemeUtils;
import com.readystatesoftware.systembartint.SystemBarTintManager;

/**
 * Created by jinhui on 2017/10/19.
 * Email：1004260403@qq.com
 */

public abstract class BaseActivity extends AppCompatActivity {

    private static final String TAG = BaseActivity.class.getSimpleName();

    public final static String IS_START_ANIM = "IS_START_ANIM";
    public final static String IS_CLOSE_ANIM = "IS_CLOSE_ANIM";
    protected boolean isStartAnim = true;
    protected boolean isCloseAnim = true;

    protected ActivityComponent mActivityComponent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        parseIntent(getIntent());
        // 显示动画
        showActivityInAnim();
        initTheme();
        super.onCreate(savedInstanceState);
        initWindow();
        initializeDependencyInjector();
        setContentView(getLayoutView());
        initToolbar();
    }

    private void initToolbar() {
    }

    private void initializeDependencyInjector() {
    }

    @TargetApi(19)
    private void initWindow() {
        if (Build.VERSION.SDK_INT == Build.VERSION_CODES.KITKAT) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
            SystemBarTintManager tintManager = new SystemBarTintManager(this);
            tintManager.setStatusBarTintColor(getStatusBarColor());
            tintManager.setStatusBarTintEnabled(true);
        }
    }

    private int getStatusBarColor() {
        return getColorPrimary();
    }

    private int getColorPrimary() {
        TypedValue typedValue = new TypedValue();
        getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
        return typedValue.data;
    }

    private void initTheme() {
        ThemeUtils.Theme theme = ThemeUtils.getCurrentTheme(this);
        ThemeUtils.changeTheme(this, theme);
    }

    private void showActivityInAnim() {
    }

    private void parseIntent(Intent intent) {
        if (intent != null) {
            isStartAnim = intent.getBooleanExtra(IS_START_ANIM, true);
            isCloseAnim = intent.getBooleanExtra(IS_CLOSE_ANIM, true);
        }
    }


    protected abstract @LayoutRes int getLayoutView();

    public ActivityComponent getmActivityComponent() {
        return mActivityComponent;
    }
}
