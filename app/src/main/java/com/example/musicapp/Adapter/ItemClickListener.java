package com.example.musicapp.Adapter;

import android.view.View;

public interface ItemClickListener {
    void OnClick(int position, View v);
    void OnLongClick(int position, View v);
}
