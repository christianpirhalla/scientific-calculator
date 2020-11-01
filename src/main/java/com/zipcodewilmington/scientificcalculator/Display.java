package com.zipcodewilmington.scientificcalculator;

public class Display {
    private final Console console;
    private String displayValue;
    private displayModeConversion conversionMode;
    private Boolean isMeasuringDegrees;

    public Display(Console console) {
        this.console = console;
        this.displayValue = null;
        this.conversionMode = new displayModeConversion();
    }

    public Display() {
        this(new Console());
    }

    public String getDisplayValue() {  // retrieve displayed value
        return displayValue;
    }

    public void printDisplayValue() {
        console.println(getDisplayValue());
    }

    public void updateDisplay(String valueToDisplay) { // return the current value presented on the display
        this.displayValue = valueToDisplay;
    }

    public void clearDisplayValue() { // clear the value on the display
        this.displayValue = null;
    }

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

    public Boolean isMeasuringDegrees() {
        return this.isMeasuringDegrees;
    }

    public void switchToMeasuringDegrees(){
        this.isMeasuringDegrees = true;
    }

    public void switchToMeasuringRadians() {
        this.isMeasuringDegrees = false;
    }

    public void switchDisplayModeToDegrees() { //convert displayed value to degrees
        this.conversionMode.convertToDisplayMode("degree", Double.parseDouble(getDisplayValue()));
    }

    public void switchDisplayModeToRadians() { //convert displayed value to radians
        this.conversionMode.convertToDisplayMode("radians", Double.parseDouble(getDisplayValue()));
    }
}