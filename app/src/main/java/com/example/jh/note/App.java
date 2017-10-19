package com.example.jh.note;

import android.app.Application;

import com.example.jh.note.di.component.AppComponent;
import com.example.jh.note.di.component.DaggerAppComponent;
import com.example.jh.note.di.module.AppModule;

/**
 * Created by jinhui on 2017/10/19.
 * Email：1004260403@qq.com
 */

public class App extends Application {

    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        // 初始化dagger注射器
        initializeInjector();
    }

    private void initializeInjector() {
        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }
}
