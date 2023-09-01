package com.jaejae.cafe_jaerim;

import android.media.Image;

public class StudyCafeData {
    int Image;
    String Name;
    String Wifi;
    String Socket;
    String Restroom;

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getWifi() {
        return Wifi;
    }

    public void setWifi(String wifi) {
        Wifi = wifi;
    }

    public String getSocket() {
        return Socket;
    }

    public void setSocket(String socket) {
        Socket = socket;
    }

    public String getRestroom() {
        return Restroom;
    }

    public void setRestroom(String restroom) {
        Restroom = restroom;
    }

    public StudyCafeData(int image, String name, String wifi, String socket, String restroom) {
        Image = image;
        Name = name;
        Wifi = wifi;
        Socket = socket;
        Restroom = restroom;
    }
}
