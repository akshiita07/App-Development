package com.akshitapathak.lib;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args){
        //Reverse a string
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter string: ");
        String s=s1.nextLine();
        //convert string to array of characters:
        char[] ch=s.toCharArray();

        for(int i=0;i<ch.length/2;i++){
            //helloworld-> dlrowolleh
            //swap(ch[i],ch[ch.length-i-1]);
            //only with vector: Collections.swap(ch,i,ch.length-i-1);
            char temp=ch[i];
            ch[i]=ch[ch.length-i-1];
            ch[ch.length-i-1]=temp;
        }
        String reversedString=new String(ch);
        System.out.println("Reversed string is: "+reversedString);
    }
}
