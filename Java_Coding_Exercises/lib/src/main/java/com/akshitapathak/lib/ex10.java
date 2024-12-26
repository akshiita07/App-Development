package com.akshitapathak.lib;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args){
        //Calculate average of array elements:
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter number of elements of array: ");
        int n=s1.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements of array: ");
        for(int i=0;i<n;i++){
            arr[i]=s1.nextInt();
        }
        System.out.println("Your array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        double avg=(double) sum/n;
        System.out.println("Average is: "+avg);
    }
}
