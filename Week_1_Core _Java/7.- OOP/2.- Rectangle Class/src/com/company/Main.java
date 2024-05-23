package com.company;


class Rectangle
{
    private double length;
    private double breadth;

    //Getters Methods
    public double getLength()
    {
        return length;
    }

    public double getBreadth()
    {
        return breadth;
    }

    //Setters Methods
    public void  setLength(double l)
    {
        if(l >= 0)
          length = l;
        else
           length = 0;
    }

    public void setBreadth(double b)
    {
        if(b >= 0)
            breadth = b;
        else
            breadth = 0;
    }

    //Methods
    public double area()
    {
        return length*breadth;
    }

    public double perimeter()
    {
        return 2*(length+breadth);
    }

    public boolean isSquare()
    {
       return length == breadth;
    }

}


public class Main {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        r1.setLength(-10.5);
        r1.setBreadth(5.5);

        System.out.println("Area: " + r1.area());
        System.out.println("Perimeter: " + r1.perimeter());
        System.out.println("Is it a square: " + r1.isSquare());
        System.out.println("Length : " + r1.getLength());
        System.out.println("Breadth :" + r1.getBreadth());

    }
}
