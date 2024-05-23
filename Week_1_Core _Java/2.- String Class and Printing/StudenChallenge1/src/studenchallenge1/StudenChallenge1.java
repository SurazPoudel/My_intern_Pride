/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studenchallenge1;

public class StudenChallenge1 {

    /*Find if the email id is on gmail
      Find username and domain name form email
    */
    public static void main(String[] args) {
        String str = "programmer@gmail.com";
        int i = str.indexOf("@");
        String uname = str.substring(0, i);
        String domain = str.substring(i+1, str.length());
        
        System.out.println("Username :" + uname);
        System.out.println("Domain :" + domain);
        
        int j = domain.indexOf(".");
        String name = domain.substring(0,j);
        System.out.println(name.equals("gmail"));
        
    }
    
}
