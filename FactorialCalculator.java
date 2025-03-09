import java.util.Scanner;

public class FactorialCalculator {
    
    // Method to get a valid non-negative integer from the user
    public static int getNonNegativeInteger() {
        Scanner scanner = new Scanner(System.in);
        int number;
        
        while (true) {
            System.out.print("Enter a non-negative integer: ");
            
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                
                if (number >= 0) {
                    break; // Valid input, exit loop
                } else {
                    System.out.println("Error: Please enter a non-negative integer.");
                }
            } else {
                System.out.println("Error: Invalid input. Please enter a valid integer.");
                scanner.next(); // Clear invalid input
            }
        }
        
        return number;
    }
    
    // Method to calculate the factorial of a given non-negative integer
    public static long calculateFactorial(int n) {
        long factorial = 1;
        
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        
        return factorial;
    }
    
    public static void main(String[] args) {
        int number = getNonNegativeInteger();
        long result = calculateFactorial(number);
        System.out.println("The factorial of " + number + " is: " + result);
    }
}