package com.example.jh.note.mvp.views.impl;

import android.support.annotation.StringRes;
import android.support.v7.widget.RecyclerView;

import com.example.jh.note.mvp.views.View;

import java.util.List;

/**
 * Created by jinhui on 2017/10/19.
 * Email：1004260403@qq.com
 */

public interface MainView extends View {

    void initToolbar();
    void initDrawerView(List<String> list);
    void setToolbarTitle(String title);
    void showProgressWheel(boolean visible);
//    void switchNoteTypePage(List<SNote> notes);
//    void addNote(SNote note);
//    void updateNote(SNote note);
//    void removeNote(SNote note);
    void scrollRecyclerViewToTop();
    void setDrawerItemChecked(int position);
    boolean isDrawerOpen();
    void closeDrawer();
    void openOrCloseDrawer();
    void setMenuGravity(int gravity);
    void showFab(boolean visible);
    void stopRefresh();
    void startRefresh();
    boolean isRefreshing();
    void enableSwipeRefreshLayout(boolean enable);
    void setLayoutManager(RecyclerView.LayoutManager manager);
//    void initRecyclerView(List<SNote> notes);
//    void showTrashPopupMenu(android.view.View view, SNote note);
//    void showNormalPopupMenu(android.view.View view, SNote note);
//    void showDeleteForeverDialog(SNote note);
    void showSnackbar(@StringRes int message);
    void showGoBindEverNoteSnackbar(@StringRes int message, @StringRes int action);
    void moveTaskToBack();
    void reCreate();
}
