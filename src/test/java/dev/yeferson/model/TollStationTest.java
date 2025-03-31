package dev.yeferson.model;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TollStationTest {

    @Test

    public void testTollStation() {

        TollStation station = new TollStation("Huerna", "Asturias");
        assertThat(station, is(notNullValue()));
        assertThat(station.getName(), is("Huerna"));
        assertThat(station.getCity(), is("Asturias"));
        assertThat(station.getTotalCollected(), is(0.0));
    }

    @Test
    public void testRegisterVehicle() {
        TollStation station = new TollStation("Huerna", "Asturias");
        Vehicle car = new Car("ABC123");
        station.registerVehicle(car);
        assertThat(station.getTotalCollected(), is(100.0));
    }

    @Test
    public void testPrintSummary() {
        TollStation station = new TollStation("Huerna", "Asturias");
        station.registerVehicle(new Car("ABC123"));
        station.registerVehicle(new Motorcycle("XYZ789"));
        station.registerVehicle(new Truck("TRK456", 2));
        station.printSummary(); 
    }
}
