package com.viral;

public interface Flyable
{
int speed=100; //public, final and static
 //default methods introduced in java 8
default void play()
{
    System.out.println("Default fly");
} //abstract and public method

   //Interface can have static menthod

    public static void navigate()
    {
        System.out.println("static navigation");
    }

}
