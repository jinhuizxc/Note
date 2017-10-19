package com.example.jh.note.ui;

import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.example.jh.note.R;
import com.example.jh.note.mvp.views.impl.MainView;

import java.util.List;

/**
 * 笔记项目 2017-10-18
 */
public class MainActivity extends BaseActivity implements MainView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void initToolbar() {

    }

    @Override
    public void initDrawerView(List<String> list) {

    }

    @Override
    public void setToolbarTitle(String title) {

    }

    @Override
    public void showProgressWheel(boolean visible) {

    }

    @Override
    public void scrollRecyclerViewToTop() {

    }

    @Override
    public void setDrawerItemChecked(int position) {

    }

    @Override
    public boolean isDrawerOpen() {
        return false;
    }

    @Override
    public void closeDrawer() {

    }

    @Override
    public void openOrCloseDrawer() {

    }

    @Override
    public void setMenuGravity(int gravity) {

    }

    @Override
    public void showFab(boolean visible) {

    }

    @Override
    public void stopRefresh() {

    }

    @Override
    public void startRefresh() {

    }

    @Override
    public boolean isRefreshing() {
        return false;
    }

    @Override
    public void enableSwipeRefreshLayout(boolean enable) {

    }

    @Override
    public void setLayoutManager(RecyclerView.LayoutManager manager) {

    }

    @Override
    public void showSnackbar(@StringRes int message) {

    }

    @Override
    public void showGoBindEverNoteSnackbar(@StringRes int message, @StringRes int action) {

    }

    @Override
    public void moveTaskToBack() {

    }

    @Override
    public void reCreate() {

    }
}
