package com.aslbank.calculadora.model;

import java.text.DecimalFormat;

public class Calculator {

    private double a, b;
    private String messageError;
    private DecimalFormat df ;


    public Calculator() {
        this.a=0;
        this.b=0;
        this.messageError = "";
        this.df = new DecimalFormat("#.00000");
    }

    public String getMessageError() {
        return messageError;
    }

    public void setMessageError(String messageError) {
        this.messageError = messageError;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {this.a = a;}

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }


    public static double formatearDecimales(Double numero, Integer numeroDecimales) {
        return (Math.round(numero * Math.pow(10, numeroDecimales)) / Math.pow(10, numeroDecimales));
    }

    public double add() {return this.a+this.b;}

    public double substract()
    {
        return this.a-this.b;
    }

    public double multiply()
    {
        return this.a*this.b;
    }

    public double div() {
        double result = 0;
        if(this.b != 0){
            result = Double.parseDouble(df.format(this.a/this.b));
        }else{

            this.messageError = "No se Puede Dividir por Cero";
        }
        return result;
    }

    public double x10() {

        double result = 0;
        if(this.a > 0){
            result = formatearDecimales(Math.pow(10,this.a),5);
        }else{
            this.messageError = "No se Pueden Numeros Negativos ni Cero";
        }
        return result;
    }

    public double sqrt() {
        double result = 0;
        if(this.a > 0){
            result = formatearDecimales(Math.sqrt(this.a),5);
        }else{
            this.messageError = "No se Pueden Numeros Negativos";
        }
        return result;

    }

    public double Nfactorial() {

        double result = 0;
        double aFloor = Math.floor(this.a);
        if(aFloor > 0){
            long factorial = 1;
            for(double i=1; i<=aFloor; i++){
                factorial *= i;
            }
            result = factorial;
        }else{
            this.messageError = "No se Pueden Numeros Negativos";
        }
        return result;
    }

    public double log10() {

        double result = 0;
        if(this.a > 0){
            result = Double.parseDouble(df.format(Math.log10(this.a)));
                    //formatearDecimales(Math.log10(this.a),5);
        }else{
            this.messageError = "No se Pueden Numeros Negativos";
        }
        return result;
    }

    public double mod(){
        return this.a%this.b;
    }



}
