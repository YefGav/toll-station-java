package dev.yeferson.model;

import org.junit.jupiter.api.Test;

public class TollStationTest {

    @Test

    public void testTollStation() {

        TollStation station = new TollStation("Huerna", "Asturias");
        assertThat(station, is(notNullValue()));
        assertThat(station.getName(), is("Huerna"));
        assertThat(station.getCity(), is("Asturias"));
        assertThat(station.getTotalCollected(), is(0.0));
    }
   
}

