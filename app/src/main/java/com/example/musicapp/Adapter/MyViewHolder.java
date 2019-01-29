package com.example.musicapp.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {

    private ItemClickListener mItemClickListener;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        itemView.setOnLongClickListener(this);
    }

    public void SetItemClickListener(ItemClickListener itemClickListener) {
        this.mItemClickListener = itemClickListener;
    }

    @Override
    public void onClick(View v) {
        this.mItemClickListener.OnClick(getAdapterPosition(),v);
    }

    @Override
    public boolean onLongClick(View v) {
        this.mItemClickListener.OnLongClick(getAdapterPosition(), v);
        return false;
    }
}
