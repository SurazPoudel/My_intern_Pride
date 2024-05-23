package regularexpressions;


public class RegularExpressions {
    
    public static void main(String[] args) {
           
       /*String str1 = "8";
       System.out.println(str1.matches("\\D"));*/
       
       String str1 = "john@gmail.com";
       System.out.println(str1.matches("\\w*@gmail(.*)"));
                      
    }
    
}
