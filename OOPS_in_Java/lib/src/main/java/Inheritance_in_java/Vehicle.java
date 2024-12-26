package Inheritance_in_java;

//Parent class:
public abstract class Vehicle {
    int numberOfWheels;

    public Vehicle(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    void start(){
        System.out.println("Vehicle starts");
    }
    void stop(){
        System.out.println("Vehicle stops");
    }
}
