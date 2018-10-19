package com.company;

public class Person {

    ///fields///
    private String firstName;
    private String familyName;

    ///constructors///
    public Person(String firstName, String familyName)
    {
        super("Person");
        this.firstName = firstName;
        this.familyName = familyName;
    }

    ///method///

    public String getFirstName()
    {
        return firstName;
    }
    public String getfamilyName()
    {
        return familyName;
    }
    public boolean equals(Person p)
    {
        
    }


}
