package com.example.designpatterns.creational.singelton;

public class Library {
    private static Library instance;
    private Library(){}
    public static synchronized Library getInstance(){
        if(instance == null){
            instance = new Library();
        }
        System.out.println("accessed to the central library");
        return instance;
    }
    public void borrowBook(){
        System.out.println("got a new book!");
    }
}
