package com.viral;

public class Main {

    public static void main(String[] args) {
	// write your code here
        byte   bytevar= 11;
        //example of widening/Implicit conversion
        int Intvar=bytevar;


        float floatvar=12.0F;

        long longvar=Intvar;
        floatvar=longvar;

        double doublevar=floatvar;
        char charVar='\u0041';
        Intvar=charVar;

        int n=22/7;
        System.out.println("n="+n);

        System.out.println("Char in     INT"+Intvar);//Error:(10, 17) java: incompatible types: possible lossy conversion from int to byte
        float f= (float) 22/7;
        System.out.println("f="+f);

        double d=  22/7.0;
        System.out.println("d="+d);
        com.viral.print_line.drawLine();
      }
}
