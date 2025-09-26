import java.util.Scanner;

public class DecisionDemo {

    static Scanner sc = new Scanner(System.in);

    public static void demoLoopAndJump(int n) {
        System.out.println("Demo: loop + break / continue, up to n = " + n);
        for (int i = 0; i < n; i++) {
            if (i == 2) {
                System.out.println("  continue at i = " + i);
                continue;
            }
            if (i == 5) {
                System.out.println("  break at i = " + i);
                break;
            }
            System.out.println(" i = " + i);
        }
        System.out.println("Exited loop\n");
    }

    public static void classifyNumber(int x) {
        System.out.println("Classify number: x = " + x);

        // if
        if (x > 0) {
            System.out.println("  (if) x is positive");
        }

        // if-else
        if (x < 0) {
            System.out.println("  (if-else) x is negative");
        } else {
            System.out.println("  (if-else) x is non-negative");
        }

        // nested-if
        if (x != 0) {
            if (x > 0) {
                System.out.println("  (nested-if) x is positive");
            } else {
                System.out.println("  (nested-if) x is negative");
            }
        } else {
            System.out.println("  (nested-if) x is zero");
        }

        // if-else-if chain
        if (x > 0) {
            System.out.println("  (if-else-if) x > 0");
        } else if (x < 0) {
            System.out.println("  (if-else-if) x < 0");
        } else {
            System.out.println("  (if-else-if) x == 0");
        }
        System.out.println();
    }

    public static String dayOfWeek(int day) {
        switch (day) {
            case 1: return "Sunday";
            case 2: return "Monday";
            case 3: return "Tuesday";
            case 4: return "Wednesday";
            case 5: return "Thursday";
            case 6: return "Friday";
            case 7: return "Saturday";
            default: return "Invalid day";
        }
    }

    public static void showMenu() {
        System.out.println("=== MENU ===");
        System.out.println("1. Demo loop with break & continue");
        System.out.println("2. Classify a number (if / if-else / nested / if-else-if)");
        System.out.println("3. Day of week (switch-case)");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void main(String[] args) {
        while (true) {
            showMenu();
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter upper bound n for loop demo: ");
                    int n = sc.nextInt();
                    demoLoopAndJump(n);
                    break;
                case 2:
                    System.out.print("Enter a number to classify: ");
                    int x = sc.nextInt();
                    classifyNumber(x);
                    break;
                case 3:
                    System.out.print("Enter day number (1 to 7): ");
                    int d = sc.nextInt();
                    String day = dayOfWeek(d);
                    System.out.println("  (switch-case) Day " + d + " => " + day);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Exiting menu. Goodbye!");
                    return;  // exit main, end program
                default:
                    System.out.println("Invalid choice. Please try again.\n");
                    break;
            }
        }
    }
}
