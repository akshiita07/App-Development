package Abstraction_and_Interfaces;

public class Car  implements VehicleInterface{
    String color;
    public Car(String color){
        this.color=color;
    }
    public void honk(){
        System.out.println("Honk Honk!");
    }
    @Override
    public void interfaceStart() {
        System.out.println("Car starts");
    }

    @Override
    public void interfaceStop() {
        System.out.println("Car stops");
    }

    @Override
    public void interfaceAccelerate() {
        System.out.println("Car accelerates");
    }

    @Override
    public void interfaceBrake() {
        System.out.println("Car brakes");
    }
}
