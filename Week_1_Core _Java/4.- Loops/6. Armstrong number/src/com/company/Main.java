package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;

        while (n > 0)
        {
            int r = n%10;
            sum = sum + r*r*r;
            n = n/10;
        }

        if(temp == sum)
        {
            System.out.println("its an Armstrong number");
        }
        else
        {
            System.out.println("its not an Armstrong number");
        }

    }
}
