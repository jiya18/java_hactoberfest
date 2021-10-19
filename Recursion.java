package com.company;

public class Recursion {

    public static void main(String[] args) {

        System.out.println(calcSum(5));
    }

    public static int calcSum(int n){

        int sum;
        if(n==1){
            return 1;
        }else
            return n + calcSum(n - 1) ;

    }
}
