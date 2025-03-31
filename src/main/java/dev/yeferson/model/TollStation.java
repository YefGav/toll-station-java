package dev.yeferson.model;

import java.util.ArrayList;
import java.util.List;

public class TollStation {

    private String name;
    private String city;
    private double totalCollected = 0.0;
    private List<Vehicle> vehicles = new ArrayList<>();

    public TollStation(String name, String city) {
        this.name = name;
        this.city = city;

    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public double getTotalCollected() {
        return totalCollected;
    }

    public void registerVehicle(Vehicle vehicle) {
        totalCollected += vehicle.getTollValue();
        vehicles.add(vehicle);
    }

    public void printSummary() {
        System.out.println("Toll Station: " + name + " in " + city);
        System.out.println("Vehicles:");
        for (Vehicle v : vehicles) {
            System.out.println("- " + v.getLicensePlate() + ": $" + v.getTollValue());
        }
        System.out.println("Total Collected: $" + totalCollected);
    }

}
