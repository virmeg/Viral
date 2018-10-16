package com.viral.app;

public class Switch {

    public static void main(String[] args) {
        int numOfAngles=3;

        switch (numOfAngles)
        {
            case 3:
                System.out.println("triangle");
                    break;
            case 4:
                    System.out.println("rectangle");
                    break;
            case 5:
                    System.out.println("pentagon");
                    break;
            default:
                System.out.println("Unknown Shape");
        }

    }

}
