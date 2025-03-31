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

    public class VehicleTest {

        @Test
        public void testCarTollValue() {
            Vehicle car = new Car("ABC123");
            assertThat(car.getTollValue(), is(100.0));
        }
    }
   
}

