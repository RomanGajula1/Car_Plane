package com.company;

public class Plane extends Transport {

    private int fuelQuantity;
    private int engineRun;
    private int stop;
    private int fuelQuantityMin = 100;
    private boolean engineStarted;
    private boolean hasEnoughFuel;
    private boolean move;

    public Plane(int fuelQuantity){
        this.fuelQuantity = fuelQuantity;
    }

    public int getLitresMin() {
        return fuelQuantityMin;
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

    public void setEngineRun(int engineRun) {
        this.engineRun = engineRun;
    }

    public int getEngineRun() {
        return engineRun;
    }

    public void setHasEnoughFuel(boolean fuelCheck) {
        this.hasEnoughFuel = fuelCheck;
    }

    public boolean isHasEnoughFuel() {
        return hasEnoughFuel;
    }

    public void setMove(boolean move) {
        this.move = move;
    }

    public boolean isMove() {
        return move;
    }

    public void setStop(int stop) {
        this.stop = stop;
    }

    public int getStop() {
        return stop;
    }

    @Override
    void hasEnoughFuel() {
        if (getFuelQuantity() > getLitresMin()){
            setHasEnoughFuel(true);
        } else {
            noFuelPlane();
            setHasEnoughFuel(false);
        }
    }

    @Override
    void engineStarted() {
        if (isHasEnoughFuel()){
            if (getEngineRun() == 1){
                started();
                engineRun();
                setEngineStarted(true);
            } else if(getEngineRun() == 0){
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
