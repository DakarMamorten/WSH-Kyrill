package com.k05_01_2020;//********************************************************************
//  com.k05_01_2020.Student.java       Author: Lewis/Loftus
//
//  Represents a college student.
//********************************************************************

public class Student {
    private final String firstName;
    private final String lastName;
    private final Address homeAddress;
    private final Address schoolAddress;
    private final int scoreForFirstTest;
    private final int scoreForSecondTest;
    private final int scoreForThirdTest;

    //-----------------------------------------------------------------
    //  Constructor: Sets up this student with the specified values.
    //-----------------------------------------------------------------
    public Student(String first, String last, Address home,
                   Address school, int scoreForFirstTest,int scoreForSecondTest,int scoreForThirdTest) {
        firstName = first;
        lastName = last;
        homeAddress = home;
        schoolAddress = school;
        this.scoreForFirstTest = scoreForFirstTest;
        this.scoreForSecondTest = scoreForSecondTest;
        this.scoreForThirdTest = scoreForThirdTest;
    }

    //-----------------------------------------------------------------
    //  Returns a string description of this com.k05_01_2020.Student object.
    //-----------------------------------------------------------------
    public String toString() {
        String result;

        result = firstName + " " + lastName + "\n";
        result += "Home Address:\n" + homeAddress + "\n";
        result += "School Address:\n" + schoolAddress;
        result += "score for first test:\n" + scoreForFirstTest;
        result += "score for second test:\n" + scoreForSecondTest;
        result += "score for third test:\n" + scoreForThirdTest;
        return result;
    }

}
