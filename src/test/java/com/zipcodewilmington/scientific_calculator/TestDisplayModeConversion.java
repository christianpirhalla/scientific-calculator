package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.displayModeConversion;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TestDisplayModeConversion {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void main() {
    }

    @Test
    void testConvertToDisplayMode(){
    displayModeConversion dmc = new displayModeConversion();
    double testingValue = 200.0;

    // first test: hex
    Assertions.assertEquals("0x1.9p7", dmc.convertToDisplayMode("hexadecimal", testingValue));

    // second test: binary
    Assertions.assertEquals(dmc.convertToDisplayMode("binary", testingValue), "11001000");

    // third test:
    Assertions.assertEquals(dmc.convertToDisplayMode("octal", testingValue), "310");

    // fourth test: decimal
    Assertions.assertEquals(dmc.convertToDisplayMode("decimal", testingValue), "200.0");
    }

}
