import java.util.*;

public class SubarrayPrefix {
    public static void subArray(int[] arr) {
        int[] newArr = new int[arr.length];
        
        // Initialize the first element
        newArr[0] = arr[0];
        
        // Compute the prefix sum
        for (int i = 1; i < arr.length; i++) {
            newArr[i] = newArr[i - 1] + arr[i];
        }

        // Print the prefix sum array
        for (int k = 0; k < newArr.length; k++) {
            System.out.print(newArr[k] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};
        subArray(arr);
        System.out.println();
    }
}
