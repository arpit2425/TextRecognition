package com.example.textrecognition;

import android.app.Application;

import com.google.firebase.FirebaseApp;

public class textRecog extends Application {
    public static final String Result_Text="Result text";
    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseApp.initializeApp(this);
    }
}
