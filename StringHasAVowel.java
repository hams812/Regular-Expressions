
/**
 * This class will find if a user entered String has a vowel.
 */
import java.util.Scanner;
public class StringHasAVowel
{
    
    public static void main(String[] args){
     
    boolean vowel = false;
    Scanner keys= new Scanner(System.in);
    System.out.println("Enter any string to check if it has a vowel in it");
    String s=keys.next();
while(!s.equalsIgnoreCase("1")){
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
            vowel=true;
            i=s.length();  
        }
    }
    if(vowel){
        System.out.println("The string "+s+" has a vowel.");
    }
    else{
        System.out.println("The string "+s+" does not have a vowel.");
        }
    System.out.println("Enter any string to check if it has a vowel in it or enter 1 to stop playing");
    s=keys.next();
}
    }
   
}
