public class LongestSubstring {

    public static void LongestSubstring(StringBuilder str) {
        int Actualvalue;

        for (int i = 0; i < str.length(); i++) {
            for (Actualvalue = i + 1; Actualvalue < str.length(); Actualvalue++) {
                if (str.charAt(i) == str.charAt(Actualvalue) && 
                    (Actualvalue + 1 == str.length() || str.charAt(Actualvalue) != str.charAt(Actualvalue + 1))) {
                    System.out.println("Length of substring without repeating character is: " + (Actualvalue - i));
                    break;
                } else if (Actualvalue + 1 < str.length() && str.charAt(Actualvalue) == str.charAt(Actualvalue + 1)) {
                    System.out.println("Length of repeating characters is: " + (Actualvalue - i));
                    break;
                }
            }
        }
    }

    public static void main(String args[]) {
        StringBuilder str = new StringBuilder("abcabbca");

        LongestSubstring(str);
    }
}
