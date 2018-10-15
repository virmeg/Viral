package com.viral;

public class print_line {


    public static void main (String args [])

    {
    System.out.println("1st line in main");
    drawLine();

        System.out.println("2nd line in main");
drawLine(45);

    }
static void drawLine()
{
    for (int i=0;i<=100;i++)
    System.out.print("-");
}

static void drawLine(int width)
    {
        for (int i=0;i<width;i++)
            System.out.print("-");
    }


}

