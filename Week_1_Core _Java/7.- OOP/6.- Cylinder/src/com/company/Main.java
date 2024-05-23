package com.company;


class Cylinder
{
    private int radius;
    private int height;

    //GETTERS
    public int getRadius()
    {
        return radius;
    }

    public int getHeight()
    {
        return  height;
    }

    //SETTERS
    public void setRadius(int r)
    {
        if(r>=0)
            radius = r;
        else
            radius = 0;
    }

    public void setHeight(int h)
    {
        if(h>=0)
            height = h;
        else
            height = 0;
    }

    //CONSTRUCTORS
    public Cylinder()
    {
        radius = height = 1;
    }

    public Cylinder(int r, int h)
    {
        radius = r;
        height = h;
    }


}

public class Main {

    public static void main(String[] args) {

    }
}
