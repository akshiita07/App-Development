package com.akshitapathak.lib;

public class MyClass {
    public static void main(String[] args){
        //Recap:
        int age=19;
        System.out.print("I am "+age+" years old.");
        String s="Agra";
        System.out.println("\nI went to "+s+" of length: "+s.length());
        if(age>18){
            System.out.println("Can vote");
        }else{
            System.out.println("Sorry!");
        }
        int[] arr=new int[4];
        arr[0]=7;
        arr[1]=12;
        arr[2]=27;
        arr[3]=8;
        for(int it:arr){
            System.out.print(it+" ");
        }
        //Methods:
        System.out.println("\nJava Methods");
        //Syntax:

        greet();

        int salary=giveSalary();
        System.out.println("My salary is: "+salary);

        int sum=addNumbers();
        System.out.println("The total is: "+sum);
        System.out.println("2nd method: The total is: "+addNumbers());

        int x=10;
        int y=5;
//        System.out.println("Sum of "+x+" and "+y+" is: "+addNumbersWithParameters(x,y));
        System.out.println("Method overloading: Double sum is: "+addNumbersWithParameters(10.4,3.1));

        int[] arr2 = {5, 8, 3, 12, 7};
        System.out.println("Max value from array is: "+findMaxValue(arr2));

        //Class Object:
//        Car porche=new Car();
//        porche.color="Red";
//        porche.speed=80;
//        porche.accelerate();
//        porche.brake();

        //Using constuctor:
//        Car mercedes=new Car(60,"Blue");
//        System.out.println("Speed is: "+mercedes.speed+" and color: "+mercedes.color);
    }

    //Methods:
    static void greet(){
        System.out.println("Good evening Akshita!");
    }
    static int giveSalary(){
        int sal=75;
        return sal;
    }
    static int addNumbers(){
        int x=2;
        int y=3;
        return x+y;
    }
    static int addNumbersWithParameters(int x,int y){
        return x+y;
    }
    //Method overloading: same methodName but different data types:
    static double addNumbersWithParameters(double x,double y){
        return x+y;
    }

    //Finding Max Value of an Array:
    static int findMaxValue(int[] arr){
        int maxi=arr[0];
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]>maxi){
                maxi=arr[i];
            }
        }
        return maxi;
    }
}

/*
//Class:
class Car{
    //Attributes: variables
    int speed;
    String color;
    //Methods:functions
    void accelerate(){
        //Increase speed by 10
        speed+=10;
        System.out.println("Your new speed is: "+speed);
    }
    void brake(){
        //Decrease speed by 5
        speed-=5;
        System.out.println("Your new speed is: "+speed);
    }
    public Car(int carSpeed,String carColor){
        speed=carSpeed;
        color=carColor;
    }
}
*/
