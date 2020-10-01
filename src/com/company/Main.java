package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Car: ");
        System.out.println("Enter how much fuel is in the transport?");
        Scanner fuel = new Scanner(System.in);
        int litres = fuel.nextInt();
        Car car = new Car(litres);
        car.fuelCheck();

        if (car.isFuelCheck()) {
            System.out.println("The engine is running? (if NO - enter 0, if YES, enter 1)");
            Scanner engine = new Scanner(System.in);
            int engineRun = engine.nextInt();
            car.setEngineRun(engineRun);
            car.engineCheck();
        }


        if (car.isFuelCheck() && car.isEngineCheck()){
            car.move();
            System.out.println("Do you want to stop transport? (if NO - enter 0, if YES, enter 1)");
            Scanner stopTransport = new Scanner(System.in);
            int stop = stopTransport.nextInt();
            car.setStop(stop);
            car.stopTransport();
        }




        System.out.println("Plane: ");
        System.out.println("Enter how much fuel is in the transport?");
        Scanner fuelPlane = new Scanner(System.in);
        int litresPlane = fuelPlane.nextInt();
        Plane plane = new Plane(litresPlane);
        plane.fuelCheck();

        if (plane.isFuelCheck()) {
            System.out.println("The engine is running? (if NO - enter 0, if YES, enter 1)");
            Scanner enginePlane = new Scanner(System.in);
            int engineRunPlane = enginePlane.nextInt();
            plane.setEngineRun(engineRunPlane);
            plane.engineCheck();
        }


        if (plane.isFuelCheck() && plane.isEngineCheck()){
            plane.move();
            System.out.println("Do you want to stop transport? (if NO - enter 0, if YES, enter 1)");
            Scanner stopTransportPlane = new Scanner(System.in);
            int stopPlane = stopTransportPlane.nextInt();
            plane.setStop(stopPlane);
            plane.stopTransport();
        }


    }
}
