import java.util.Scanner;
public class DoWhileAndWhileExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();

        // Using do...while loop
        int sumDoWhile = 0, i = 1;
        do {
            sumDoWhile += i;
            i++;
        } while (i <= n);
        System.out.println("Sum using do...while = " + sumDoWhile);

        // Using while loop
        int sumWhile = 0, j = 1;
        while (j <= n) {
            sumWhile += j;
            j++;
        }
        System.out.println("Sum using while = " + sumWhile);
    }
}

