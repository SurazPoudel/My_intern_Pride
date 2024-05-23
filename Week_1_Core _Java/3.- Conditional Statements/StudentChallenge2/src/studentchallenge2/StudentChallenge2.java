package studentchallenge2;

import java.util.Scanner;


public class StudentChallenge2 {

    
    public static void main(String[] args) {
     
        Scanner scan = new Scanner(System.in);
        /*String num;
        System.out.println("Enter a Number: ");
        num = scan.nextLine();
        
        if(num.matches("[01]+"))
        {
            System.out.println("Binary Radix = 2");
        }
        else if(num.matches("[0-7]+"))
        {
            System.out.println("Octal Radix = 8");
        }
          else if(num.matches("[0-9]+"))
        {
            System.out.println("Decimal Radix = 10");
        }
           else if(num.matches("[0-9A-F]+"))
        {
            System.out.println("Hexa Radix = 16");
        }
        else
        {
            System.out.println("It's not a number");
        }
        */
        
        int year;
        System.out.println("Enter a year: ");
        year = scan.nextInt();
        
        if(year % 4 == 0)
        {
            if(year % 100 == 0)
            {
                if(year % 400 == 0)
                {
                System.out.println("It's a leap year");
                }
                else
                {
                    System.out.println("Not a leap year");
                }
            }
            else
            {
                System.out.println("It's a leap year");
            }
        }
        else
        {
            System.out.println("Not a leap year");
        }
        
                
    }
    
}
