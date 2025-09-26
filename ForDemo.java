import java.util.Scanner;

public class ForDemo {
    static Scanner sc = new Scanner(System.in);

    public static void simpleForDemo(int n) {
        System.out.println("\nSimple for loop up to " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    public static void nestedForDemo(int rows, int cols) {
        System.out.println("\nNested for demo: rows = " + rows + ", cols = " + cols);
        for (int r = 1; r <= rows; r++) {
            for (int c = 1; c <= cols; c++) {
                System.out.print((r * c) + "\t");  // dynamic output: product
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void showMenu() {
        System.out.println("==== MENU ====");
        System.out.println("1. Simple for demo");
        System.out.println("2. Nested for demo");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void main(String[] args) {
        while (true) {
            showMenu();
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter n for simple for: ");
                    int n = sc.nextInt();
                    simpleForDemo(n);
                    break;
                case 2:
                    System.out.print("Enter number of rows: ");
                    int rows = sc.nextInt();
                    System.out.print("Enter number of columns: ");
                    int cols = sc.nextInt();
                    nestedForDemo(rows, cols);
                    break;
                case 3:
                    System.out.println("Exiting. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.\n");
                    break;
            }
        }
    }
}
 