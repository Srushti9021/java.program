// Java Program to Swap Two Values Using a Third Variable (Temporary Variable)

// Importing necessary libraries
import java.util.Scanner;

class SwapDemo {

    // Function to swap two numbers using a temporary variable
    static void swapValuesUsingThirdVariable(int m, int n) {
        // Swapping the values
        int temp = m;
        m = n;
        n = temp;
        System.out.println("After Swap: Value of m = " + m + ", Value of n = " + n);
    }

    // Main driver code
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompting user for input
        System.out.print("Enter the value of m: ");
        int m = sc.nextInt();
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        // Displaying values before swap
        System.out.println("Before Swap: Value of m = " + m + ", Value of n = " + n);

        // Calling the function to swap the numbers
        swapValuesUsingThirdVariable(m, n);

        // Closing the scanner object
        sc.close();
    }
}
