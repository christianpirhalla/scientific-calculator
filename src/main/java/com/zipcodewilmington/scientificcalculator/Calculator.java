package com.zipcodewilmington.scientificcalculator;

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


    //Here's where the magic happens
    public void calculate(){
        //prompt user for the command that they want, store it in a String
        String commandEntered = Console.getStringInput("Please enter a command.");
        //switch statement determines which method of engine they are going to call
        switch (commandEntered){
            //if a second operand is required, prompt the user
            //set value to the return of the method called
            /** List of commands present in Calculator Engine to be accounted for
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
            case "add":
                value = engine.add(value, display.getIoConsole().getDoubleInput("Second operand?"));
                break;

            case "close":
                isOn = false;
                break;

            default:
                break;


        }

        //update the display

    }


}
