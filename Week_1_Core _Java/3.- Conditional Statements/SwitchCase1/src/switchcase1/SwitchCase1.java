package switchcase1;

import java.util.Scanner;


public class SwitchCase1 {

    
    public static void main(String[] args) {
     /*Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number from 1 - 7");
     int num = sc.nextInt();
     
     switch(num)
     {
         case 1: System.out.println("Monday");
                 break;
         case 2: System.out.println("Tuesday");
                 break;
         case 3: System.out.println("Wednsday");
                 break;
         case 4: System.out.println("Thursday");
                 break;
         case 5: System.out.println("Friday");
                 break;
         case 6: System.out.println("Saturday");
                 break;
         case 7: System.out.println("Sunday");
                 break;
         default: System.out.println("Enter a valid number.");
     }
     */
     
     /*Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number from 1 - 12");
     int month = sc.nextInt();
     
     switch(month)
     {
         case 1: System.out.println("January");
                 break;
         case 2: System.out.println("February");
                 break;
         case 3: System.out.println("March");
                 break;
         case 4: System.out.println("April");
                 break;
         case 5: System.out.println("May");
                 break;
         case 6: System.out.println("June");
                 break;
         case 7: System.out.println("July");
                 break;
         case 8: System.out.println("August");
                 break;
         case 9: System.out.println("September");
                 break;
         case 10: System.out.println("October");
                 break;
         case 11: System.out.println("November");
                 break;
         case 12: System.out.println("December");
                 break;
        
                       
         default: System.out.println("Enter a valid number.");
     }
     */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a URL");
        String url = sc.nextLine();
        String ext = url.substring(url.lastIndexOf(".")+1);
        
        switch(ext)
        {
            case "com": System.out.println("Comercial");
                break;
            case "org": System.out.println("Organization");
                break;
            case "net": System.out.println("Network");
                break;
            case "gov":System.out.println("Goverment");
                break;
            default:System.out.println("Not a valid extension");
                     
            
        }   
        
        
     
    }
    
}
