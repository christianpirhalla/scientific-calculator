package com.zipcodewilmington.scientificcalculator;
import java.lang.Math.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;






public class Calculator {
    private CalculatorEngine engine = new CalculatorEngine();
    // display will contain the I/O Console
    private Display display = new Display();
    // this is the value stored on the calculator and displayed on the screen
    // 0 by default
    private Double value = 0.0;
    // this determines whether the calculator is on or not
    // true by default
    private Boolean isOn = true;
    // this controls whether we're in radian or degree mode
    private String unitsMode = "radians";
    // this stores what display mode we're in
    private String displayMode = "decimal";
    // this is the value that will be stored in memory
    private Double memory = 0.0;
    //This will say whether ther is an error present
    private Boolean errorPresent = false;

    //setters/getters
    // we shouldn't need any for engine, display, memory, or value, since they will all be passed to
    // other classes through this one.
    public Boolean getIsOn(){
        return isOn;
    }
    public void setIsOn(Boolean status){
        isOn = status;
    }

    public void switchUnitsMode(String mode) {
        if (!mode.equals("radians") && !mode.equals("degrees")) {
            display.getIoConsole().println("You selected an invalid unit mode. Please enter either 'radians' or 'degrees'");
        } else {
            unitsMode = mode;
        }

        display.getIoConsole().println("You are currently operating in " + unitsMode + " mode.");

    }
    public void switchUnitsMode(){

        if (unitsMode.equals("radians")){

            unitsMode = "degrees";
        }
        else {
            unitsMode = "radians";
        }
        display.getIoConsole().println("You are currently operating in " + unitsMode + " mode.");

    }

    public void switchDisplayMode(String mode){
        if (!mode.equals("binary") && !mode.equals("decimal") && !mode.equals("hexadecimal") && !mode.equals("octal")) {
            display.getIoConsole().println("You entered an invalid display mode. Please enter binary, decimal, hexadecimal, or octal.");
        }
        else { displayMode = mode; }

    }

    public void switchDisplayMode(){
        //cycle through
        switch(displayMode){
            case "binary":
                displayMode = "decimal";
                break;

            case "decimal":
                displayMode = "hexadecimal";
                break;

            case "hexadecimal":
                displayMode = "octal";
                break;

            case "octal":
                displayMode = "binary";
                break;
        }
        Console.println("Display mode updated to " + displayMode + ".");
    }


