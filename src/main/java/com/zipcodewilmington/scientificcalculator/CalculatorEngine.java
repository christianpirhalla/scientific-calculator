package com.zipcodewilmington.scientificcalculator;
import static java.lang.Math.*;

public class CalculatorEngine {

    private double x;
    private double y;

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

    public static double divide(double x, double y) {
        return x / y;
    }

    //Exponentiation and square root
    public static double square(double x, double y) {
        return pow(x , y);
    }

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

    public static double sine(double radians) {
        return sin(radians);
    }

    public static double cosine(double radians) {
        return cos(radians);
    }

    public static double tangent(double radians) {
        return tan(radians);
    }

    public static double aSine(double radians) {
        return asin(radians);
    }

    public static double aCosine(double radians) {
        return acos(radians);
    }

    public static double aTangent(double radians) {
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

    //Invert and inverse

    public double invertSign(double x) {
        return x = -x;
    }

    public double inverse(double x) {
        return x = 1/x;
    }

}
