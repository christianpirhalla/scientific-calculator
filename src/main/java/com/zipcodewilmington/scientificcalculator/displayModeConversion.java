package com.zipcodewilmington.scientificcalculator;

public class displayModeConversion {

    // This method takes a String mode and a Double value and produces a String representing
    // how that value should be displayed depending on the display mode

    // we must account for binary, octal, decimal, and hexadecimal
    public static String convertToDisplayMode(String mode, Double value){
        Long valueLong = value.longValue(); // it is necessary to cast Double value to a long for certain cases
        switch(mode) {

            case "binary":
                // references valueLong and uses a built in method to return
                // a binary representation in String form.

                return Long.toBinaryString(valueLong);


            case "octal":
                // References valueLong and uses a built in method to return
                // an octal representation in String form.
                return Long.toOctalString(valueLong);


            case "decimal":
                // just the regular Double number. No need for conversion.
                return Double.toString(value);


            case "hexadecimal":
                // Double has a built in method to return a hexadecimal String representation.
                StringBuilder hexBuilder = new StringBuilder();

                return Double.toHexString(value);


            default:
                System.out.println("You have selected an invalid display mode.");
                break;
        }

        return mode;
    }
}
