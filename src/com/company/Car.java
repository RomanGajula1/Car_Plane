package com.company;

public class Car extends Transport {

    private int litres;
    private int engineRun;
    private int stop;
    private boolean engineCheck;
    private boolean fuelCheck;
    private boolean move;

    public Car(int litres){
        this.litres = litres;
    }

    public int getLitres() {
        return litres;
    }

    public void setEngineCheck(boolean engineCheck) {
        this.engineCheck = engineCheck;
    }

    public boolean isEngineCheck() {
        return engineCheck;
    }

    public void setEngineRun(int engineRun) {
        this.engineRun = engineRun;
    }

    public int getEngineRun() {
        return engineRun;
    }

    public void setFuelCheck(boolean fuelCheck) {
        this.fuelCheck = fuelCheck;
    }

    public boolean isFuelCheck() {
        return fuelCheck;
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
    void fuelCheck() {
        if (getLitres() > 0){
            setFuelCheck(true);
        } else {
            noFuel();
            setFuelCheck(false);
        }
    }

    @Override
    void engineCheck() {
        if (isFuelCheck()){
            if (getEngineRun() == 1){
                started();
                engineRun();
                setEngineCheck(true);
            } else if(getEngineRun() == 0){
                engineNoRun();
                setEngineCheck(false);
            } else {
                noCorrect();
                setEngineCheck(false);
            }
        }
    }

    @Override
    void move() {
        if (isEngineCheck()){
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
                noCorrect();
            }
        }
    }
}
