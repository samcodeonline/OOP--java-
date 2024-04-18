package com.sam.polymorphism;

public class SumNumbers {

    int sum (int a , int b){
        return a + b;
    }
    int sum (int a , int b , int c){
        return a + b + c;
    }

    int sum(int i, int i1, int i2, int i3, int i4) {
        return i + i1 + i2 + i3 + i4;
    }


    public static void main(String[] args) {
        SumNumbers sumthem = new SumNumbers();

        sumthem.sum(32,33);
        sumthem.sum(33,2,0);
//        sumthem.sum(3,5,6,7,8);
        System.out.println(sumthem.sum(3,4,5,6,9));


    }
}
