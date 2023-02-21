public class Shuffle{
    
    public static String cutTop(String s) {
        int length = s.length();// "Aristotle" length is 9 but index of 'e' is 8
        
        return s.substring(0, length / 2); //9/2 =4, indexes 0,1,2,3 which is Aris
    }

    public static String cutBottom(String s) {
        int length = s.length();

        return s.substring(length / 2, length); //9/2 =4, indexes 4,5,6,7,8 which is totle
    }

    public static String riffle(String a, String b) {
        String shuffled = "";
        for (int i = 0; i <= a.length() - 1; i++) {
            shuffled = shuffled + b.charAt(i);
            shuffled = shuffled + a.charAt(i);
        }
        // tAor tilse for shuffling 1 time
        // ttiA losre for shuffling 2 time
        // ltot sirAe
        // slit roAte
        // rsol Aitte
        // Aristotle for shuffling 6 time
        
        if (shuffled.length() == (a.length() + b.length())) {
            return shuffled;
        } else {
            return shuffled + b.charAt(b.length() - 1);
        }
    }

    public static String shuffle(String s) {
        return riffle(cutTop(s), cutBottom(s));
    }

    public static int countShufflesUntilNormal(String s) {
        String shuffled = shuffle(s);
        int count = 1;
        while (!s.equals(shuffled)) {
            System.out.println(shuffled);
            shuffled = shuffle(shuffled);
            count++;
        }
        System.out.println(shuffled); 
        return count;
    }
}
