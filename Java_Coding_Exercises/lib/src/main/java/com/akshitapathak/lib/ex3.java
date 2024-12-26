package com.akshitapathak.lib;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args){
        //convert decimal to binary: repeated division by 2 and
        // store remainders then reverse order
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the decimal number: ");
        int num=s1.nextInt();
        StringBuilder bin=new StringBuilder();
        while(num>0){
            bin.append(num%2);
            num=num/2;
        }
        bin.reverse();
        System.out.println("The binary number is: "+bin);

    }
}
