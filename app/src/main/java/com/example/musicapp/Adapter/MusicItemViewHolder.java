package com.example.musicapp.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.musicapp.R;

public class MusicItemViewHolder extends MyViewHolder{

    public ImageView img;
    public TextView mTitle, mSubTitle, mTime;
    public Button mMoreSetting;

    public MusicItemViewHolder(@NonNull View itemView) {
        super(itemView);
        img = itemView.findViewById(R.id.music_row_image);
        mTime = itemView.findViewById(R.id.music_row_time);
        mTitle = itemView.findViewById(R.id.music_row_title);
        mSubTitle = itemView.findViewById(R.id.music_row_sub_title);
        mMoreSetting = itemView.findViewById(R.id.btn_more);
    }
}
