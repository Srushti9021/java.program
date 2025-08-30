import java.util.Scanner; 
 
public class Calculator { 
 
    private double num1, num2; 
 
    // Methods for operations 
    private double add(double a, double b) { 
        return a + b; 
    } 
 
    private double subtract(double a, double b) { 
        return a - b; 
    } 
 
    private double multiply(double a, double b) { 
        return a * b; 
    } 
 
    private double divide(double a, double b) { 
        if (b == 0) { 
            System.out.println("Error: Division by zero is not allowed."); 
            return 0; 
        } 
        return a / b; 
    } 
 
    // Perform calculation 
    public void calculate() { 
        Scanner sc = new Scanner(System.in); 
        try { 
            System.out.print("Enter first number: "); 
            num1 = sc.nextDouble(); 
 
            System.out.print("Enter second number: "); 
            num2 = sc.nextDouble(); 
 
            System.out.print("Enter operator (+, -, *, /): "); 
            char op = sc.next().charAt(0); 
 
            double result = 0; 
            switch (op) { 
                case '+': 
                    result = add(num1, num2); 
                    break; 
                case '-': 
                    result = subtract(num1, num2); 
                    break; 
                case '*': 
                    result = multiply(num1, num2); 
                    break; 
                case '/': 
                    result = divide(num1, num2); 
                    break; 
                default: 
                    System.out.println("Invalid operator! Please use +, -, * or /."); 
                    return; 
            } 
 
            System.out.println("Result: " + result); 
 
        } catch (Exception e) { 
            System.out.println("Invalid input! Please enter numeric values."); 
        } 
    } 
 
    // Main Method 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        boolean cont = true; 
 
        while (cont) { 
            Calculator calc = new Calculator(); 
            calc.calculate(); 
 
            System.out.print("Do you want to perform another calculation? (yes/no): "); 
            String ans = sc.next().toLowerCase(); 
 
            if (ans.equals("yes")) { 
                cont = true; 
            } else { 
                cont = false; 
                System.out.println("Goodbye!"); 
            } 
        } 
 
        sc.close(); 
    } 
} 
Output : -