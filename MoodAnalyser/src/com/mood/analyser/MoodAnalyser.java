package com.mood.analyser;

public class MoodAnalyser {
    String msg;
    public MoodAnalyser(){
        this.msg = null;
    }
    public MoodAnalyser(String msg){
        this.msg = msg;
    }
    public String analyseMood(){
        if(msg.toLowerCase().contains("sad") || msg.toLowerCase().contains("not happy") || msg.toLowerCase().contains("unhappy")){
            return "Sad";
        }
        else{
            return "Happy";
        }
    }
}

