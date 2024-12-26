package Inheritance_in_java;

public class Truck extends Vehicle{
    public Truck(int numberOfWheels) {
        super(numberOfWheels);
    }
    //override start method
    void start(){
        System.out.println("Vehicle starts from truck class");
    }
}
