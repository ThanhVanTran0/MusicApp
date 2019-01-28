package com.example.musicapp.Activity;

import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.musicapp.Adapter.MusicAdapter;
import com.example.musicapp.Model.MusicItem;
import com.example.musicapp.R;

import java.util.ArrayList;
import java.util.List;

public class PlayListDetailActivity extends BaseActivity {

    private RecyclerView mRecyclerView;
    private MusicAdapter mMusicAdapter;
    private List<MusicItem> mItemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_list_detail);

        initToolbar("Design");

        mItemList = new ArrayList<>();
        mItemList.add(new MusicItem());
        mItemList.add(new MusicItem());
        mItemList.add(new MusicItem());
        mItemList.add(new MusicItem());
        mItemList.add(new MusicItem());
        mItemList.add(new MusicItem());

        mRecyclerView = findViewById(R.id.music_list);
        mMusicAdapter = new MusicAdapter(mItemList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mRecyclerView.setAdapter(mMusicAdapter);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());

        mMusicAdapter.notifyDataSetChanged();
    }
}
