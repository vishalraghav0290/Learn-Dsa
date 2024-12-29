import java.util.*;
public class Butterfly {
    public static void main(String args[]){
        int n = 4;// i3=2.i2=4.i1=6 2i-1
        for (int i = 1; i <= n; i++) {
            System.out.print("*");

            for (int j = 1; j < i; j++) {
                System.out.print("*");

            }
            for (int j = 1; j <= (2 * (n - i)); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }

            System.out.println();
            
        }
        for (int i = n; i >= 1; i--) {
            System.out.print("*");

            for (int j = 1; j < i; j++) {
                System.out.print("*");

            }
            for (int j = 1; j <= (2 * (n - i)); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }

            System.out.println();
        }    
    }
}

