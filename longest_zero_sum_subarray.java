// Given an array of integers, find the length of the longest subarray with sum equal to zero.
public class longest_zero_sum_subarray {
    public static int a(int[] b) {
        int c = 0;
        for (int d = 0; d < b.length; d++) {
            int e = 0;
            for (int f = d; f < b.length; f++) {
                e += b[f];
                if (e == 0 && f - d + 1 > c) {
                    c = f - d + 1;
                }
            }
        }
        return c;
    }
}