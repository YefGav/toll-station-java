package dev.yeferson.model;

public class Car  extends Vehicle {

    public Car(String licensePlate) {
        super(licensePlate);
    }

    @Override
    public double getTollValue() {
        return 100.0;
    }

}
