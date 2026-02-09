package com.ghr.agenamecomputerhometown;
import java.util.Scanner;

public class AgeNameComputerHometown {

    public static void main(String[] args) {
        String name = "";
        int age = 0;
        int computers = 0;
        String hometown = "";
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please input your name: ");
        name = sc.nextLine();
        
        System.out.println("Please input your age: ");
        age = sc.nextInt();
        
        System.out.println("Number of computers at your house: ");
        computers = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Please input your hometown: ");
        hometown = sc.nextLine();
     
        System.out.println("Hi " + name + ", your age is " + age + " You have " + computers + " at home, and your hometown is " + hometown);
    }
}
