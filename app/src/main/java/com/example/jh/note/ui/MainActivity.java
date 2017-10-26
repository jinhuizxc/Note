package com.example.jh.note.ui;

import android.os.Bundle;
import android.support.annotation.StringRes;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import com.example.jh.note.R;
import com.example.jh.note.adapter.NotesAdapter;
import com.example.jh.note.model.SNote;
import com.example.jh.note.mvp.presenters.impl.MainPresenter;
import com.example.jh.note.mvp.views.impl.MainView;
import com.example.jh.note.view.BetterFab;
import com.pnikosis.materialishprogress.ProgressWheel;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;


/**
 * 笔记项目 2017-10-18
 * 每一个点做到亲力亲为。
 */
public class MainActivity extends BaseActivity implements MainView {

    private static final String TAG = MainActivity.class.getSimpleName();
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.refresher)
    SwipeRefreshLayout refreshLayout;
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    @BindView(R.id.drawer_layout)
    DrawerLayout mDrawerLayout;
    @BindView(R.id.left_drawer_listview)
    ListView mDrawerMenuListView;
    @BindView(R.id.left_drawer)
    View drawerRootView;
    @BindView(R.id.fab)
    BetterFab fab;
    @BindView(R.id.coordinator_layout)
    CoordinatorLayout coordinatorLayout;
    @BindView(R.id.progress_wheel)
    ProgressWheel progressWheel;
    @Inject
    MainPresenter mainPresenter;

    private ActionBarDrawerToggle mDrawerToggle;
    private NotesAdapter recyclerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutView() {
        return R.layout.activity_main;
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
    public void switchNoteTypePage(List<SNote> notes) {

    }

    @Override
    public void addNote(SNote note) {

    }

    @Override
    public void updateNote(SNote note) {

    }

    @Override
    public void removeNote(SNote note) {

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
    public void initRecyclerView(List<SNote> notes) {

    }

    @Override
    public void showTrashPopupMenu(View view, SNote note) {

    }

    @Override
    public void showNormalPopupMenu(View view, SNote note) {

    }

    @Override
    public void showDeleteForeverDialog(SNote note) {

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
