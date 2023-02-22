import java.util.Scanner;
import java.util.ArrayList;

public class Lab4 {
    int accountNumber;
    String accountHolderName;
    double accountBalance;
    ArrayList<String> transactions;
    

    public void initializeCustomer(int accountNumber, String accountHolderName, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
        this.transactions = new ArrayList<String>();
    }

    public void deposit(double amount) {
        accountBalance += amount;
        transactions.add("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (accountBalance >= amount) {
            accountBalance -= amount;
            transactions.add("Withdrawn: " + amount);
            System.out.println("Amount withdrawn successfully!");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void printTransactions() {
        for (String transaction : transactions) {
            System.out.println(transaction);
        }
    }

    public void printAccountSummary() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Balance: " + accountBalance);
    }

    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Lab4 account = new Lab4();
        int accountNumber;
        String accountHolderName;
        double accountBalance;
        
        System.out.println("Welcome to the Bank Account program");
        System.out.println("Please enter the following details :");
        System.out.print("Account Number: ");
        accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Account Holder Name: ");
        accountHolderName = sc.nextLine();
        System.out.print("Account Balance: ");
        accountBalance = sc.nextDouble();
        account.initializeCustomer(accountNumber, accountHolderName, accountBalance);
        
        int choice;
        do{
            System.out.println("Select from the following");
            System.out.println("1. Deposit money");
            System.out.println("2. Withdraw money");
            System.out.println("3. Print transactions");
            System.out.println("4. Account summary");
            System.out.println("5. Exit");
            System.out.println("Please enter your Choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Amount to be Deposited: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    System.out.println("Amount Deposited Successfully");
                    break;
                    case 2:
                    System.out.print("Amount to Withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Transactions:");
                    account.printTransactions();
                    break;
                case 4:
                    System.out.println("Account Summary:");
                    account.printAccountSummary();
                    break;
                case 5:
                    System.out.println("Exit Program...");
                    break;
                default:
                    System.out.println("Invalid Choice, please try again");
                    break;
            }
        } while (choice != 5);
        sc.close();
    }
}  

