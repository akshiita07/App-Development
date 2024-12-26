package com.akshitapathak.lib;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args){
        //Count number of letters,spaces,numbers & other characters of an input string
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter your string: ");
        String s=s1.nextLine();
        //call my fnc:
        count(s);
    }
    //Method:
    public static void count(String str){
        //to examine every single character of string
        char[] ch=str.toCharArray();
        int spaces=0;
        int letters=0;
        int digits=0;
        int others=0;

        for(int i=0;i<ch.length;i++){
            //spaces:
            if(Character.isSpaceChar(ch[i])){
                spaces++;
            }
            //letters:
            else if(Character.isLetter(ch[i])){
                letters++;
            }
            //digits:
            else if(Character.isDigit(ch[i])){
                digits++;
            }
            else{
                others++;
            }
        }

        System.out.println("Spaces: "+spaces);
        System.out.println("Letters: "+letters);
        System.out.println("Digits/Numbers: "+digits);
        System.out.println("Others: "+others);
    }
}
