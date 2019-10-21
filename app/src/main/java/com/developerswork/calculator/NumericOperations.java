package com.developerswork.calculator;

public class NumericOperations {
    NumericOperations(){}

    public boolean isPrime(long a){
        for(int i=2;i<a;i++){
            if(a%i == 0)
                return false;
        }
        return true;
    }

    public boolean isEven(long a){
        if(a % 2 == 0)
            return true;
        return false;
    }

    public boolean isAmstrong(long a){
        int digits = 0;
        long temp = a;
        while(temp > 0){
            digits += 1;
            temp /= 10;
        }
        temp = a;
        long num = 0;
        while (temp > 0){
            num += Math.pow(temp%10,digits);
            temp /= 10;
        }
         return num == a;
    }
}
