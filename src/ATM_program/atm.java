package ATM_program;

import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        int rauf = 1234;
        int balance1 = 10000;

        System.out.println("\t\t\t Banks ATM program 🏧 ");
        Scanner in = new Scanner(System.in);

        int attempts = 0;

        int pin;
        do {
            System.out.print("Pin: ");
            pin = in.nextInt();

            if (pin != rauf) {
                attempts++;
                System.out.println("Invalid PIN. Attempts remaining: " + (3 - attempts) + "🙂");
            }

        } while (pin != rauf);

        if (attempts >= 3) {
            System.out.println("Card blocked.");
        } else {
            System.out.println("Login successful!");
            int choice;
            do {
                System.out.println("\nChoose an action:");
                System.out.println("1. Check Balance");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("4. Exit");

                System.out.print("Enter your choice: ");
                choice = in.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Your balance is: $" + balance1);
                        break;
                    case 2:
                        withdraw(in, balance1);
                        break;
                    case 3:
                        deposit(in, balance1);
                        break;
                    case 4:
                        System.out.println("Thank you for using the ATM!");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            } while (choice != 4);
        }

        in.close();
    }

    private static void withdraw(Scanner in, int balance) {
        System.out.print("Enter withdrawal amount: ");
        int amount = in.nextInt();

        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    private static void deposit(Scanner in, int balance) {
        System.out.print("Enter deposit amount: ");
        int amount = in.nextInt();

        balance += amount;
        System.out.println("Deposit successful. New balance: $" + balance);
    }
}

