package com.example.w24st1220699assign1;

public class Name {
    private String name;
    private String lastName;
    private int studentNumber;

    // Creating the constuctor for my Name class
    public Name (String name, String lastName, int studentNumber)
    {
        this.name = name;
        this.lastName = lastName;
        this.studentNumber = studentNumber;
    }

    // Defining the getters for my fields
    public String getName ()
    {
        return name;
    }
    public String getLastName ()
    {
        return lastName;
    }
    public int getStudentNumber ()
    {
        return studentNumber;
    }

    // Defining the setters for my fields
    public void setName (String newName)
    {
        this.name = newName;
    }

    public void setLastName (String newLastName)
    {
        this.lastName = newLastName;
    }

    public void setStudentNumber (int newStudentNumber)
    {
        this.studentNumber = newStudentNumber;
    }

}
