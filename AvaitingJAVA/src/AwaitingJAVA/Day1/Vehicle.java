package AwaitingJAVA.Day1;

public class Vehicle {
    double speed;
    int numberOfWheels;

    void go(){
        System.out.println("The vehicle is moving");
    }
    void stop(){
        System.out.println("The vehicle has stooped");
    }
    public static void modelOfVehicle(int year){
        System.out.println("Vehicle Year: " + year);
    }
    public static void modelOfVehicle(String name, int year){
        System.out.println("Vehicle name: " + name+ ", and Year of production: " + year);
    }
}
