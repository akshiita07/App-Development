package Abstraction_and_Interfaces;

import java.awt.TrayIcon;

public class Truck implements VehicleInterface{
    public int wheels;
    public Truck(int wheels){
        this.wheels=wheels;
    }
    @Override
    public void interfaceStart() {
        System.out.println("Truck starts");
    }

    @Override
    public void interfaceStop() {
        System.out.println("Truck stops");
    }
    public void interfaceAccelerate() {
        System.out.println("Truck accelerates");
    }

    @Override
    public void interfaceBrake() {
        System.out.println("Truck brakes");
    }
}
