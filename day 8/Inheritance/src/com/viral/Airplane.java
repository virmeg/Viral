package com.viral;

public class Airplane implements Flyable {


    public void play1() //if play is overridden it will use class ka method or else it wll use Interface one as it default
        {
        System.out.println("airplane file");
    }

    public static void main(String[] args)
    {
        Airplane a=new Airplane();
        a.play();
        Flyable.navigate(); //all static methods need to be called by Interface method name
    }
}


