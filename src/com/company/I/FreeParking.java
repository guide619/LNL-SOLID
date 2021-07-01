package com.company.I;

public class FreeParking implements ParkingLot{
    @Override
    public void parkCar() {

    }

    @Override
    public void unparkCar() {

    }

    @Override
    public void getCapacity() {

    }

    @Override
    public double calculateFee(Car car) {
        //throw something , it's Free
        return 0;
    }

    @Override
    public void doPayment(Car car) {
        //throw something , it's Free
    }
}
