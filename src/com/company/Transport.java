package com.company;

abstract public class Transport {

    public void started(){System.out.println("Transport started up!");};
    public void noFuel(){System.out.println("No fuel!");};
    public void noFuelPlane(){System.out.println("Not enough fuel!");};
    public void engineRun(){System.out.println("The engine is running!");};
    public void engineNoRun(){System.out.println("The engine no is running!");};
    public void invalidValue(){System.out.println("You entered invalid values!");};
    public void run (){System.out.println("Transport in move!");}
    public void stop(){System.out.println("The transport stopped!");};
    public void noStop(){System.out.println("Continuing motion!");};

    abstract void hasEnoughFuel();
    abstract void engineStarted();
    abstract void move();
    abstract void stopTransport();
}
