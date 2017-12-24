package com.example.shouhei.firstapp;

import android.util.Log;

/**
 * Created by shouhei on 2017/12/18.
 */

public class Cat {
    String name;
    int age;
    String gender;
    String breed;

    Cat(String name, int age, String gender, String breed) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.breed = breed;
    }

    void say(String message) {
        Log.d("Cat", this.name + "「" + message + "」");
    }

    void sleep() {
        say("Zzz");
    }
}
