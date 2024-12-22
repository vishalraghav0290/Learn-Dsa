public class LongestCommonPrefix {

    public static String findLongestCommonPrefix(String[] arr) {
        if (arr == null || arr.length == 0) {
            return ""; // Return empty string if array is empty or null
        }

        String prefix = arr[0]; // Take the first string as the reference

        for (int i = 1; i < arr.length; i++) {
            while (arr[i].indexOf(prefix) != 0) {
                // Reduce the prefix length by one
                prefix = prefix.substring(0, prefix.length() - 1);
                
                if (prefix.isEmpty()) {
                    return ""; // No common prefix
                }
            }
        }

        return prefix; // The longest common prefix
    }

    public static void main(String[] args) {
        String[] arr = { "flower", "flow", "flight" };
        String longestCommonPrefix = findLongestCommonPrefix(arr);
        System.out.println("Longest Common Prefix: " + longestCommonPrefix);
    }
}
