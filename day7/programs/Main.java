package com.viral;
import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
Scanner scanner=new Scanner(System.in);
        System.out.println("Emter name ");
        String name = scanner.nextLine();
        System.out.println("Emter age ");
        int age = scanner.nextInt();
        System.out.println("Hello "+name +" you are " +age);
    }
}
