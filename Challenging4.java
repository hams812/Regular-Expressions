public class Challenging4
{
    
    //6. This method tells if the character input is a vowel or not
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
     }

    public static int countVowels(String s) {
        int count = 0;
        for (int i = 0; i <= (s.length() - 1); i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static int countWords(String s) {
        s = s.trim();
        int words = 1;
        for (int i = 0; i <= (s.length() - 1); i++) {
            if (s.charAt(i) == ' ') {
                words++;
            }
        }
        return words;
    }

    public static boolean isSumptuous(String quotation) {
        double length = quotation.length(); //cast to double for division
        double vowels = countVowels(quotation);
        System.out.println(vowels);
        System.out.println(length);
        System.out.println(vowels / length);
        if (countWords(quotation) <= 1) {
            return false;
        } else {
            return ((vowels / length) >= 0.4);
        }
    }
    
    //7.
    public static boolean hasOnlyVowels(String s) {
        for (int i = 0; i <= s.length() - 1; i++) {
            if (!isVowel(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean hasOnlyConsonants(String s) {
        for (int i = 0; i <= s.length() - 1; i++) {
            if (isVowel(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean hasAlternatingVC(String s) {
        String oddChars = "";
        String evenChars = "";
        for (int i = 0; i < s.length(); i+=2) {
                evenChars = evenChars + s.charAt(i);
            } 
        for (int i = 1; i < s.length(); i+=2) {
                oddChars = oddChars + s.charAt(i);
            } 
            if (hasOnlyConsonants(oddChars) && hasOnlyVowels(evenChars)) {
            return true;
        } else if (hasOnlyConsonants(evenChars) && hasOnlyVowels(oddChars)) {
            return true;
        } else {
            return false;
        }
        }
        
    

    public static boolean isAwesome(String s) {
        /*boolean hasStartingVowel = isVowel(s.charAt(0));
        boolean hasEndingVowel = isVowel(s.charAt(s.length() - 1));
        boolean hasConsonant = !hasOnlyVowels(s);
        return (hasStartingVowel && hasEndingVowel && hasConsonant && 
            hasAlternatingVC(s));*/
            if((isVowel(s.charAt(0))) && (isVowel(s.charAt(s.length()-1)) && (hasAlternatingVC(s)))){
                return true;
            }
            return false;
    }

    public static boolean isSuper(String s) {
        /*boolean hasStartingCons = !isVowel(s.charAt(0));
        boolean hasEndingCons = !isVowel(s.charAt(s.length() - 1));
        boolean hasVowel = !hasOnlyConsonants(s);
        return (hasStartingCons && hasEndingCons && hasVowel && 
            hasAlternatingVC(s));*/
            if((!isVowel(s.charAt(0))) && (!isVowel(s.charAt(s.length()-1)) && (hasAlternatingVC(s)))){
                return true;
            }
            return false;
    }

    public static String classifyWord(String s) {
        if (isAwesome(s)) {
            return "awesome";
        } else if (isSuper(s)) {
            return "super";
        } else {
            return "mundane";
        }
    }
    
    //8.
     public static int getDigitValue(char d) {
        if (d == 'I') {
            return 1;
        } else if (d == 'V') {
            return 5;
        } else if (d == 'X') {
            return 10;
        } else {
            return 0;
        }
    }

    public static int getRDSValue(String rds) {
        int total = 0;
        for (int i = 0; i <= rds.length() - 1; i++) {
            total += getDigitValue(rds.charAt(i));
        }
        return total;
    }
    public static String toProperRDS(int n) {
        String rds = "";
        while (n >= 10) {
            n -= 10;
            rds = rds + "X";
        }

        if (n >= 5) {
            n -= 5;
            rds = rds + "V";
        }

        for (int i = n; i > 0; i--) {
            rds = rds + "I";
        }
        return rds;
    }

    public static String convertToProperRDS(String rds) {
        return toProperRDS(getRDSValue(rds));
    }
    
    //9.
    public static boolean isTriangular(int n) { //if you give a num as an input, it will tell if it is triangular or not
        int i = 1;
        while (n > 0) {
            n -= i; //n=n-i
            i++;
        }
        return (n == 0);
    }
    
    public static int getTriangular(int n) { //This method gives the nth triangular num. For ex 4th traingular num is 10
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }
    
    public static void print10TriangularRDS() {
        int count = 0;
        int n = 1;
        while (count < 10) {
            int tri = getTriangular(n); //gets the triangular numbers(1,3,6,10...) in order from the series, here itself the value is also checked to be triangular
            String rds = toProperRDS(tri); // converts that number to string
            
            if (isTriangular(rds.length())) { //checks if that string's length is triangular
                count++; //they want only the 1st 10 such numbers
                System.out.println(count + ": " + rds+ ": "+tri);
            }
            
            n++;
        }
    }
    
}

