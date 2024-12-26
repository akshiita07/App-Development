package anotherPackage;

//Import the class Car from a different package:
import com.akshitapathak.lib.Car;

public class Test {
    public static void main(String[] args){
//        Car yellowCar=new Car(20,"Yellow");
//        System.out.println("Speed is: "+yellowCar.speed+" and color: "+yellowCar.color);

        Car desire=new Car();
        desire.setSpeed(30);
        System.out.println("Speed is: "+desire.getSpeed()+" and color: "+desire.color);

    }
}
