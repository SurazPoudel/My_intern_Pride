package studentchallenge3;

import java.util.Scanner;


public class StudentChallenge3 {

    
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: [1-7]");
        int num = sc.nextInt();
        
        if(num == 1)
        {
            System.out.println("Monday");
        }
        else if(num == 2)
        {
            System.out.println("Tuesday");
        }
        else if(num == 3)
        {
            System.out.println("Wednsday");
        }
        else if(num == 4)
        {
            System.out.println("Thursday");
        }
        else if(num == 5)
        {
            System.out.println("Friday");
        }
        else if(num == 6)
        {
            System.out.println("Saturday");
        }
        else if(num == 7)
        {
            System.out.println("Sunday");
        }
        else
        {
            System.out.println("Enter a number from 1 to 7");
        }
        */
       
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a URL");
       String url = sc.nextLine();
       String protocol = url.substring(0, url.indexOf(":"));
       
       if(protocol.equals("http"))
       {
           System.out.println("Hypertext Transfer Protocol");
       }
       else if(protocol.equals("ftp"))
       {
           System.out.println("File Transfer Protocol");
       }
       
       String ext = url.substring(url.lastIndexOf(".")+1);
       if(ext.equals("com"))
       {
           System.out.println("Commercial");
       }
       else if(ext.equals("org"))
       {
           System.out.println("Oraganization");
       }
       else if(ext.equals("net"))
       {
           System.out.println("Network");
       }
        
    }
    
}
