/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studenchallenge2;

public class StudenChallenge2 {

    /*
    Find if a  number is Binary or not
    Find is a number is Hexadecimal or not
    Find is the data is Date format (dd/mm/yyyy)
    */
    
    
    public static void main(String[] args) {
        
        int b = 1010001;
        String str = String.valueOf(b);
        String str1 = "234AB";
        System.out.println(str.matches("[01]*"));
        System.out.println(str1.matches("[0-9A-F]+"));
         
        String date = "01/12/2000";
        System.out.println(date.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));
                
    }
    
}
