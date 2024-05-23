package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int reverse = 0;
        int r;
        int temp = n;

        while (n > 0)
        {
            r = n%10;
            reverse = reverse*10+r;
            n = n/10;

        }

        if(reverse == temp)
        {
            System.out.println("its palindrome");
        }
        else
        {
            System.out.println("its not palindrome");
        }

    }
}
