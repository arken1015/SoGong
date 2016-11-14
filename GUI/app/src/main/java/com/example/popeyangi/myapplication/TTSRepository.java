package com.example.popeyangi.myapplication;

/**
 * Created by User on 2016-11-14.
 */

public class TTSRepository {
    public String folderPath = "";

    TTSRepository()
    {
        folderPath = "";
    }
    public String getPath(){
        return folderPath;
    }
    public void setPath(String path){
        this.folderPath = path;
    }
    public void cleanFolder(){

    }
}
