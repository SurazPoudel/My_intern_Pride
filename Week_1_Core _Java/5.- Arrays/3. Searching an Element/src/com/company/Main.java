package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a number from list: 3,9,7,8,12,6,15,5,4,10");
        int key = sc.nextInt();

        int A[] = {3,9,7,8,12,6,15,5,4,10};

        for(int i = 0; i< A.length; i++)
        {
            if(A[i] == key)
            {
                System.out.println("Found");
                System.exit(0);
            }

        }
        System.out.println("Not Found");
    }
}
