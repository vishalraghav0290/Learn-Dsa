public class DuplicateCharString {
    public static void removeDuplicates(String str, int index, StringBuilder newStr, boolean[] seen) {
        if (index == str.length() - 1) {
            System.out.println(newStr);
            return;
        }

        char current = str.charAt(index);
        if (!seen[current - 'a']) {
            newStr.append(current);
            seen[current - 'a'] = true;
        }
        removeDuplicates(str, index + 1, newStr, seen);
    }

    public static void main(String[] args) {
        String str = "Maggie";
        StringBuilder newStr = new StringBuilder();
        boolean[] seen = new boolean[26];
        removeDuplicates(str, 0, newStr, seen);
        System.out.println();
    }
}