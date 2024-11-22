public class TwosortedMedianArray {
    public static void TwosortedMedianArray(int num1[], int num2[]){
        int MergeArray[] = new int[num1.length + num2.length];
        int i = 0, j = 0, k = 0;

        // Merging the arrays into MergeArray
        while (i < num1.length && j < num2.length) {
            if (num1[i] <= num2[j]) {
                MergeArray[k++] = num1[i++];
            } else {
                MergeArray[k++] = num2[j++];
            }
        }

        // Copy remaining elements of num1 if any
        while (i < num1.length) {
            MergeArray[k++] = num1[i++];
        }

        // Copy remaining elements of num2 if any
        while (j < num2.length) {
            MergeArray[k++] = num2[j++];
        }

        // Print the merged array (optional)
        for (int val : MergeArray) {
            System.out.print(val + " ");
        }
        System.out.println();

        // Calculate the median
        int start = 0;
        int end = MergeArray.length - 1;
        int mid = start + (end - start) / 2;
        double median;

        if (MergeArray.length % 2 == 0) {
            median = (MergeArray[mid] + MergeArray[mid + 1]) / 2.0;
            System.out.println("The median is: " + median);
        } else {
            System.out.println("The median is: " + MergeArray[mid]);
        }
    }

    public static void main(String[] args) {
        int num1[] = {1, 3, 4, 5};
        int num2[] = {8, 10, 11, 12};
        TwosortedMedianArray(num1, num2);
    }
}

