package com.example.jh.note.adapter;

import android.support.annotation.StringRes;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import com.example.jh.note.R;

/**
 * Created by jinhui on 2017/10/20.
 * Email：1004260403@qq.com
 */

public class NotesItemViewHolder extends RecyclerView.ViewHolder {


    private final TextView mNoteLabelTextView;
    private final TextView mNoteContentTextView;
    private final TextView mNoteTimeTextView;

    public NotesItemViewHolder(View itemView) {
        super(itemView);
        mNoteLabelTextView = (TextView) itemView.findViewById(R.id.note_label_text);
        mNoteContentTextView = (TextView) itemView.findViewById(R.id.note_content_text);
        mNoteTimeTextView = (TextView) itemView.findViewById(R.id.note_last_edit_text);
    }

    public void setLabelText(CharSequence text){
        setTextView(mNoteLabelTextView, text);
    }

    public void setLabelText(int text){
        setTextView(mNoteLabelTextView, text);
    }

    public void setContentText(CharSequence text){
        setTextView(mNoteContentTextView, text);
    }

    public void setContentText(int text){
        setTextView(mNoteContentTextView, text);
    }

    public void setTimeText(CharSequence text){
        setTextView(mNoteTimeTextView, text);
    }

    public void setTimeText(int text){
        setTextView(mNoteTimeTextView, text);
    }

    private void setTextView(TextView view, CharSequence text){
        if (view == null )
            return;
        if (TextUtils.isEmpty(text))
            view.setVisibility(View.GONE);
        view.setText(text);
    }

    private void setTextView(TextView view, @StringRes int text){
        if (view == null || text <= 0)
            return;
        view.setText(text);
    }
}
