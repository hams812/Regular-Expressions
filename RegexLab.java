/*
* Regular Expressions Lab
*/
import java.util.Scanner;
import java.io.*;

public class RegexLab {
  public static void main(String[] args) throws IOException {
    //Do the below 2 lines if you have problem copying and pasting the Scarbble text file in the appropriate folder.
    //However,file path should be your file path. Right Click on file and you will find file path. Include 2 backslashes 
    //keeping in mind escape character.
   //File fileToRead = new File("C:\\Users\\hams8\\Downloads\\Scrabble.txt");  
    //Scanner fileInput = new Scanner(fileToRead);
    
    Scanner fileInput = new Scanner(new File("Scrabble.txt"));
    
    int count = 0;
    int maxLength = 0;
    double sumLength = 0.0;
    String word;
    String longestWord="";
  
    while(fileInput.hasNextLine()){
      word = fileInput.nextLine();
            //TASK 1: Find all words that begin and end with the letter a
      /*String regex = "A.*A";
      if(word.matches(regex)) {
        System.out.println(word);
      }*/

      //TASK 2-Method A: Find all words that are exactly 12 letters long (with .length)
      /*int targetLength = 12;
      if(word.length() == targetLength) {
          System.out.println(word);
      }*/
      
      //TASK 2-Method B: Find all words that are exactly 12 letters long (with a regex)
      /*String regex = "[A-Z]{12}";
      if(word.matches(regex)) {
        System.out.println(word);
      }*/

      //TASK 3: Find all 10-letter words with no repeating letters
      /*String regex = ".*(.)\\1+.*"; //finds all words where one or more characters repeats
      //String regex = ".*(AA|BB|CC|DD|EE|FF|GG|HH|II|JJ|KK|LL|MM|NN|OO|PP|QQ|RR|SS|TT|UU|VV|WW|XX|YY|ZZ).*";
      int targetLength = 10;
      if(word.length() == targetLength && !word.matches(regex)) {
          System.out.println(word);
      }*/
      
      //TASK 4: Words with more than one Z
      /*String regex = ".*Z+.*Z+.*";
      if(word.matches(regex)) {
          System.out.println(word);
      }*/
      
      //TASK 5: Words that end in NYM
      /*String regex = ".*(NYM)";
      if(word.matches(regex)) {
          System.out.println(word);
      }*/
      
      //TASK 6: Words with exactly 4 Cs (changed because no words have 5 Cs)
      /*String regex = "[^C]*C[^C]*C[^C]*C[^C]*C[^C]*";
      if(word.matches(regex)) {
          System.out.println(word);
      }*/

      //TASK 7: Number of words in the English language
      //count++;
      //print statement printed outside while loop
      
      //TASK 8: Number of words that do not contain "ING"
      /*if(word.indexOf("ING") < 0) {
          System.out.println(word);
          //count++;
      }*/
      
      //TASK 9: longest English word from top row of a standard keyboard
      /*String regex = "[QWERTYUIOP]*";
      if(word.matches(regex)) {
          if(word.length() > maxLength) {
              maxLength = word.length();
              longestWord=word;
          }
          
      }*/
      //print statement printed outside while loop
      
      //TASK 10: Trigraph SPB and at least two Rs
      /*String regex = ".*R*(SPB)+R*.*";
      
      if(word.matches(regex)) {
          System.out.println(word);
      }*/
      
      //TASK 11: Start with Q and odd-numbered length
      /*String regex = "Q.*";
      if(word.matches(regex) && word.length() % 2 == 1) {
          System.out.println(word);
      }*/
      
      //TASK 12: Words that start and end with A, E, I, O, or U
      /*String regex = "(A|E|I|O|U).*(A|E|I|O|U)";
      regex = "[AEIOU].*[AEIOU]"; //second way to do it
      if(word.matches(regex)) {
          System.out.println(word);
      }*/

      //TASK 13: Longest word in English language
      /*if(word.length() >= maxLength) {
          maxLength = word.length();
          System.out.println(word);
      }*/
      
      //TASK 14: All two-letter words
      /*if(word.length() == 2) {
          count++;
          System.out.println(word);
      }*/
      
      //TASK 15: Average word length
      /*count++;
      sumLength += word.length();*/
      //print statement printed outside while loop
      
      //TASK 16: Words without vowels (A, E, I, O, U)
      /*String regex = "[^AEIOU]*";
      if(word.matches(regex)) {
          System.out.println(word);
      }*/

      //TASK 17: Four-letter words formed using 2 or fewer different letters, e.g. PEEP
      //Method 1
      /*String regex="[A-Z]{4}";
      if(word.matches(regex)){
          char a= word.charAt(0);
      char b=word.charAt(1);
      char c=word.charAt(2);
      char d=word.charAt(3);
          if(((a==b)&&(b==c)&&(c==d))||((a==b)&&(b==c))||((a==b)&&(b==d))||((a==c)&&(c==d))||((b==c)&&(c==d))||((a==b)&&(c==d))||((a==d)&&(b==c))||((a==c)&&(b==d))){
            System.out.println(word);  
          }
      }*/
      
      //Method 2
      /*String regex1 = "([A-Z])\\1\\1\\1";  //no words match the pattern, 1=1111
      String regex2 = "([A-Z])\\1\\1[A-Z]";  //works for 2=1112
      String regex3 = "([A-Z])\\1([A-Z])\\1";  //no words match the pattern 3=1121
      String regex4 = "([A-Z])([A-Z])\\1\\1";  //works for 4=1211
      String regex5 = "[A-Z]([A-Z])\\1\\1";  //works for 5=2111
      String regex6 = "([A-Z])\\1([A-Z])\\2";  //no words match the pattern 6=1122
      String regex7 = "([A-Z])([A-Z])\\1\\2";  //works for 7=1212
      String regex8 = "([A-Z])([A-Z])\\2\\1";  //works for 8=1221
      if(word.matches(regex1)||word.matches(regex2)||word.matches(regex3)||word.matches(regex4)||word.matches(regex5)||word.matches(regex7)||word.matches(regex8) ) {
          System.out.println(word);
      }*/
      
      //TASK 18: All palindromes in English language
      /*String reversed = new StringBuilder(word).reverse().toString();
      if(reversed.equals(word)) {
          System.out.println(word);
      }*/
      
      //TASK 19: Words with A, E, I, O, U in that order, but not necessarily consecutive
      /*String regex = "[^AEIOU]*A[^AEIOU]*E[^AEIOU]*I[^AEIOU]*O[^AEIOU]*U[^AEIOU]*";
      if(word.matches(regex)) {
          System.out.println(word);
      }*/

      //TASK 20: Words whose letters are in alphabetical order
      /*String regex = "A*B*C*D*E*F*G*H*I*J*K*L*M*N*O*P*Q*R*S*T*U*V*W*X*Y*Z*";
      if(word.matches(regex)) {
          System.out.println(word);
      }*/
      
      //TASK 21: Words containing only vowels with and without Y
      /*String regex = "[AEIOUY]*";
      if(word.matches(regex)) {
          System.out.println(word);
      }*/
    }
    //Task 7
    //System.out.println("Number of words: " + count);
    //Task 9
    //System.out.println("Max length word from top row: " + longestWord);
    //Task 15
    //System.out.println("Average word length: " + (sumLength / count));

    fileInput.close();
  }
}
