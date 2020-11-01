package com.zipcodewilmington.scientificcalculator;

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

    //setters/getters
    // we shouldn't need any for engine, display, or value, since they will all be passed to
    // other classes through this one.
    public Boolean getIsOn(){
        return isOn;
    }
    public void setIsOn(Boolean status){
        isOn = status;
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

                /* where's division?
                case "divide":
                value = engine.divide(value, (value, display.getIoConsole().getDoubleInput("Second operand?"));
                break;
                 */

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
                value = engine.sine(value);
                break;

            case "cosine":
                value = engine.cosine(value);
                break;

            case "tangent":
                value = engine.tangent(value);
                break;

            case "arcsine":
                value = engine.aSine(value);
                break;

            case "arccosine":
                value = engine.aCosine(value);
                break;

            case "arctangent":
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


            // Start functional commands - clear, close, memory, display mode, etc
            case "help":

                break;

            case "test":
                File directory = new File("./");

                display.getIoConsole().println(directory.getAbsolutePath());
                break;

            case "close":
                isOn = false;
                break;

            case "clear":
                value = 0.0;
                break;

            default:
                System.out.println("You have entered an invalid command.");
                break;


        }
    }



    //Here's where the magic happens
    public void calculate(){
        //prompt user for the command that they want, store it in a String
        String commandEntered = Console.getStringInput("Please enter a command.");
        //handle command
        handleCommands(commandEntered);

        //update the display
        //placeholder for now:
        Console.println(String.valueOf(value));

    }


}
