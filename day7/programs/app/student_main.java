package com.viral.app;

import com.viral.logic.Student;

public class student_main {
    public static void main(String[] args) {
        Student st1 = new Student(38,42,55);
        Student st2 = new Student(44,65,71);
        Student st3 = new Student(67,77,72);

        System.out.println("Result for Student 1: "+st1.checkResult());

        System.out.println("Result for Student 2: "+st2.checkResult());

        System.out.println("Result for Student 3: "+st3.checkResult());
        System.out.println("Reset the passing score to 40 ");
        Student.setPassingScore(40);
        System.out.println("Result for Student 1: "+st1.checkResult());

        System.out.println("Result for Student 2: "+st2.checkResult());

        System.out.println("Result for Student 3: "+st3.checkResult());

        System.out.println("Reset the passing score to 50 ");
        Student.setPassingScore(50);
        System.out.println("Result for Student 1: "+st1.checkResult());

        System.out.println("Result for Student 2: "+st2.checkResult());

        System.out.println("Result for Student 3: "+st3.checkResult());

    }
}