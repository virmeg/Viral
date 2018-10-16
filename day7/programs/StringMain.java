package com.viral;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class StringMain
{
    public static void main(String[] args) {
        String name1="viral";  //create new object, bcoz no previous object found
        String name2="viral" ;//reuse previos object
        String name3= new String("viral"); //forces new object
        System.out.println("Is name and name2 same"+ (name1==name2));
        System.out.println("Is name and name2 same"+ (name1==name3));
        name1=name1.toUpperCase();
        System.out.println("Is name and name2 same"+ (name1==name2));
        System.out.println(name2.toUpperCase());
        System.out.println(name2); //unmutable, everytime u try to modify the string it wll create a new one.
    }

}
