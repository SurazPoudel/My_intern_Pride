
package studentchallenge4;

import java.util.Scanner;


public class StudentChallenge4 {

    
    public static void main(String[] args) {
    
          Scanner sc = new Scanner(System.in);
          
          System.out.println("Enter an option: [add, sub, mul, div]");
          System.out.println("Enter 2 numbers: ");
          int num1 = sc.nextInt();
          int num2 = sc.nextInt();
          sc.nextLine();
          System.out.println("Enter option in words");
          String option = sc.nextLine();
          
            
          switch(option)
          {
              case "add" : System.out.println(num1+num2);
                            break;
              case "sub" : System.out.println(num1-num2);
                            break;
              case "mul" : System.out.println(num1*num2);
                            break;
              case "div" : System.out.println(num1/num2);
                            break;
                            
              default:System.out.println("Enter a correct option!");
          }
              
        
    }
    
}
