package com.example.jh.note.mvp.presenters;

import android.os.Bundle;

import com.example.jh.note.mvp.views.View;

/**
 * Created by jinhui on 2017/10/19.
 * Email：1004260403@qq.com
 */

public interface Presenter {

    void onCreate (Bundle savedInstanceState);

    void onResume();

    void onStart ();

    void onPause();

    void onStop ();

    void onDestroy();

    void attachView (View v);
}
