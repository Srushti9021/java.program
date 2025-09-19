import java.util.Scanner;

public class IfPrograms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a program to run:");
        System.out.println("1. Simple if");
        System.out.println("2. Nested if");
        System.out.println("3. If-else");
        System.out.println("4. If-else-if ladder");
        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                // Simple if
                System.out.print("Enter a number: ");
                int number = sc.nextInt();
                if (number > 0) {
                    System.out.println("The number is positive.");
                }
                System.out.println("Simple if program finished.");
                break;

            case 2:
                // Nested if
                System.out.print("Enter your age: ");
                int age = sc.nextInt();
                System.out.print("Do you have an ID card? (true/false): ");
                boolean hasID = sc.nextBoolean();

                if (age >= 18) {
                    if (hasID) {
                        System.out.println("You are allowed to vote.");
                    } else {
                        System.out.println("You must have an ID to vote.");
                    }
                } else {
                    System.out.println("You are under 18 and cannot vote.");
                }
                break;

            case 3:
                // If-else
                System.out.print("Enter your exam marks: ");
                int marks = sc.nextInt();

                if (marks >= 50) {
                    System.out.println("You passed the exam!");
                } else {
                    System.out.println("You failed the exam.");
                }
                break;

            case 4:
                // If-else-if ladder
                System.out.print("Enter your exam marks: ");
                int score = sc.nextInt();

                if (score >= 90) {
                    System.out.println("Grade: A");
                } else if (score >= 75) {
                    System.out.println("Grade: B");
                } else if (score >= 50) {
                    System.out.println("Grade: C");
                } else {
                    System.out.println("Grade: Fail");
                }
                break;

            default:
                System.out.println("Invalid choice! Please run again.");
        }
    }
}
