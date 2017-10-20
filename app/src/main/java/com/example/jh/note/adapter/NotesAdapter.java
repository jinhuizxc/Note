package com.example.jh.note.adapter;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;

import com.example.jh.note.R;
import com.example.jh.note.adapter.base.BaseRecyclerViewAdapter;
import com.example.jh.note.model.SNote;
import com.example.jh.note.utils.TimeUtils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by jinhui on 2017/10/20.
 * Email：1004260403@qq.com
 */

public class NotesAdapter extends BaseRecyclerViewAdapter<SNote> implements Filterable {

    private final List<SNote> originalList;
    private Context mContext;

    public NotesAdapter(List<SNote> list) {
        super(list);
        originalList = new ArrayList<>(list);
    }

    public NotesAdapter(List<SNote> list, Context context) {
        super(list, context);
        originalList = new ArrayList<>(list);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        final View view = LayoutInflater.from(mContext).inflate(R.layout.notes_item_layout, parent, false);
        return new NotesItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {
        super.onBindViewHolder(viewHolder, position);
        NotesItemViewHolder holder = (NotesItemViewHolder) viewHolder;
        SNote note = list.get(position);
        if (note == null)
            return;
        //TODO
        String label = "";
        if (mContext != null) {
            boolean b  = TextUtils.equals(mContext.getString(R.string.default_label), note.getLabel());
            label = b? "": note.getLabel();
        }
        holder.setLabelText(label);
        holder.setContentText(note.getContent());
        holder.setTimeText(TimeUtils.getConciseTime(note.getLastOprTime(), mContext));
        animate(viewHolder, position);
    }

    @Override
    protected Animator[] getAnimators(View view) {
        if (view.getMeasuredHeight() <=0){
            ObjectAnimator scaleX = ObjectAnimator.ofFloat(view, "scaleX", 1.05f, 1.0f);
            ObjectAnimator scaleY = ObjectAnimator.ofFloat(view, "scaleY", 1.05f, 1.0f);
            return new ObjectAnimator[]{scaleX, scaleY};
        }
        return new Animator[]{
                ObjectAnimator.ofFloat(view, "scaleX", 1.05f, 1.0f),
                ObjectAnimator.ofFloat(view, "scaleY", 1.05f, 1.0f),
        };
    }


    @Override
    public Filter getFilter() {
        return new NoteFilter(this, originalList);
    }

    @Override
    public void setList(List<SNote> list) {
        super.setList(list);
        this.originalList.clear();
        originalList.addAll(list);
    }

    // Notefilter 类
    private static class NoteFilter extends Filter {

        private final NotesAdapter adapter;

        private final List<SNote> originalList;

        private final List<SNote> filteredList;

        private NoteFilter(NotesAdapter adapter, List<SNote> originalList) {
            super();
            this.adapter = adapter;
            this.originalList = new LinkedList<>(originalList);
            this.filteredList = new ArrayList<>();
        }
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            filteredList.clear();
            final FilterResults results = new FilterResults();
            if (constraint.length() == 0) {
                filteredList.addAll(originalList);
            } else {
                for ( SNote note : originalList) {
                    if (note.getContent().contains(constraint) || note.getLabel().contains(constraint)) {
                        filteredList.add(note);
                    }
                }
            }
            results.values = filteredList;
            results.count = filteredList.size();
            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            adapter.list.clear();
            adapter.list.addAll((ArrayList<SNote>) results.values);
            adapter.notifyDataSetChanged();
        }
    }

}
