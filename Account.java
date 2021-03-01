import java.util.Scanner;

public class Account {
    // variables
    int balance;
    int previousTransaction;
    String customerName;
    String customerID;

    // constructor
    Account(String cname, String cid) {
        customerName = cname;
        customerID = cid;
    }

    // function deposit money
    void deposit(int amount) {
        if (amount != 0) {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    // function withdrawing money
    void withdraw(int amount) {
        if (amount != 0) {
            balance = balance - amount;
            previousTransaction = amount;
        }
    }

    // function show previous transaction
    void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposited: " + previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        } else {
            System.out.println("No transaction occured");
        }
    }

    // function main menu
    void showMenu() {
        char option = '\0';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome, " + customerName + "!");
        System.out.println("Your ID is: " + customerID);
        System.out.println();
        System.out.println("What would you like to do?");
        System.out.println();
        System.out.println("1. Check your balance");
        System.out.println("2. Make a desposit");
        System.out.println("3. Make a withdrawal");
        System.out.println("4. View previous transaction");
        System.out.println("5. Exit");

        do {
            System.out.println();
            System.out.println("Enter an option: ");
            char option1 = scanner.next().charAt(0);
            option = option1;
            System.out.println();

            switch (option) {
                case '1':
                    System.out.println("=========================");
                    System.out.println("Balance = $" + balance);
                    System.out.println("=========================");
                    System.out.println();
                    break;
                case '2':
                    System.out.println("Enter an amount to deposit: ");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    System.out.println();
                    break;
                case '3':
                    System.out.println("Enter an amount to withdraw: ");
                    int amount2 = scanner.nextInt();
                    withdraw(amount2);
                    System.out.println();
                    break;
                case '4':
                    System.out.println("=========================");
                    getPreviousTransaction();
                    System.out.println("=========================");
                    System.out.println();
                    break;
                case '5':
                    System.out.println("=========================");
                    break;
                default:
                    System.out.println("Error: invalid option. Please enter 1, 2, 3, 4 or 5.");
                    break;
            }
        } while (option != '5');
        System.out.println("Thank you for banking with us!");
    }

}
