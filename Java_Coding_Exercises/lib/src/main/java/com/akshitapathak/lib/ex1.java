package com.akshitapathak.lib;
import java.util.Scanner;

public class ex1 {
        public static void main(String[] args){
            //to take input from user:
            Scanner s1=new Scanner(System.in);
            System.out.println("Enter first number: ");
            int x=s1.nextInt();
            System.out.println("Enter second number: ");
            int y=s1.nextInt();

            System.out.println("Division: "+(float)x/y);
            System.out.println("Remainder: "+x%y);
        }
}