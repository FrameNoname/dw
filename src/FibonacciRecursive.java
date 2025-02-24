import java.util.Scanner;

public class FibonacciRecursive {
    // Recursive method to calculate Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number: ");
        int number = scanner.nextInt();
        scanner.close();
        
        int result = fibonacci(number);
        System.out.println("Fibonacci result is " + result);
    }
}
