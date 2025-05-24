import java.util.Scanner;

public class Factorial {
    public static long factorial(int n){
        if(n<0){
            throw new IllegalArgumentException("n must be positive");
        }
        else if(n==0|| n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        try {
            System.out.println("Factorial of " + n + " is: " + factorial(n));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();

    }}
