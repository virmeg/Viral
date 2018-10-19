package com.viral;

public class Exception {
    public static void main(String[] args) {
        try{
            int k=100/2;
            int data[]= new int[1];
            data[2]=k;
            //throw NullPointerException("Something is NULL");
            System.out.println("Answer" +k);
            }catch(ArithmeticException ex)
        {
            System.out.println(ex.getMessage());
                    } //all exception were have handled using catch block
            //so jvm allows execution of next statement
        System.out.println("End of Main");
    }
}
