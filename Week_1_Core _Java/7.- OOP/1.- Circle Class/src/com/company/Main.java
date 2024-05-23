package com.company;

class Circle
{
    public double radius;

    public double area()
    {
        return Math.PI*radius*radius;
    }

    public double perimeter()
    {
        return 2*Math.PI*radius;
    }

    public double circunference()
    {
        return perimeter();
    }
}


public class Main {

    public static void main(String[] args) {

        Circle c1 = new Circle();
        c1.radius = 7;

        System.out.println("Area: " + c1.area());
        System.out.println("Perimeter: " + c1.perimeter());
        System.out.println("Circumference: " + c1.perimeter());



        Circle c2 = new Circle();
        c2.radius = 12;

        System.out.println("Area2: " + c2.area());
        System.out.println("Perimeter2: " + c2.perimeter());
        System.out.println("Circumference2: " + c2.perimeter());






    }
}
