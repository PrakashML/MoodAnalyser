package com.mood.analyser;

public class MoodAnalyser {
    public String analyseMood(String msg){
            if(msg.equalsIgnoreCase("Happy")){
                return "Happy";
            }
            else if(msg.equalsIgnoreCase("Sad") || msg.equalsIgnoreCase("Not Happy")){
                return "Sad";
            }
            else{
                return "Happy";
            }
    }
}

