package com.google.sampleapp.backend;
import com.udacity.Joker;
/**
 * The object model for the data we are sending through endpoints
 */
public class MyBean {

    //private String myData;

//    public String getData() {
//        return myData;
//    }

    public String getData() {
        return Joker.tellJoke();
    }

    //public void setData(String data) {
        //myData = data;
    //}


}