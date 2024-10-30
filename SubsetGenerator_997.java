public class SubsetGenerator {

    public static void generateSubsets(int[] arr) {
        generateSubsetsRecursive(arr, 0, new int[arr.length], 0);
    }

    // Recursive function to generate subsets
    private static void generateSubsetsRecursive(int[] arr, int currentIndex, int[] subset, int subsetSize) {
        if (currentIndex == arr.length) {
            // Base case: when all elements have been considered, print the subset
            System.out.print("{ ");
            for (int i = 0; i < subsetSize; i++) {
                System.out.print(subset[i] + " ");
            }
            System.out.println("}");
            return;
        }
    // Function to start the recursive generation of subsets

        // Recursive case 1: Exclude the current element and move to the next
        generateSubsetsRecursive(arr, currentIndex + 1, subset, subsetSize);

        // Recursive case 2: Include the current element in the subset and move to the next
        subset[subsetSize] = arr[currentIndex];
        generateSubsetsRecursive(arr, currentIndex + 1, subset, subsetSize + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        generateSubsets(arr);
    }
}
