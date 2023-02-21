
/**
 * Checks if the user entered String is a palindrome.
 * author: Srinivasan
 */
import java.util.Scanner;
public class IsPalindrome
{
    public static void main(String[]args){
        boolean isPalindrome;
        Scanner keys=new Scanner(System.in);
        System.out.println("Enter a string and I will check if it is a palindrome");
        String userString= keys.nextLine();
        while(!userString.equalsIgnoreCase("quit")){
        
        String reverse="";
        for(int i=userString.length()-1;i>=0;i--){
            reverse=reverse+userString.charAt(i);
        }
        System.out.println("The reverse string is :"+reverse);
        if(reverse.equalsIgnoreCase(userString)){
            isPalindrome=true;
            System.out.println("The string you entered is a palindrome");
        }
        else{
            isPalindrome=false;
            System.out.println("The string you entered is not a palindrome");
        }
        System.out.println("Enter a string and I will check if it is a palindrome or enter quit to stop playing");
        userString= keys.nextLine();
    }
    System.out.println("Bye!");
    }
}
