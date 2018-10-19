package com.viral;

public class InvalidDurationException extends Exception

{
public InvalidDurationException()
    {
    super("Invalid Principal:duration should be more than 12 and less than 240");
}
}

