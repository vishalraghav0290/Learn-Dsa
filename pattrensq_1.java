import java.util.Scanner;

public class pattrensq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int numRows = scanner.nextInt();

        printPascalsTriangle(numRows);
    }

    static void printPascalsTriangle(int numRows) {
        for (int i = 0; i < numRows; i++) {
            int number = 1;
            for (int j = 0; j < numRows - i; j++) {
                System.out.print("  "); // Add spaces for a pyramid shape
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("   ");
                System.out.print(number);
                number = number * (i - k) / (k + 1);
            }
            System.out.println();
        }
    }
}
