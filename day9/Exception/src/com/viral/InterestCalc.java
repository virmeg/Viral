package com.viral;

public class InterestCalc
{
   public void calc(double p, double r, int d) throws Exception{
        //validate p, r, validate
        //IF any of them is invalid
        //throw an exception
        if (p < 100 || p > 1000) {
            throw new InvalidPrincipalException();
        }
        if (r < 4 || r > 25) {
            throw new InvalidRateException();
        }
        if (d < 12 || d > 240) {
            throw new InvalidDurationException();
        }
        double i = p * r / 100 / 12 * d;
        System.out.println("Interest: " + (float)i);
    }
}