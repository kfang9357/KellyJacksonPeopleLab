package com.company;

public class Teacher
{
    //fields
    private String subject;
    private String title;
    private String familyName;
    //constructors
    public Teacher(String subject, String title, String familyName)
    {
        this.subject = subject;
        this.title = title;
        this.familyName = familyName;
    }
    //getters and setters
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
