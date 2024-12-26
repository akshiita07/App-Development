package com.akshitapathak.lib;

public class ex6 {
    public static void main(String[] args){
        //Given 2 arrays of integers
        //Multiply corresponding elements
        int[] arr1={1,3,-5,4};
        int[] arr2={1,4,-5,-2};
        int [] productArr=new int[4];
        for(int i=0;i<arr1.length;i++){
            productArr[i]=arr1[i]*arr2[i];
        }
        System.out.println("Answer: ");
        for(int i=0;i<arr1.length;i++){
            System.out.print(productArr[i]+" ");
        }
    }
}
