package com.aslbank.calculadora.model;

public class Calculator {

    public Calculator() {
    }

    public static float add(float a, float b) {return a+b;}

    public static float substract(float a, float b)
    {
        return a-b;
    }

    public static float multiply(float a, float b)
    {
        return a*b;
    }

    public static float div(float a, float b) {return a/b;}

    public static float pow10(float a) {return (float) Math.pow(a,10);}

    public static double sqrt(double x) {return Math.sqrt(x);}

    public static double Nfactorial(double x) {

        long factorial = 1;
        for(double i=1; i<=x; i++){

            factorial *= i;

        }
        return factorial;
    }

    public static double log10(double x) {

        return Math.log10(x);
    }


}
