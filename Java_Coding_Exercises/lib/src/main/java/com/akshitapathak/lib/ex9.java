package com.akshitapathak.lib;

public class ex9 {
    public static void main(String[] args){
        //Add 2 matrices of same order
        int[][] mat1={{1,2,1},{2,1,3},{3,2,1}};
        int[][] mat2={{2,1,2},{3,2,1},{1,3,2}};
        //same order
        int[][] result=new int[mat1.length][mat1[0].length];
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[0].length;j++){
                result[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        System.out.println("Answer is: ");
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[0].length;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
