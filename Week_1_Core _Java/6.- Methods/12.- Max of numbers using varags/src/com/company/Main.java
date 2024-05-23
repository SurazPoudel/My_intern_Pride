package com.company;

public class Main {

    static int max (int ...A)
    {
        if(A.length == 0)return  Integer.MIN_VALUE;

        int max = A[0];

        for(int i = 0; i<A.length; i++)
        {
            if(A[i] > max)
            {
               max = A[i];
            }
        }

        return  max;
    }


    public static void main(String[] args) {


        System.out.println(max(10, 20 , 40));
        System.out.println(max(45, 80, 65));

    }
}
