package com.viral.app;

import com.viral.logic.Calculator;
import com.viral.logic.Dog;

public class Main {

    public static void main(String args [])
    {
        Dog c= new Dog();
       //double k=c.doSum(12.2,55.5);
        //System.out.priln("Answer"+k);
System.out.println(c.getInfo());
        System.out.println(Integer.toHexString(55));
        System.out.println(Integer.toOctalString(55));
        System.out.println(Integer.toBinaryString(55));

    }
}

