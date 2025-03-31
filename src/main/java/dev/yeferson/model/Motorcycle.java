package dev.yeferson.model;

public class Motorcycle  extends Vehicle {

    public Motorcycle(String licensePlate) {
        super(licensePlate);
    }

    @Override
    public double getTollValue() {
        return 50.0;
    }

}
