package dev.yeferson.model;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TruckTest {

    @Test
    public void testTruckTollValue() {
        Vehicle truck = new Truck("TRK456", 3);
        assertThat(truck.getTollValue(), is(150.0));

    }

}
