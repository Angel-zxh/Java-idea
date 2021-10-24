package Chap9_7;

import sun.plugin2.os.windows.Windows;

public class WMPAdapter implements Player{
    private WindowsMediaPlayer wmp;
    public WMPAdapter(){
        wmp = new WindowsMediaPlayer();
    }
    public void play(String fileName){
        wmp.play(fileName);
    }
}
