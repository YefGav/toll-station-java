package dev.yeferson.model;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.BeforeEach;

public class TollStationTest {

    private TollStation station;

    @BeforeEach
    public void setUp() {
        station = new TollStation("Huerna", "Asturias");
    }

    @Test
    public void testTollStation() {
        assertThat(station, is(notNullValue()));
        assertThat(station.getName(), is("Huerna"));
        assertThat(station.getCity(), is("Asturias"));
        assertThat(station.getTotalCollected(), is(0.0));
    }

    @Test
    public void testRegisterVehicle() {
        Vehicle car = new Car("ABC123");
        station.registerVehicle(car);
        assertThat(station.getTotalCollected(), is(100.0));
    }

    @Test
    public void testPrintSummary() {
        station.registerVehicle(new Car("ABC123"));
        station.registerVehicle(new Motorcycle("XYZ789"));
        station.registerVehicle(new Truck("TRK456", 2));
        station.printSummary();
    }
}