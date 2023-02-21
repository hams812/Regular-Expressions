import java.util.*;
import java.io.*;
public class EqualsVersusRegex {
  public static void main(String[] args) throws IOException {
    long start = System.currentTimeMillis();
    
        Scanner scrabbleFile = new Scanner(new File("SCRABBLE.txt"));
        
        int sumOfScores = 0;
        int totalWords = 0;
        int numPal = 0;
    
        int maxScore2 = 0, maxScore3 = 0, maxScore4 = 0;
        int maxScore5 = 0, maxScore8 = 0, maxScore9 = 0, maxScore10 = 0;
        int minScore6 = 1000;
        
        String maxWord2 = "", maxWord3 = "", maxWord4 = "";
        String maxWord5 = "", maxWord8 = "", maxWord9 = "", maxWord10 = "";
        String minWord6 = "";
        
        //Iterates through all the words in the file and perform all the tasks for 
        //each word rather than having each task iterate through the file
        //which would take longer, though it requires more variables
        while(scrabbleFile.hasNextLine()) {
            String word = scrabbleFile.nextLine();
            int wordScore = Scrabble.scoreWord(word);//finds the score of the 1st word
            //int wordScore = Scrabble.scoreWordRegex(word);
            
            //ITEM 1: Average score of all words
            sumOfScores += wordScore;
            totalWords++;
            
            //ITEM 2: Highest scoring word
            if(wordScore > maxScore2) {
                maxScore2 = wordScore;
                maxWord2 = word;
            }
            
            //ITEM 3: Highest scoring word without a Z or Q
            if(word.matches("[^ZQ]*")) {
                if(wordScore > maxScore3) {
                    maxScore3 = wordScore;
                    maxWord3 = word;
                }
            }
            
            //ITEM 4: Highest wordScore word with SCRAB
            if(word.indexOf("SCRAB") > 0) {
                if(wordScore > maxScore4) {
                    maxScore4 = wordScore;
                    maxWord4 = word;
                }
            }
            
            //ITEM 5: Highest wordScore word with one-point letters
            if(word.matches("[AEIOURSTLN]*")) {
                if(wordScore > maxScore5) {
                    maxScore5 = wordScore;
                    maxWord5 = word;
                }
            }
            
            //ITEM 6: Lowest scoring word with two or more Xs
            if(word.matches("[^X]*[X]+[^X]*[X]+[^X]*")) {
                if(wordScore < minScore6) {
                    minScore6 = wordScore;
                    minWord6 = word;
                }
            }
            
            //ITEM 7: Number of palindromes
            if(Scrabble.isPalindrome(word)) {
                numPal++;
                //TASK 8: Highest scoring palindrome
                if(wordScore >= maxScore8) {
                    maxScore8 = wordScore;
                    maxWord8 = word;
                }
            }
            
            //ITEM 9: Highest scoring word with letters in alphabetical order
            if(word.matches("(A?B?C?D?E?F?G?H?I?J?K?L?M?N?O?P?Q?R?S?T?U?V?W?X?Y?Z?)")) {
                if(wordScore > maxScore9) {
                    maxScore9 = wordScore;
                    maxWord9 = word;
                }
            }
            
            //ITEM 10: Highest scoring word with Q but no U
            if(word.indexOf("Q") > 0 && word.indexOf("U") < 0) {
                if(wordScore > maxScore10) {
                    maxScore10 = wordScore;
                    maxWord10 = word;
                }
            }
        }
        
        //Output the results
        System.out.println("Item\tWord\t\tScore\tDescription");
        System.out.println("1.\tN/A\t\t" + String.format("%.1f",sumOfScores * 1.0 / totalWords) + "\tAverage word score"); //gives answer to one decimal place
        System.out.println("2.\t" + maxWord2 + "\t" + maxScore2 + "\tHighest scoring word");
        System.out.println("3.\t" + maxWord3 + "\t" + maxScore3 + "\tHighest scoring word without Z, Q");
        System.out.println("4.\t" + maxWord4 + "\t" + maxScore4 +  "\tHighest scoring word with SCRAB");
        System.out.println("5.\t" + maxWord5 + "\t" + maxScore5 +  "\tHighest scoring word with one-pointers");
        System.out.println("6.\t" + minWord6 + "\t\t" + minScore6 +  "\tLowest scoring word with 2 or more Xs");
        System.out.println("7.\tN/A\t\t" + numPal + "\tNumber of palindromes");
        System.out.println("8.\t" + maxWord8 + "\t\t" + maxScore8 +  "\tHighest scoring palindrome");
        System.out.println("9.\t" + maxWord9 + "\t\t" + maxScore9 +  "\tHighest scoring alphabetical");
        System.out.println("10.\t" + maxWord10 + "\t" + maxScore10 +  "\tHighest scoring word with Q, no U");
        
        scrabbleFile.close();
    
    long elapsed = System.currentTimeMillis() - start;
    System.out.println("Elapsed time: " + elapsed + " ms");
  }
}

