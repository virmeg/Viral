package com.viral;

public abstract class Account {

    protected String accno;
    protected String custname;
    protected double balance;
    protected double amount;

    //constructor accepts arguments for balance and annual interest rate

    public void Account(double bal)
    {
        this.accno = Id;
        this.balance = balance;

    }

    public void deposit (double amt)
    {
        balance = balance + amount;
    }


    public void withdraw (double amt)
    {
        balance = balance - amount;
    }
}
