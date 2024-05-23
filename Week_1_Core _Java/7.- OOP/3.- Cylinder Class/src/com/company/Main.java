package com.company;

class Cylinder
{
    public double radius;
    public double height;

    public double lidArea()
    {
        return Math.PI*radius*radius;
    }

    public double totalSurfaceArea()
    {
        return 2*lidArea()+circumference()*height;
    }

    public double volume()
    {
        return lidArea()*height;
    }

    public double circumference()
    {
        return 2*Math.PI*radius;
    }

}



public class Main {

    public static void main(String[] args) {

        Cylinder c1 = new Cylinder();
        c1.height = 7;
        c1.radius = 10;

        System.out.println("Area: " + c1.lidArea());
        System.out.println("Total Surface Area: " + c1.totalSurfaceArea());
        System.out.println("Volume: " + c1.volume());
        System.out.println("Circumference: " + c1.circumference());

    }
}
