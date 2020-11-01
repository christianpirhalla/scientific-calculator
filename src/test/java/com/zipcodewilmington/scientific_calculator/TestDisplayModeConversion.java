package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.displayModeConversion;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestDisplayModeConversion {

@org.junit.Test
    public void testConvertToDisplayMode(){
    displayModeConversion dmc = new displayModeConversion();
    double testingValue = 200.0;

    // first test: hex
    Assert.assertEquals("0x1.9p7", dmc.convertToDisplayMode("hexadecimal", testingValue));

    // second test: binary
    Assert.assertEquals(dmc.convertToDisplayMode("binary", testingValue), "11001000");

    // third test:
    Assert.assertEquals(dmc.convertToDisplayMode("octal", testingValue), "310");

    // fourth test: decimal
    Assert.assertEquals(dmc.convertToDisplayMode("decimal", testingValue), "200.0");
    }

}
