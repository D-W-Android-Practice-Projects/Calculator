package com.developerswork.calculator;

public class ArthimeticOperations {
    ArthimeticOperations(){}

    public long add(long a,long b){
        return a+b;
    }

    public long subtract(long a,long b){
        return a-b;
    }

    public long multiply(long a,long b){
        return a*b;
    }

    public double divide(long a,long b){
        return a/(b*1.0);
    }

    public double modulo(long a,long b){
        return a%(b*1.0);
    }

    public long power(long a,long b){
        long result = 1;
        for(int i=0;i<b;i++)
            result *= a;
        return result;
    }

    public double add(double a,double b){
        return a+b;
    }

    public double subtract(double a,double b){
        return a-b;
    }

    public double multiply(double a,double b){
        return a*b;
    }

    public double divide(double a,double b){
        return a/(b*1.0);
    }

    public double modulo(double a,double b){
        return a%(b*1.0);
    }

    public double power(double a,double b){
        return Math.pow(a,b);
    }
}
