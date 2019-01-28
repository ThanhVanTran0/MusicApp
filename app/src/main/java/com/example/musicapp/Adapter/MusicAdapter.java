package com.example.musicapp.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.example.musicapp.Model.MusicItem;
import com.example.musicapp.R;

import java.util.List;

public class MusicAdapter extends RecyclerView.Adapter<MusicItemViewHolder>  {

    private List<MusicItem> mListMusic;
    private Context context;
    private RequestOptions requestOptions;

    public  MusicAdapter(List<MusicItem> listMusic) {
        this.mListMusic = listMusic;
        requestOptions = (new RequestOptions()).transforms(new CenterCrop(), new RoundedCorners(5));
    }

    @NonNull
    @Override
    public MusicItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        context = viewGroup.getContext();
        View item = LayoutInflater.from(context).inflate(R.layout.music_row,viewGroup, false);
        return new MusicItemViewHolder(item);
    }

    @Override
    public void onBindViewHolder(@NonNull MusicItemViewHolder itemHolder, int i) {
        Glide.with(context).load(R.drawable.img_test).apply(requestOptions).into(itemHolder.img);
    }

    @Override
    public int getItemCount() {
        return mListMusic.size();
    }
}
