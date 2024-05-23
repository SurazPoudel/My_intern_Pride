package com.company;

public class Main {

    static int sum(int ...A)
    {
        int sum = 0;
        for(int i = 0; i<A.length; i++)
        {
            sum = sum + A[i];
        }
        return  sum;

    }

    static double sum(double ...Prices)
    {
        double sum = 0;
        for(int i = 0; i<Prices.length; i++)
        {
            sum+=Prices[i];
        }
        if(sum<500)return sum*0.10;
        else if(sum >= 500 && sum<1000)return sum*0.15;
        else return sum*0.20;

    }


    public static void main(String[] args) {

        System.out.println(sum(10,20,50));
        System.out.println(sum(10.5,45.5,300));
    }
}
