package com.lyl.changetheme;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Just Simple Author Adapter
 * <p/>
 * Created by Clock on 2016/8/24.
 */
public class SimpleAuthorAdapter extends RecyclerView.Adapter<SimpleAuthorAdapter.SimpleViewHolder> {

    private final View.OnClickListener mSimpleClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Context context = v.getContext();
            Toast.makeText(context,"Click",Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    public SimpleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View rootView = inflater.inflate(R.layout.author_info_layout, parent, false);
        return new SimpleViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(SimpleViewHolder holder, int position) {
        holder.itemView.setOnClickListener(mSimpleClickListener);
    }

    @Override
    public int getItemCount() {
        return 20;
    }

    static class SimpleViewHolder extends RecyclerView.ViewHolder {
        public SimpleViewHolder(View itemView) {
            super(itemView);
        }
    }
}
