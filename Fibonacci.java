import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer number");
        int n=sc.nextInt();
        int first=0, second=1;
        System.out.println("----Fibonacci series----");
        
        for(int i=1;i<=n;i++) {
            System.out.print(first+" ");

            int next =first+second;
            first=second;
            second=next;
        }
        sc.close();
    }
}