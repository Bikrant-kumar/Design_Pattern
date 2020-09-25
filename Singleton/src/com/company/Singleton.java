package com.company;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class Singleton {
    private static Singleton instance;
    private Singleton (){}
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
            System.out.println("New instance creating");
        }
        return instance;
    }
    public void displayMessage(){
        System.out.println("instance ready to use ");
    }
}
