package com.example.jh.note.utils;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.jh.note.ui.fragments.SettingFragment;

/**
 * Created by jinhui on 2017/10/19.
 * Email：1004260403@qq.com
 */

public class PreferenceUtils {

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor shareEditor;
    // 初始化类对象
    private static PreferenceUtils preferenceUtils = null;

    public static final String NOTE_TYPE_KEY = "NOTE_TYPE_KEY";

    public static final String EVERNOTE_ACCOUNT_KEY = "EVERNOTE_ACCOUNT_KEY";

    public static final String EVERNOTE_NOTEBOOK_GUID_KEY = "EVERNOTE_NOTEBOOK_GUID_KEY";
    // 构造方法
    public PreferenceUtils(Context context) {
        sharedPreferences = context.getSharedPreferences(SettingFragment.PREFERENCE_FILE_NAME, Context.MODE_PRIVATE);
        shareEditor = sharedPreferences.edit();
    }

    public static PreferenceUtils getInstance(Context context){
        if(preferenceUtils == null){
            synchronized (PreferenceUtils.class){
                if(preferenceUtils == null){
                    preferenceUtils = new PreferenceUtils(context.getApplicationContext());
                }
            }
        }
        return preferenceUtils;
    }

    public int getIntParam(String key, int defaultInt){
        return sharedPreferences.getInt(key, defaultInt);
    }

}
