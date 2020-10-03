package com.company;

public class Car extends Transport {

    private int fuelQuantity;
    private int engineRun;
    private int stop;
    private boolean engineStarted;
    private boolean EnoughFuel;
    private boolean move;

    public Car(int fuelQuantity){
        this.fuelQuantity = fuelQuantity;
    }

    public int getFuelQuantity() {
        return fuelQuantity;
    }

    public void setEngineStarted(boolean engineCheck) {
        this.engineStarted = engineCheck;
    }

    public boolean isEngineStarted() {
        return engineStarted;
    }

    public int getEngineRunning() {
        return engineRun;
    }

    public void setEngineRunning(int engineRun) {
        this.engineRun = engineRun;
    }

    public void setEnoughFuel(boolean fuelCheck) {
        this.EnoughFuel = fuelCheck;
    }

    public boolean isEnoughFuel() {
        return EnoughFuel;
    }

    public void setMove(boolean move) {
        this.move = move;
    }

    public boolean isMove() {
        return move;
    }

    public void Stop(int stop) {
        this.stop = stop;
    }

    public int getStop() {
        return stop;
    }

    @Override
    void hasEnoughFuel() {
        if (getFuelQuantity() > 0){
            setEnoughFuel(true);
        } else {
            noFuel();
            setEnoughFuel(false);
        }
    }

    @Override
    void engineStarted() {
        if (isEnoughFuel()){
            if (getEngineRunning() == 1){
                started();
                engineRun();
                setEngineStarted(true);
            } else if(getEngineRunning() == 0){
                engineNoRun();
                setEngineStarted(false);
            } else {
                invalidValue();
                setEngineStarted(false);
            }
        }
    }

    @Override
    void move() {
        if (isEngineStarted()){
            run();
            setMove(true);
        } else {
            setMove(false);
        }
    }

    @Override
    void stopTransport() {
        if (isMove()){
            if (getStop() == 1){
                stop();
            } else if(getStop() == 0){
                noStop();
            } else {
                invalidValue();
            }
        }
    }
}
