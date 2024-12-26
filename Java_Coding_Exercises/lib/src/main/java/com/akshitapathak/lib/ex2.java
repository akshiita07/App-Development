package com.akshitapathak.lib;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args){
        //to take input from user:
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        float r=s1.nextFloat();

        System.out.println("Area: "+(float)3.14*r*r);
        System.out.println("Perimeter: "+(float)2*3.14*r);
    }
}
