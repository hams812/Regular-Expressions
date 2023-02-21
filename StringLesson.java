public class StringLesson {
    public static void main(String[] args) {
        String pre = "We The People of the United States";
        
        int len = pre.length();
        System.out.println("Length: " + pre.length());
        //System.out.println("Length: " + len);
        
        System.out.println("First:" + pre.charAt(0));
        System.out.println("Last: " + pre.charAt(pre.length() - 1));
        System.out.println("10th: " + pre.charAt(9));
        
        System.out.println(pre.substring(0, 13));
        String one = pre.substring(pre.indexOf("United"), pre.indexOf("United") + 6);
        //String one = preamble.substring(21, 27); or use this
        System.out.println(one);
        System.out.println("In lower case: "+pre.toLowerCase());
        System.out.println("In upper case: "+pre.toUpperCase());
        System.out.println(one+ " and \"united\": "+one.equals("united"));
        System.out.println(one+ " and \"United\": "+one.equals("United"));
        System.out.println(one+ " and \"UNITED\": "+one.equals("UNITED"));
        System.out.println("First occurrence of 'o' is at index "+pre.indexOf('o'));
        System.out.println("First occurrence of 'it' is at index "+pre.indexOf("it"));
        
        for(int i=pre.length()-1;i>=0;i--){
            System.out.print(pre.charAt(i));
        }
    }
}