package dev.yeferson.model;

public class TollStation {

    private String name;
    private String city;
    private double totalCollected = 0.0;
    
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

    

}
