package com.company;

public class Main {

    static int max(int A[])
    {
        int max = 0;
        for(int i = 0; i< A.length; i++)
        {
            if(A[i] > max)
            {
                max = A[i];
            }
        }

        return max;
    }


    public static void main(String[] args) {

        int A[] = {888,3,15,99,177};
        System.out.println(max(A));

    }
}
