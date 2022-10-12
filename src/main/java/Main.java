/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author hp
 */
public class Main {
    public static void main(String []args){
        AndroidTheme themeAndroid = new AndroidTheme();
        AndroidWallpaper wallpaperAndroid = new AndroidWallpaper();

        IOSTheme themeIOS = new IOSTheme();
        IOSWallpaper wallpaperIOS = new IOSWallpaper();

        
        themeAndroid.print();
        wallpaperAndroid.print();

        themeIOS.print();
        wallpaperIOS.print();
        
        
    }
}
