package com.viral;

public class Main {
    public static void main(String[] args) {
        try{
            int k=100/2;
            int data[]= new int[1];
            data[2]=k;
            System.out.println("Answer" +k);
        }catch(ArithmeticException ex)//Arithmetic exception handles only arithmetic exception and
        // Runtime exception managing all exceotions due to polymorphism
        {
            System.out.println(ex.getMessage());
        } //all exception were have handled using catch block
        //so jvm allows execution of next statement
        finally {
            System.out.println("End of Main");
       }

    }
}
