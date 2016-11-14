package com.example.popeyangi.myapplication;

/**
 * Created by User on 2016-11-14.
 */

public class STTRepository {
    public String folderPath = "";

    STTRepository()
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
