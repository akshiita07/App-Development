package com.akshitapathak.lib;

public class ex7 {
    public static void main(String[] args){
        //count number of even & odd numbers in a given array:
        int[] arr={5,7,2,4,9};
        int even=0;
        int odd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Even numbers: "+even);
        System.out.println("Odd numbers: "+odd);
    }
}
