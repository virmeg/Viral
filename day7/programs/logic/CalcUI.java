package com.viral.logic;

public class CalcUI {

    public static void main(String args[]) {
 //new will instruct JVM to build new object of type 'Calculator' class
        //then store its reference in variable c
        Calculator K = new Calculator();

        double k = K.doSum(12.2, 55.5);
       // Calculator d=c; //c and d referring same object
        System.out.println("Answer" + k);

    }

}