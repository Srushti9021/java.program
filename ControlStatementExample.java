import java.util.Scanner;

public class ControlStatementExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ----- IF and IF-ELSE -----
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Number is Positive.");
        } else if (num < 0) {
            System.out.println("Number is Negative.");
        } else {
            System.out.println("Number is Zero.");
        }

        // ----- SWITCH CASE -----
        System.out.print("\nEnter a day number (1-7): ");
        int day = sc.nextInt();
        switch (day) {
            case 1: System.out.println("Sunday"); break;
            case 2: System.out.println("Monday"); break;
            case 3: System.out.println("Tuesday"); break;
            case 4: System.out.println("Wednesday"); break;
            case 5: System.out.println("Thursday"); break;
            case 6: System.out.println("Friday"); break;
            case 7: System.out.println("Saturday"); break;
            default: System.out.println("Invalid day!"); 
        }

        // ----- FOR LOOP -----
        System.out.println("\nNumbers 1 to 5 (using for loop):");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }

        // ----- WHILE LOOP -----
        System.out.println("\n\nNumbers 1 to 5 (using while loop):");
        int j = 1;
        while (j <= 5) {
            System.out.print(j + " ");
            j++;
        }

        // ----- DO-WHILE LOOP -----
        System.out.println("\n\nNumbers 1 to 5 (using do...while loop):");
        int k = 1;
        do {
            System.out.print(k + " ");
            k++;
        } while (k <= 5);
    }
}
