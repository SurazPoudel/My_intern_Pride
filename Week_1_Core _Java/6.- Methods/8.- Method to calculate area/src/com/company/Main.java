package com.company;

import java.util.Scanner;

public class Main {

    static double area(double l, double b)
    {
        double area = l*b;
        return  area;
    }

    static  double area(double radius)
    {
        return Math.PI*radius*radius;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length: ");
        double length = sc.nextDouble();
        System.out.println("Enter breadth: ");
        double breadth = sc.nextDouble();

        System.out.println(area(length,breadth));


    }
}
