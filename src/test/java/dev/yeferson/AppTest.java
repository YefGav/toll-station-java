package dev.yeferson;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AppTest {

    @Test
    public void testAppMainWithCar() {
  
        String simulatedInput = "1\nABC123\n";
        ByteArrayInputStream testInput = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(testInput);

       
        ByteArrayOutputStream testOutput = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(testOutput));

        try {
    
            App.main(new String[]{});
        } finally {
   
            System.setIn(System.in);
            System.setOut(originalOut);
        }

        String output = testOutput.toString();
        
        assertThat(output, containsString("Toll Station: Huerna in Asturias"));
        assertThat(output, containsString("ABC123"));
        assertThat(output, containsString("Total Collected: $100.0"));
    }
}
