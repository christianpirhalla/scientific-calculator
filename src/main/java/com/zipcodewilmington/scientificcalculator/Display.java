package com.zipcodewilmington.scientificcalculator;

public class Display {

    private final Console console;
    private String displayValue;
    private displayModeConversion conversionMode;
    private String convertToDisplayMode;


    public Display(Console console) {
        this.console = console;
        this.displayValue = null;
        this.conversionMode = new displayModeConversion();
    }

    // added this in thru git - Christian 3:15PM
    public Console getIoConsole() {
        return console;
    }

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

    public String switchDisplayModeToBinary() {
        return this.conversionMode.convertToDisplayMode("binary", Double.parseDouble(getDisplayValue()));
    }

    public String switchDisplayModeToOctal() { // convert displayed value to expression in base eight
        return this.conversionMode.convertToDisplayMode("octal", Double.parseDouble(getDisplayValue()));
    }

    public String switchDisplayModeToDecimal() { // convert displayed value to expression in base 10
        return this.conversionMode.convertToDisplayMode("decimal", Double.parseDouble(getDisplayValue()));
    }

    public String switchDisplayModeToHexadecimal() { // convert displayed value to expression in base 16
        return this.conversionMode.convertToDisplayMode("hexadecimal", Double.parseDouble(getDisplayValue()));
    }

}






