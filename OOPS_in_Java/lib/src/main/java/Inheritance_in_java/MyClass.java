package Inheritance_in_java;

public class MyClass {
    public static void main(String [] args){
        Car mercedes=new Car("Blue");
        //Local properties in bold:
        mercedes.honk();
        System.out.println("Color is: "+mercedes.color);
        //Inherited from vehicle classs:
        System.out.println("Wheels are: "+mercedes.numberOfWheels);
        mercedes.start();
        mercedes.stop();

        Vehicle v1=new Car("Yellow");
        Vehicle v2=new Truck(6);
        v1.start();
        v2.start();

        //cannot create vehicle class ka instance as it is abstract class
//        Vehicle v3=new Vehicle() error aayga
    }
}
