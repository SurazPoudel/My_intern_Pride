package com.company;

class Student
{
    public int roll;
    public String name;
    public String course;
    public int m1, m2, m3;

    public int total()
    {
        return m1+m2+m3;
    }

    public float average()
    {
        return (float)total()/3;
    }

    public String grade()
    {
      if(average() > 70)
      {
          return "A";
      }
      else if(average() > 60 && average()<69)
      {
          return "B";
      }
      else if(average() > 50 && average()<59)
      {
          return "C";
      }
      else if(average() > 40 && average()<49)
      {
          return "D";
      }
      else
      {
          return "F";
      }

    }

    public String details()
    {
        return "Roll No:" + roll + "\n" + "Name: " + name + "\n" +
                "Course: " + course + "\n";
    }

}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.roll = 4432;
        s1.name = "Luis";
        s1.course = "Calculus";
        s1.m1 = 54;
        s1.m2 = 50;
        s1.m3 = 55;

        System.out.println(s1.details());
        System.out.println("Total: " + s1.total());
        System.out.println("Average: " + s1.average());
        System.out.println("Grade: " + s1.grade());

    }
}
