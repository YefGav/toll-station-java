package dev.yeferson.model;

import org.junit.jupiter.api.Test;

public class VehicleTest {

    @Test
        public void testCarTollValue() {
            Vehicle car = new Car("ABC123");
            assertThat(car.getTollValue(), is(100.0));
        }
    }


