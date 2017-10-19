package com.example.jh.note.di.component;

import com.example.jh.note.App;
import com.example.jh.note.di.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by jinhui on 2017/10/19.
 * Email：1004260403@qq.com
 */

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
}
