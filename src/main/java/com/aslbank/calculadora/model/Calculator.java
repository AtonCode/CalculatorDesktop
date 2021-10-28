package com.aslbank.calculadora.model;

public class Calculator {

    private float a, b;
    private String messageError;

    public Calculator() {
        this.a=0;
        this.b=0;
    }

    public String getMessageError() {
        return messageError;
    }

    public void setMessageError(String messageError) {
        this.messageError = messageError;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float add() {return this.a+this.b;}

    public float substract()
    {
        return this.a-this.b;
    }

    public float multiply()
    {
        return this.a*this.b;
    }

    public float div() {
        float result = 0;
        if(this.b != 0){
            result = this.a/this.b;
        }else{

            this.messageError = "No se Puede Dividir por Cero";
        }
        return result;
    }

    public float x10() {return this.a*10;}

    public float sqrt() {
        float result = 0;
        if(this.a != -1){
            result = (float) Math.sqrt(this.a);
        }else{
            this.messageError = "No se Puede Numeros Negativos";
        }
        return result;

    }

    public float Nfactorial() {

        long factorial = 1;
        for(float i=1; i<=this.a; i++){

            factorial *= i;

        }
        return factorial;
    }

    public float log10() {
        return (float) Math.log10(this.a);
    }

    public float mod(){
        return this.a%this.b;
    }

}
