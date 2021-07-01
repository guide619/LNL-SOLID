package com.company.L;

public interface Car {
    void turnOnEngine();
    void accelerate();
}

class MotorCar implements Car {

    private Engine engine;

    //Constructors, getters + setters

    public void turnOnEngine() {
        //turn on the engine!
        engine.on();
    }

    public void accelerate() {
        //move forward!
        engine.powerOn(1000);
    }
}

class ElectricCar implements Car {

    @Override
    public void turnOnEngine() {

    }

    @Override
    public void accelerate() {

    }
}