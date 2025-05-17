import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int x = scanner.nextInt();
        System.out.println("Enter second number: ");
        int y = scanner.nextInt();

        System.out.println("Choose an operation:\n" +
                "1. Addition (+)\n" +
                "2. Subtraction (-)\n" +
                "3. Multiplication (*)\n" +
                "4. Division (/)");
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result: " +Calculator.add(x, y));
                break;
            case 2:
                System.out.println("Result: " +Calculator.subtract(x, y));
                break;
            case 3:
                System.out.println("Result: " +Calculator.multiply(x, y));
                break;
            case 4:
                try{
                System.out.println("Result: " +Calculator.divide(x, y));
                }
                catch(ArithmeticException e){
                    System.out.println("Error: " + e.getMessage());
                }
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }
}