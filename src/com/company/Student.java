package com.company;

public class Student extends Person {

    ///fields///
    private double gpa;
    private String year;
    private int classes;

    ///constructors///
    public Student (double gpa, String year, int classes)
    {
        //super
        this.gpa = gpa;
        this.year= year;
        this.classes = classes;
    }

    ///methods///
    public double getgpa()
    {
        return gpa;
    }
    public String getYear()
    {
        return year;
    }
    public int classes()
    {
        return classes;
    }
    public String toString()
    {
        return getfamilyName()+","+getFirstName();
    }

}
