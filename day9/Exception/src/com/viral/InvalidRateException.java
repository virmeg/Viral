package com.viral;

public class InvalidRateException extends Exception {
       public InvalidRateException()
        {
            super("Invalid Principal:Rate of interest should be in range 4 to 25");
        }

}
