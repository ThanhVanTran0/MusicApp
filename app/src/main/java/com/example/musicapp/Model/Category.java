package com.example.musicapp.Model;

public class Category {
    public String id, title, subTitle, image_url;

    public Category(String _id, String _title, String _subTitle, String _image_url) {
        this.id = _id;
        this.title = _title;
        this.subTitle = _subTitle;
        this.image_url = _image_url;
    }
}
