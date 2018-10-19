package com.viral;
//this is an interface for display
public interface display //abstract method
{

    public default void show()
    {
        System.out.println("showing data");
    }
}
