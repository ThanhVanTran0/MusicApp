package com.example.musicapp.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.example.musicapp.Model.PlayList;
import com.example.musicapp.R;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    private List<PlayList> playListList;
    private Context context;
    private int imgResource = R.drawable.img_test;
    private RequestOptions requestOptions;

    public MyAdapter(List<PlayList> _playListList) {
        this.playListList = _playListList;
        requestOptions = (new RequestOptions()).transforms(new CenterCrop(), new RoundedCorners(5));
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        this.context = viewGroup.getContext();
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item,viewGroup, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        PlayList item = playListList.get(i);
        myViewHolder.SetItemClickListener(new ItemClickListener() {
            @Override
            public void OnClick(int position, View v) {
                Toast.makeText(context, "Positon: " + position, Toast.LENGTH_SHORT).show();
//                Todo Send Id to Detail Activity
            }

            @Override
            public void OnLongClick(int position, View v) {
                //Do something here
            }
        });
        myViewHolder.title.setText(item.title);
        myViewHolder.subTitle.setText(item.subTitle);
        Glide.with(context).load(imgResource).apply(requestOptions).into(myViewHolder.image);
    }

    @Override
    public int getItemCount() {
        return playListList.size();
    }

    public interface ItemClickListener {
        void OnClick(int position, View v);
        void OnLongClick(int position, View v);
    }
}
