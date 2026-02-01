package com.ghr.bucketsoffun;

public class BucketsOfFun {

    public static void main(String[] args) {
        int butterflies, beetles, bugs;
        
        butterflies = 5; 
        beetles = 9;
        
        bugs = butterflies + beetles;
        System.out.println("There are only " + butterflies + " butterflies");
        System.out.println("but there are " + bugs + " bugs in all");
        
        System.out.println("Uh oh, the dog ate one");
        butterflies--;
        System.out.println("Now there are only " + butterflies + " butterflies");
        System.out.println("But there are still " + bugs + " bugs left");
        System.out.println("Maybe my computer cant do math at all...");
    }
}
