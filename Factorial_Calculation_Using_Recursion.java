import java.util.Scanner;

public class Factorial_Calculation_Using_Recursion {
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1); // Recursive call
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num < 0) {
            throw new IllegalArgumentException("Negative Numbers Not Allowed");
        } else {
            long result = factorial(num);
            System.out.println("The Factorial of " + num + " is: " + result);
        }
        sc.close();
    }
}