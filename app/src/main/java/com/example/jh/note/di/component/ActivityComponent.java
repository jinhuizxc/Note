package com.example.jh.note.di.component;

import com.example.jh.note.di.Activity;
import com.example.jh.note.di.module.ActivityModule;

import dagger.Component;

/**
 * Created by jinhui on 2017/10/19.
 * Email：1004260403@qq.com
 */

@Activity
@Component(dependencies = AppComponent.class, modules = {ActivityModule.class})
public interface ActivityComponent {

}
