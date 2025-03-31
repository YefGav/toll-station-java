package dev.yeferson.model;

public class Truck extends Vehicle {

    private int numberOfAxles;

    public Truck(String licensePlate, int numberOfAxles) {
        super(licensePlate);
        this.numberOfAxles = numberOfAxles;
    }

    @Override
    public double getTollValue() {
        return numberOfAxles * 50.0;
    }

}
