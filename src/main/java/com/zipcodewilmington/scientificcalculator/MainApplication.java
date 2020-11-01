package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */

public class MainApplication {
    public static void main(String[] args) {


        Console.println("Welcome to my calculator!");
        /* these seem to just be tests/examples; should we just get rid of them?
        String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d);

         */
        Calculator calc = new Calculator();
        // as long as the calculator is on..
        while (calc.getIsOn()){
            //... calculate
            calc.calculate();

        }

    }
}
