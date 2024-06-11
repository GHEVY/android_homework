package com.example.app;

public class ImageItem {
    int  image;
    String text;
    boolean isFav;

    public ImageItem(int image, String text) {
        this.image = image;
        this.text = text;
    }
    public int getImage() {
        return image;
    }

    public String getText() {
        return text;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setText(String text) {
        this.text = text;
    }
}
