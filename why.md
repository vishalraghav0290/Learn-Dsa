# RECAP   FOR JAVA CLASSES AND SOME OTHER TERM STUFF

```
1. WHAT ARE SCANNER CLASS AND WHY WE USED IT IN JAVA?
2. ANS: The Scanner class in Java is a part of the java.util package and is used for parsing primitive types and strings
3. using regular expressions.
4.  It provides a simple and convenient way to read input from various sources like the keyboard, files, or strings.
5.      THE ERROR ITS GENARLY THROW IS  : InputMismatchException, NoSuchElementException, and IllegalStateException
6.  ```




### DECODING A BOILER PLATE CODE OF JAVA WHAT AND WHY STAND FOR IN CODE



//  used to  Import necessary packages  '*' stand for all 
import java.util.*;

public class Code {
    // Main method: entry point of the Java application
    public static void main(String[] args) {
        // Creating a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Example: Reading input from the user
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        // Example: Reading an integer from the user
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Displaying the input back to the user
        System.out.println("Hello, " + name + ". You are " + age + " years old.");

       
    }
}
