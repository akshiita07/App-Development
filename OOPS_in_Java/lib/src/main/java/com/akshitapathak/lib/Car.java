package com.akshitapathak.lib;

//public access modifier: can access class from files within same package ie com.akshitapathak.lib
public class Car{
    //Attributes: variables
    private int speed;
    public String color;

    /*
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
    */

    //ENCAPSULATION: getters and setters:
    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    }
}
