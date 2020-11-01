package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created 2/9/18.
 */
public class Console {

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static Integer getIntegerInput(String prompt) {
        return getDoubleInput(prompt).intValue();  //take the Double value, convert to an int, and return int
    }

    public static Double getDoubleInput(String prompt) {
        String userInput = getStringInput(prompt);
        return Double.parseDouble(userInput);  //read entered String as a Double and return Double
    }
}
