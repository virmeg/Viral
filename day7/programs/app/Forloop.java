package com.viral.app;

public class Forloop {

    public static void main(String[] args) {
        int nums[]={10,20,30,40,50};

        for (int i=0;i<nums.length; i++)
        {
            System.out.println("Num:"+ nums[i]);
        }
        System.out.println("Enhanced for / for Each");
        //Get one value of type INT from array "nums"
        //Loop terminates after last element
        for (int x : nums)
        {
            System.out.println("Num:" + x);
        }
    }



}
