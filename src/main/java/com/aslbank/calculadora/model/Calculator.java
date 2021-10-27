package com.aslbank.calculadora.model;

public class Calculator {

    private float a, b;

    public Calculator() {
        this.a=0;
        this.b=0;
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

    public float div() {return this.a/this.b;}

    public float x10() {return this.a*10;}

    public float sqrt() {return (float) Math.sqrt(this.a);}

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
