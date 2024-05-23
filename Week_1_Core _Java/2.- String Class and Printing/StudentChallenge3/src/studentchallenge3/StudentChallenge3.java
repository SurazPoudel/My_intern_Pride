package studentchallenge3;


public class StudentChallenge3 {

    /*
    Remove special characters from a string
    Remove extra spaces from string
    Find number of words in a string
    
    */
    
    
    public static void main(String[] args) {
        String str = "a!B@c#1$2%3";
        String newStr = str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(newStr);
        
        
        String str2 = "    abc  de  fgh  ijk   ";
        String newStr2 = str2.replaceAll("[\\s+]", " ").trim();
        System.out.println(newStr2);
        
        String str3 = "    abc  de  fgh  ijk   ";
        str3 = str3.replaceAll("\\s+"," ").trim();
        String words[] = str3.split("\\s");
        System.out.println(words.length);
        
    }
    
}
