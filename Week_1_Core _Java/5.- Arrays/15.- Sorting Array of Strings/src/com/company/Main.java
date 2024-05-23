package com.company;

public class Main {

    public static void main(String[] args) {
	
        String arr[] = {"java","python","c++","c","rust","go"};
        java.util.Arrays.sort(arr);

        for(String x:arr)
        {
            System.out.println(x);
        }
        
    }
}
