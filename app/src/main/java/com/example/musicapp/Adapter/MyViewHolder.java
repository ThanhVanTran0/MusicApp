package com.example.musicapp.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.musicapp.R;

public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {

    public TextView title, subTitle;
    public ImageView image;

    private MyAdapter.ItemClickListener mItemClickListener;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.item_title);
        subTitle = itemView.findViewById(R.id.item_sub_title);
        image = itemView.findViewById(R.id.item_image);

        itemView.setOnClickListener(this);
        itemView.setOnLongClickListener(this);
    }

    public void SetItemClickListener(MyAdapter.ItemClickListener itemClickListener) {
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
