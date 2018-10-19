package com.viral;
//this is an interface for storage
public interface storage { //abstract method
   public default void read()
    {
        System.out.println("reading data");
    }

    public default void write()
    {
        System.out.println("writing data");
    }

}
