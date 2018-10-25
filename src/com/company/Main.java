package com.company;

public class Main {

    public static String [] firstNames = {"Jackson","Kelly","Yan","Nelsom"};
    public static String [] familyNames = {"Thunder","Rain","River","Oak"};

    public static void main(String[]args){
        Student [] students = new Student[34];
        for (int i =0; i<34,i++)
        {
            students[i] = randomStudent();
        }
        Teacher teach = new Teacher("Folwell", "Nathan","Mr.","CSA");
        Classroom ourClass = new Classroom(students,teach);
        ourClass.printClass();
    }

}
