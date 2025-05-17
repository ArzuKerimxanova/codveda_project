import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();
        BankAccount bankAccount = new BankAccount(name);

        while (true) {
            System.out.println("Please choose an option: \n" +
                    "1.Deposit \n" +
                    "2.Withdraw \n" +
                    "3.Check balance \n" +
                    "4.Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter amount to deposit: ");
                        bankAccount.deposit(sc.nextDouble());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        bankAccount.withdraw(sc.nextDouble());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    bankAccount.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using our banking system. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
}