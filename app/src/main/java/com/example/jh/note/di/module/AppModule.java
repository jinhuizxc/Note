package com.example.jh.note.di.module;

import com.example.jh.note.App;

import dagger.Module;

/**
 * Created by jinhui on 2017/10/19.
 * Email：1004260403@qq.com
 */

@Module
public class AppModule {

    private final App app;

    public AppModule(App app) {
        this.app = app;
    }
}