    // This is where we will handle commands and throw errors for invalid input
    public void handleCommands(String cmd){ // This method is huge! Feel free to collapse
        switch (cmd){
            //switch statement determines which method of engine they are going to call

            //if a second operand is required, prompt the user
            //set value to the return of the method called
            /** (Expand) List of commands present in Calculator Engine to be accounted for
             *
             * -add
             * -subtract
             * -multiply
             * -square
             * -sqRoot
             * -degToRad
             * -radToDeg
             * -sine
             * -cosine
             * -tangent
             * -aSine
             * -aCosine
             * -aTangent
             * -commonLog
             * -invCommonLog
             * -ln
             * -invLn
             * -factorial
             *
             * Functional commands
             * -help
             * -clear
             * -close
             * -memoryadd
             * -memoryclear
             * -memorystore
             */

            //Start mathematical functions
            case "add":
                value = engine.add(value, display.getIoConsole().getDoubleInput("Second operand?"));
                break;

            case "subtract":
                value = engine.subtract(value, display.getIoConsole().getDoubleInput("Second operand?"));
                break;

            case "multiply":
                value = engine.multiply(value, display.getIoConsole().getDoubleInput("Second operand?"));
                break;

            case "divide":
                value = engine.divide(value,  display.getIoConsole().getDoubleInput("Second operand?"));
                break;

            case "exp":
                value = engine.square(value, display.getIoConsole().getDoubleInput("To what power would you like to raise the current value?"));
                break;

            case "square": // what command do we use for normal exponentiation?
                value = engine.square(value, 2);
                break;

            case "sqRoot":
                value = engine.sqRoot(value);
                break;

            case "degToRad":
                value = engine.degToRad(value);
                break;

            case "radToDeg":
                value = engine.radToDeg(value);
                break;

            case "sine":
                if (unitsMode.equals("degrees")){
                    // if we have degrees we need to convert to radians first
                    double valueHolder = Math.toRadians(value);
                    value = engine.sine(valueHolder);
                    break;
                }
                value = engine.sine(value);
                break;

            case "cosine":
                if (unitsMode.equals("degrees")){
                    // if we have degrees we need to convert to radians first
                    double valueHolder = Math.toRadians(value);
                    value = engine.cosine(valueHolder);
                    break;
                }
                value = engine.cosine(value);
                break;

            case "tangent":
                if (unitsMode.equals("degrees")){
                    // if we have degrees we need to convert to radians first
                    double valueHolder = Math.toRadians(value);
                    value = engine.tangent(valueHolder);
                    break;
                }
                value = engine.tangent(value);
                break;

            case "arcsine":
                if (unitsMode.equals("degrees")){
                    // if we have degrees we need to convert to radians first
                    double valueHolder = Math.toRadians(value);
                    value = engine.aSine(valueHolder);
                    break;
                }
                value = engine.aSine(value);
                break;

            case "arccosine":
                if (unitsMode.equals("degrees")){
                    // if we have degrees we need to convert to radians first
                    double valueHolder = Math.toRadians(value);
                    value = engine.aCosine(valueHolder);
                    break;
                }
                value = engine.aCosine(value);
                break;

            case "arctangent":
                if (unitsMode.equals("degrees")){
                    // if we have degrees we need to convert to radians first
                    double valueHolder = Math.toRadians(value);
                    value = engine.aTangent(valueHolder);
                    break;
                }
                value = engine.aTangent(value);
                break;

            case "commonlog":
                value = engine.commonLog(value);
                break;

            case "inversecommonlog":
                value = engine.invCommonLog(value);
                break;

            case "naturallog":
                value = engine.ln(value);
                break;

            case "inversenaturallog":
                value = engine.invLn(value);
                break;

            case "factorial":
                value = engine.factorial(value);
                break;

            case "absolutevalue":
                value = engine.absolute(value);
                break;

            case "random":
                value = engine.randomNum();
                break;


            // Start functional commands - clear, close, memory, display mode, etc
            case "memoryadd":
                value += memory;
                memory = value;
                break;

            case "resetmemory":
                memory = 0.0;
                break;

            case "recallmemory":
                value = memory;
                break;

            case "toggleunits":
                switchUnitsMode();
                break;

            case "switchunits":
                switchUnitsMode(display.getIoConsole().getStringInput("Please enter desired units (either degrees or radians)"));
                break;

            case "toggledisplay":
                switchDisplayMode();
                break;

            case "switchdisplay":
                switchDisplayMode(display.getIoConsole().getStringInput("Please enter the desired display mode (decimal, binary, hexadecimal, or octal)"));
                break;


            case "help":
                Scanner input = null;
                try {
                    input = new Scanner(new File("./src/main/java/com/zipcodewilmington/scientificcalculator/commands.txt"));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }

                while (input.hasNextLine())
                {
                    display.getIoConsole().println(input.nextLine());
                }
                break;

            case "close":
                isOn = false;
                break;

            case "clear":
                value = 0.0;
                break;

            default:
                Console.println("You have entered an invalid command.");
                Console.println("For a list of commands, enter 'help'");
                break;


        }
    }



    //Here's where the magic happens
    public void calculate(){
        //prompt user for the command that they want, store it in a String
        String commandEntered = Console.getStringInput("Please enter a command.");
        //handle command

        //If there is an error present, don't allow further operation until it is cleared!
        if (errorPresent && !commandEntered.equals("clear")){
            // System.out.println(commandEntered + " was the command");
            display.getIoConsole().println("Invalid operation: Errors must be cleared before any other operation can take place.");
        }
        else { // if no error, proceed as normal
            handleCommands(commandEntered);
        }
        //update and print the display

        //if we have an error, we must display it and set errorPresent to true
        if (value.isNaN()|| value.isInfinite()){
            display.updateDisplay("Err");
            errorPresent = true;
        }
        else // if not, proceed as normal
            {

            errorPresent = false;
            display.updateDisplay(value.toString());
            switch (displayMode) {

                case "decimal":
                    display.updateDisplay(display.switchDisplayModeToDecimal());
                    break;

                case "binary":
                    display.updateDisplay(display.switchDisplayModeToBinary());
                    break;

                case "hexadecimal":
                    display.updateDisplay(display.switchDisplayModeToHexadecimal());
                    break;

                case "octal":
                    display.updateDisplay(display.switchDisplayModeToOctal());
                    break;

            }
        }
        display.printDisplayValue();


    }


}
