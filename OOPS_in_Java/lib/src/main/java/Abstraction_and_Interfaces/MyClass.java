package Abstraction_and_Interfaces;

public class MyClass {
    public static void main(String [] args){
        Car v1=new Car("Red");
        Truck v2=new Truck(4);
        v1.interfaceStart();
        v2.interfaceStop();
    }
}
