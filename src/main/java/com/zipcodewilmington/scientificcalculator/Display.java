package com.zipcodewilmington.scientificcalculator;

public class Display {
    private final Console console;
    public Display(Console console) {
        this.console = console;
    }
    public Display() {
        this(new Console());
    }

    public String getDisplayValue() {  // retrieve inputted value
        return null;
    }
    public void updateDisplay(String valueToDisplay) { // return the current value presented on the display ??

    }

    public void clearDisplayValue() { // clear the value on the display

    }

    public void updateDisplayValue(String valueToBeUpdated) { // update display with 'valueToBeUpdated'
    }

    public void switchDisplayModeToOctal() { // convert displayed value to expression in base eight
    }

    public void switchDisplayModeToDecimal() { // convert displayed value to expression in base 10
    }

    public void switchDisplayModeToHexadecimal() { // convert displayed value to expression in base 16
    }

    public void switchDisplayModeToDegrees() { //convert displayed value to degrees
    }

    public void switchDisplayModeToRadians() { //convert displayed value to radians
    }
}
