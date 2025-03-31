package dev.yeferson.model;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class VehicleTest {

    @Test
        public void testCarTollValue() {
            Vehicle car = new Car("ABC123");
            assertThat(car.getTollValue(), is(100.0));
        }
    }


