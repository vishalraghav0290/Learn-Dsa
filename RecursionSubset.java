public class RecursionSubset{

    // Function to generate all subsets of the array
    public static void generateSubsets(int[] arr) {
        int n = arr.length;
        int totalSubsets = (int) Math.pow(2, n); // Calculate total number of subsets

        // Iterate over the possible number of subsets
        for (int i = 0; i < totalSubsets; i++) {
            System.out.print("{ ");
            for (int j = 0; j < n; j++) {
                // Check if j-th element should be included in i-th subset
                if (isElementInSubset(i, j)) {
                    System.out.print(arr[j] + " ");
                }
            }
            System.out.println("}");
        }
    }

    // Helper function to determine if an element should be in the subset
    // without using bitwise operators
    private static boolean isElementInSubset(int subsetIndex, int elementIndex) {
        // Convert subsetIndex to binary-like decision using division and modulus
        for (int i = 0; i <= elementIndex; i++) {
            if (subsetIndex % 2 == 1 && i == elementIndex) {
                return true;
            }
            subsetIndex /= 2;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        generateSubsets(arr);
    }
}
