package dev.yeferson.model;

import org.junit.jupiter.api.Test;

public class TruckTest {

    @Test
    public void testTruckTollValue() {
        Vehicle truck = new Truck("TRK456", 3);
        assertThat(truck.getTollValue(), is(150.0));

    }

}
