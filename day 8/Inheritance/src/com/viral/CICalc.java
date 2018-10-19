package com.viral;

public class CICalc extends com.viral.InterestCalc {

    //constructor chaining....
    public CICalc(int Principal,float rate,int duration)
    {
        //call to super() must be first statement;
        super(Principal,rate,duration);
    }

    public double ci()
    {
        //int p=super.Principal;
        //float r=super.rate;
        //int d=super.duration;
        double ci=Principal *(Math.pow((1 + rate / 100), duration));
        System.out.println("compound Interest= "+ci);
        return (ci);
        }

}
