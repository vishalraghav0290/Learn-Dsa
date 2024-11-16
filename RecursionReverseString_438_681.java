public class RecursionReverseString {

    public static void reverse(StringBuilder str, int start, int end) {
        if (start >= end) {
            return;
        }
        
        // Swap characters at start and end indices
        char temp = str.charAt(start);
        str.setCharAt(start, str.charAt(end));
        str.setCharAt(end, temp);
        
        // Recursive call with updated indices
        reverse(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Mightyraju");
        reverse(str, 0, str.length() - 1); 
        System.out.println(str); 
    }
}
