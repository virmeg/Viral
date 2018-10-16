package com.viral.app;
import com.viral.app.Account;

public class ObjectDemo {
    public static void main(String[] args) {
        Account a1 = new Account();
        Account a2 = new Account();
        Account a3 = a1;

        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
        System.out.println(a3.hashCode());
// a1 and a2 have different hascode and a1 and a3 have same hashcode

       }

}