package com.example.musicapp.Adapter;

import android.support.annotation.NonNull;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.musicapp.R;

public class PlayListItemViewHolder extends MyViewHolder {
    public TextView title, subTitle;
    public ImageView image;

    public PlayListItemViewHolder(@NonNull View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.item_title);
        subTitle = itemView.findViewById(R.id.item_sub_title);
        image = itemView.findViewById(R.id.item_image);
    }
}
