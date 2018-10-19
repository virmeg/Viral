package com.viral;

import java.sql.SQLOutput;

public class InterestCalc
{
protected int Principal=100;
protected float rate=10;
protected int duration=12;

public InterestCalc(int Principal, float rate, int duration)
{
    this.Principal=Principal;
    this.rate=rate;
    this.duration=duration;
}

public void calculator()
        {
            double interest=(Principal*rate*duration/100)/12;
            System.out.println("Simple Interest= "+interest);
        }
}
