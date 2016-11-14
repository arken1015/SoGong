package com.example.popeyangi.myapplication;

/**
 * Created by User on 2016-11-14.
 */

import java.lang.*;

public class Option {
    public static STTRepository STTRepo;
    public static TTSRepository TTSRepo;
    public static VoiceModel Voice;
    public static SharingFlag Share;
    public static TextSetting Text;

    public static void changeSTTSetting(){
        STTRepo.setPath("Test");
    }

    public static void changeTTSSetting() {
        TTSRepo.setPath("Test");
    }

    public static void changeVoiceModel(){
        Voice = Voice.Beta;
    }

    public static void changeTextSetting(){

    }

    public static void sharingConfig(){

    }

    public static void setDefault(){

    }
}