import java.util.Scanner;

public class ATM {
    private double balance = 0.0;
    private Scanner scanner = new Scanner(System.in);

    public void displayMenu() {
        while (true) {
            System.out.println("Welcome to the ATM!");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.\n");
            }
        }
    }

    private void checkBalance() {
        System.out.printf("Your current balance is: $%.2f%n", balance);
    }

    private void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = Double.parseDouble(scanner.nextLine());
        if (amount > 0) {
            balance += amount;
            System.out.printf("You have deposited $%.2f%n", amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    private void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = Double.parseDouble(scanner.nextLine());
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("You have withdrawn $%.2f%n", amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.displayMenu();
    }
}
