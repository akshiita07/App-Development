package Inheritance_in_java;

public class Car extends Vehicle{
    //specific to car class:
    String color;
    //uses super keyword to access immediate parents members
    public Car(String color) {
        super(4);
        this.color=color;
    }
    //specific method of car class:
    void honk() {
        System.out.println("Honk Honk!");
    }
    //Method overriding:
    void start(){
        System.out.println("Vehicle starts from car class");
    }
}
