package Abstraction_and_Interfaces;

public class Vehicle {
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
