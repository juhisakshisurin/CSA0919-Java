
import java.util.Scanner;

class Account {
    String number, name;
    double balance;

    Account(String number, String name, double balance) {
        this.number = number;
        this.name = name;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.printf("New balance: $%.2f%n", balance);
    }

    void withdraw(double amount) {
        balance -= amount;
        System.out.printf("New balance: $%.2f%n", balance);
    }
}

class SavingsAccount extends Account {
    double interestRate;

    SavingsAccount(String n, String name, double b, double rate) {
        super(n, name, b);
        interestRate = rate;
    }

    void display() {
        System.out.printf("1. Savings Account (%s) - %s (Balance: $%.2f, Interest Rate: %.1f%%)%n",
                number, name, balance, interestRate);
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance) {
            super.withdraw(amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}

class CheckingAccount extends Account {
    double overdraftLimit;

    CheckingAccount(String n, String name, double b, double limit) {
        super(n, name, b);
        overdraftLimit = limit;
    }

    void display() {
        System.out.printf("2. Checking Account (%s) - %s (Balance: $%.2f, Overdraft Limit: $%.2f)%n",
                number, name, balance, overdraftLimit);
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            super.withdraw(amount);
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SavingsAccount s = new SavingsAccount(
                "123456789", "Jane Doe", 5000, 1.5);

        CheckingAccount c = new CheckingAccount(
                "987654321", "John Smith", 1000, 1000);

        Account[] accounts = {s, c};

        System.out.println("The accounts in the system are:");
        s.display();
        c.display();

        for (int i = 0; i < 2; i++) {
            System.out.println("Please enter the number of the account you wish to perform a transaction on: " + (i + 1));
            System.out.println("Please enter the transaction type (deposit/withdraw):");
            String type = sc.next();

            System.out.println("Please enter the amount:");
            double amount = sc.nextDouble();

            if (type.equalsIgnoreCase("deposit")) {
                accounts[i].deposit(amount);
            } else if (type.equalsIgnoreCase("withdraw")) {
                accounts[i].withdraw(amount);
            } else {
                System.out.println("Invalid transaction type.");
            }
        }

        sc.close();
    }
}
