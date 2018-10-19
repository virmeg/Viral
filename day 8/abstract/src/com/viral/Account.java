package com.viral;

public abstract class Account {
protected int accountno;
protected String acccountHolder;
protected double balance;

   Account (int accountno, String acccountHolder, double balance)
    {
        this.accountno = accountno;
        this.acccountHolder=acccountHolder;
        this.balance=balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getAcccountHolder() {
        return acccountHolder;
    }

    public int getAccountno() {
        return accountno;
    }
}
