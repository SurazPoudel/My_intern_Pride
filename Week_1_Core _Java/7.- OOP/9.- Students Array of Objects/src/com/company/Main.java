package com.company;

import javax.security.auth.Subject;

class Student
{
    private String rollNo;
    private String name;
    private String dept;
    private String subjects[];

    //Constructor
    public Student(String rollNo, String name, String dept, String[] subjects)
    {
        this.rollNo = rollNo;
        this.name =name;
        this.dept = dept;
        this.subjects = subjects;
    }


    //Getters
    public String getRollNo()
    {
        return rollNo;
    }

    public String name()
    {
        return name;
    }

    public String getDept()
    {
        return dept;
    }

    public String [] getSubjects()
    {
        return subjects;
    }

    //Setters
    public void setSubjects(String sub)
    {

    }




}


public class Main {

    public static void main(String[] args) {

    }
}
