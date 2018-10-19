package com.viral;

public class InvalidPrincipalException extends Exception {
public InvalidPrincipalException()
{
    super("Invalid Principal Amount:Principal amount should be in range 100 to 1000");

}

}
