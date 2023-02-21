
/**
 * This class will find if a user entered String has a vowel.
 */
import java.util.Scanner;
public class StringVowels
{
    
    public static void main(String[] args){
     
    
    Scanner keys= new Scanner(System.in);
    System.out.println("Enter any string to check if it has a vowel in it and at which indices and how many in all");
    String s=keys.next();
    
while(!s.equalsIgnoreCase("1")){
    boolean vowel = false;
    int j=0;
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
            System.out.println("The string has a vowel at index "+ i);
            j++;
            vowel=true;
        }
    }
    
    System.out.println("The string you entered has "+j+" vowels in it");
    System.out.println("Enter any string to check if it has a vowel in it and at which indices and how many in all or enter 1 to stop playing");
    s=keys.next();
}
    }
   
}
