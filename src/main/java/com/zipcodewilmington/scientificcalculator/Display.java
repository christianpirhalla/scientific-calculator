package com.zipcodewilmington.scientificcalculator;

public class Display {

    private final Console console;
    private String displayValue;
    private displayModeConversion conversionMode;


    public Display(Console console) {
        this.console = console;
        this.displayValue = null;
        this.conversionMode = new displayModeConversion();
    }
    // added this in thru git - Christian 3:15PM
    public Console getIoConsole(){ return console;}

    public Display() {
        this(new Console());
    }  // constructor to make a new instance of console

    public String getDisplayValue() {  // retrieve displayed value
        return displayValue;
    }

    public void printDisplayValue() {
        console.println(getDisplayValue());
    }  // prints Display value to console

    public void updateDisplay(String valueToDisplay) { // return the current value presented on the display
        this.displayValue = valueToDisplay;
    } // updates the display

    public void clearDisplayValue() { // clear the value on the display
        this.displayValue = null;
    } // clears display

    public void switchDisplayModeToOctal() { // convert displayed value to expression in base eight
        this.conversionMode.convertToDisplayMode("octal", Double.parseDouble(getDisplayValue()));
    }

    public void switchDisplayModeToDecimal() { // convert displayed value to expression in base 10
        this.conversionMode.convertToDisplayMode("decimal", Double.parseDouble(getDisplayValue()));
    }

    public void switchDisplayModeToHexadecimal() { // convert displayed value to expression in base 16
        this.conversionMode.convertToDisplayMode("hexidecimal", Double.parseDouble(getDisplayValue()));
    }

    public void switchDisplayTrigonometryMode() {
        String userInput = console.getStringInput("Would you like to calculate in degrees or radians?");
        if ("degrees".equalsIgnoreCase(userInput)) {
            switchDisplayModeToDegrees();
        } else if ("radians".equalsIgnoreCase(userInput)) {
            switchDisplayModeToRadians();
        } else {
            switchDisplayTrigonometryMode();
        }
    }


    public void switchDisplayModeToDegrees() { // convert displayed value to degrees
        this.conversionMode.convertToDisplayMode("degree", Double.parseDouble(getDisplayValue()));
    }

    public void switchDisplayModeToRadians() { // convert displayed value to radians
        this.conversionMode.convertToDisplayMode("radians", Double.parseDouble(getDisplayValue()));
    }
}

