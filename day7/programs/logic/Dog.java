package com.viral.logic;

public class Dog {
private String breed;
    private String size;
    private int age;

//No-arg contructor [Uses same name as classname[

    public Dog()
    {
        breed="indian";
        size="small";
        age=1;
    }
 //Parameterized constructor

    public Dog(String breed, String size, int age)
    {
        //user this to distinguish instance variable from local variables;
        this.breed=breed;
        this.size=size;
        this.age=age;
    }

    public String getInfo()
    {
        return "Breed: " +breed+ "size: " +size +"age" +age;
    }
}


