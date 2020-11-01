package com.zipcodewilmington.scientificcalculator;

import static java.lang.Math.*;

public class CalculatorEngine {

    private double x;
    private double y;

    public CalculatorEngine() {

    };

    public static void main(String[] args) {
    }

    //Arithmetic
    public static double add(double x, double y) {
        return (x + y);
    }

    public static double subtract(double x, double y) {
        return (x - y);
    }

    public static double multiply(double x, double y) {
        return (x * y);
    }

    //Exponentiation and square root
    public static double square(double x, double y) {
        return pow(x , y);
    }//Handles both square (supply y = 2 default) and variable exponentiation.

    public static double sqRoot(double x) {
        return sqrt(x);
    }

    //degree/radian conversion methods for toggle functionality.
    public static double degToRad(double angRad) {
        return toRadians(angRad);
    }

    public static double radToDeg(double angRad) {
        return toDegrees(angRad);
    }


    //Trigonometry: all methods take x as an angle in radians.
    //Because of angle/radian toggle feature will have to convert angles back to radians.

    public static double sine(double radians) {
        double rad = degToRad(radians);
    //Write if in radian mode, carry on; else if in degree mode, use variable deg.
        return sin(radians);
    }

    public static double cosine(double radians) {
        double deg = radToDeg(radians);
        //Write if in radian mode, carry on; else if in degree mode, use variable deg.
        return cos(radians);
    }

    public static double tangent(double radians) {
        double deg = radToDeg(radians);
        //Write if in radian mode, carry on; else if in degree mode, use variable deg.
        return tan(radians);
    }

    public static double aSine(double radians) {
        double deg = radToDeg(radians);
        //Write if in radian mode, carry on; else if in degree mode, use variable deg.
        return asin(radians);
    }

    public static double aCosine(double radians) {
        double deg = radToDeg(radians);
        //Write if in radian mode, carry on; else if in degree mode, use variable deg.
        return acos(radians);
    }

    public static double aTangent(double radians) {
        double deg = radToDeg(radians);
        //Write if in radian mode, carry on; else if in degree mode, use variable deg.
        return atan(radians);
    }

    //Logarithmic methods: returns rounded values as per double
    //Common log base = 10
    public static double commonLog(double x) {
        return log10(x);
    }

    //Inverse common log
    public static double invCommonLog(double x) {
        return pow(10, x);
    }

    //Ln (logBaseE)
    public static double ln(double x) {
        return log(x);
    }

    //Inverse natural log (base e)
    public static double invLn(double x) {
        return Math.exp(x);
    }

    //Factorial

    public static double factorial(double x) {

        double product = 1;

        for(int i = 1; i <= x; i++){
            product = product * i;
        }
        return product;

    }

    //Write invert and inverse

}
