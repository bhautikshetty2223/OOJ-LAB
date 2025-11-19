import java.util.*;

class Account {
    String customerName;
    String accountNumber;
    String accountType;
    double balance;

    public Account(String customerName, String accountNumber, String accountType, double balance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void displayBalance() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }

    public void computeInterest() {
        System.out.println("No interest applicable for this account type.");
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
            return;
        }

        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

class Sav_acct extends Account {
    private double interestRate = 0.05;

    public Sav_acct(String customerName, String accountNumber, double balance) {
        super(customerName, accountNumber, "Savings", balance);
    }

    public void computeInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest of " + interest + " added. Updated balance: " + balance);
    }
}

class Cur_acct extends Account {
    final double MIN_BALANCE = 1000.0;
    final double PENALTY = 100.0;

    public Cur_acct(String customerName, String accountNumber, double balance) {
        super(customerName, accountNumber, "Current", balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
            return;
        }

        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);

            if (balance < MIN_BALANCE) {
                balance -= PENALTY;
                System.out.println("Balance below minimum. Penalty of " + PENALTY + " imposed.");
            }
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

public class Bank{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = sc.nextLine();

        System.out.print("Enter account number: ");
        String accNo = sc.nextLine();

        System.out.print("Enter account type (savings/current): ");
        String type = sc.nextLine().toLowerCase();

        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        Account acc;

        if (type.equals("savings")) {
            acc = new Sav_acct(name, accNo, balance);
        } else {
            acc = new Cur_acct(name, accNo, balance);
        }

        int choice;
        do {
            System.out.println("\n--- Banking Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Compute Interest");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double dep = sc.nextDouble();
                    acc.deposit(dep);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double wd = sc.nextDouble();
                    acc.withdraw(wd);
                    break;

                case 3:
                    acc.displayBalance();
                    break;

                case 4:
                    acc.computeInterest();
                    break;

                case 0:
                    System.out.println("Thank you for banking with us!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);

        sc.close();
    }
}
