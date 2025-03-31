package dev.yeferson.model;

public abstract class Vehicle {

    private String licensePlate;

    public Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public abstract double getTollValue();
}


