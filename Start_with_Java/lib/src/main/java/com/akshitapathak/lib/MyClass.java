package com.akshitapathak.lib;

public class MyClass {
    // Single line comment

    /*
    This is multi line comment
    Also called as
    Block comment
    * */

    //Creating MAIN METHOD:
    public static void main(String[] args){
        //write java code here

        //System.out.print("Hello World!");

        //CREATING VARIABLES:
        //int age=19;
        //System.out.print("My age is "+age);

        //DATA TYPES:
        /*
        byte x1=100;        //from -128 to 127
        System.out.print("Byte variable: "+x1);

        short x2=-31000;
        System.out.print("\nShort variable: "+x2);

        int x3=2100123;
        System.out.print("\nInt variable: "+x3);

        long x4=1122334455667788L;
        System.out.print("\nLong variable: "+x4);

        float x5=123.45F;
        System.out.print("\nFloat variable: "+x5);

        double x6=-1234.56789;
        System.out.print("\nDouble variable: "+x6);

        char x7='a';
        System.out.print("\nCharacter variable: "+x7);

        boolean x8=true;
        System.out.print("\nBoolean variable: "+x8);
         */

        /*
        //TYPE CASTING IN JAVA:
        //IMPLICIT:
        int x=10;
        double y=x;
        //EXPLICIT:
        double p=3.14;
        int q=(int)p;
        //Ascii:
        int s=5;
        char c='A';
        char newChar=(char)(s+c);
        System.out.print("The new character is: "+newChar);
         */

        /*
        //ARITHMETIC OPERATIONS
        System.out.print(2+3);
        System.out.print(3-5);
        System.out.print(2*3);
        System.out.print(10/2);
        System.out.print(19%2);

         */

        /*
        //COMPARISON OPERATIONS:
        int a=10;
        int b=5;
        System.out.print(a==b);
        System.out.print(a!=b);
        System.out.print(a>b);
        System.out.print(a>=b);
        System.out.print(a<b);
        System.out.print(a<=b);

         */

        /*
        //LOGICAL OPERATIONS:
        boolean isRaining=true;
        boolean needUmbrella=false;

        boolean canGoOut=isRaining && !(needUmbrella);
        System.out.print(canGoOut);
        boolean canPlay=isRaining || needUmbrella;
        System.out.print(canPlay);

         */

        /*
        //STRINGS:
        String s="Hello, how are you";
        System.out.println(s);
        System.out.println("Length of string is: "+s.length());
        String s2="Goodbye";
        String s3=s+s2;
        System.out.println("After concatenation: "+s3);

         */

        //CONDITIONAL STATEMENTS:
        /*
        int age=19;
        if(age>=18){
            System.out.println("You are an adult");
        } else if (age==65) {
            System.out.println("You must retire");
        }else{
            System.out.println("You are a minor");
        }

         */

        /*
        int day=3;
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Unknown Day");
        }

         */

        /*
        //PRINT NUMBERS FROM 1 TO 5 USING WHILE LOOP
        int n=1;
        while(n<=5){
            System.out.println(n);
            n=n+1;
        }

         */

        /*
        //PRINT NUMBERS FROM 1 TO 5 USING FOR LOOP
        for(int i=1;i<=5;i++){
            System.out.println(i);
        }

         */

        /*
        //ARRAYS:
        int[] arr=new int[4];
        arr[0]=8;
        arr[1]=12;
        arr[2]=7;
        arr[3]=27;

        System.out.println("Elements of array are:");
        for(int i=0;i<4;i++){
            System.out.println(arr[i]);
        }


        System.out.println("Elements of array are using FOR EACH LOOP:");
        for(int it:arr){
            System.out.println(it);
        }

         */

        //CREATE 3X3 MATRIX
        int[][] arr=new int[3][3];
        arr[0][0]=1;
        arr[0][1]=2;
        arr[0][2]=3;
        arr[1][0]=4;
        arr[1][1]=5;
        arr[1][2]=6;
        arr[2][0]=7;
        arr[2][1]=8;
        arr[2][2]=9;
        System.out.println("Elements of matrix are: ");
        for(int[] row:arr){
            for(int colm:row){
                System.out.println(colm);
            }
        }

    }
}