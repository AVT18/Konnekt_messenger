package com.example.konnekt2;

public class Categories {
    static long frequency;
    String type;

    public static void setFrequency(long frequency) {
        Categories.frequency = frequency;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void assignFrequency(String type) {
        switch (type){
            case "Family": setFrequency(24);
            case "Close Friends": setFrequency(36);
            case "Friends":setFrequency(72);
            case "Associates":setFrequency(168);
        }


    }
}
