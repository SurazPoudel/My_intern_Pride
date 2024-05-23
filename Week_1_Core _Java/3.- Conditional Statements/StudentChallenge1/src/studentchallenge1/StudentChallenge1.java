package studentchallenge1;

import java.util.Scanner;

/*
Find a number is odd or even
Find person is young or not young
Find grades for given marks
*/
public class StudentChallenge1 {

    
    public static void main(String[] args) {
        
        /*System.out.println("Enter a number: ");
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        if(n % 2 == 0)
        {
            System.out.println("Even number");
        }
        else
        {
            System.out.println("Odd number");
        }
        */
        
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int n = sc.nextInt();
        
        if(n >= 14 && n <= 55)
        {
            System.out.println("Person is young");
        }
        else
        {
            System.out.println("Person is not young");
        }
        */
        
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter three grades: ");
        int n1 = scr.nextInt();
        int n2 = scr.nextInt();
        int n3 = scr.nextInt();
        
        float avg = (float)(n1+n2+n3)/3;
        
        if(avg >= 70)
        {
            System.out.println("A");
        }
        else if(avg >= 60 && avg <70)
        {
            System.out.println("B");
        }
        else if(avg >= 50 && avg < 60)
        {
            System.out.println("C");
        }
        else if(avg >= 40 && avg < 50)
        {
            System.out.println("D");
        }
        else
        {
            System.out.println("F");
        }
       
        
    }
    
}
