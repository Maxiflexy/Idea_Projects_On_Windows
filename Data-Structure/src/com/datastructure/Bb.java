package com.datastructure;

public class Bb extends Thread{
    public void run(){
        for(int i = 0; i <= 50; i++){
            System.out.println("dear");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
