package com.akshitapathak.lib;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args){
        //Create pattern: if n=3 then pattern:
//          1
//         2 2
//        3 3 3
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int n=s1.nextInt();
        int s=n+4-1;        //no of spaces
        for(int i=1;i<=n;i++){   //rows
            for(int j=s;j!=0;j--){   //spaces
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){   //colms
                System.out.print(i+" ");
            }
            System.out.print("\n");
            s--;
        }

    }
}
