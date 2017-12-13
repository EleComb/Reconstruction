package designPattern._6_adapterPattern.entity;

import designPattern._6_adapterPattern.iml.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer {
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    public void playMp4(String fileName) {
        //什么也不做
    }
}