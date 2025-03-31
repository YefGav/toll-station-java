package dev.yeferson.model;

import org.junit.jupiter.api.Test;

public class MotorcycleTest {

    @Test
    public void testMotorcycleTollValue() {
        Vehicle motorcycle = new Motorcycle("XYZ789");
        assertThat(motorcycle.getTollValue(), is(50.0));
    }

}
