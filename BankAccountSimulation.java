import java.util.*;

class Account{

    private String accountownername; //this will store name of account holder
    private double balance; //this will store balance
    private ArrayList<String> transactionHistory; //this will store all transaction history

    //now we create constructor
    public Account(String accountownername, double initialBalance){
        this.accountownername = accountownername;
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();

        transactionHistory.add("Your account is created with initial balance of Rs. " + initialBalance);
    }

    //creating method for depositing the money
    public void deposit(double amount){
        if(amount > 0){
            balance = balance + amount; //we update the balance
            transactionHistory.add("Rs. " + amount + " Deposited");
            System.out.println("Rs. " + amount + " Deposited successfully");
        }
        else{
            System.out.println("===Enter valid deposit amount===");
        }
    }

    //creating method to withdraw money
    public void withdraw(double amount){
        if(amount > 0 && amount <=balance){
            balance = balance - amount; //subtract the withdrawal amount from actual balance
            transactionHistory.add("Rs. " + amount + " Withdrawn");
            System.out.println("Rs. " + amount + " Successfully withdrawn");
        }
        else if(amount > balance){
            System.out.println("Insufficient balance");
        }
        else{
            System.out.println("Enter the valid amount");
        }
    }

    // creating method to check balance
    public void checkBalance(){
        System.out.println("Current balance Rs. " + balance);
    }

    //method for showing transaction history
    public void showTransactionHistory(){
        System.out.println("\n ====Transaction History====");

        for(int i=0;i<transactionHistory.size();i++){
            System.out.println((i + 1) + ". " + transactionHistory.get(i));
        }
    }

}

public class BankAccountSimulation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account holder name:");
        String name = sc.nextLine();

        System.out.println("Enter the Initial Balance: ");
        double initialBalance = sc.nextDouble();

        Account account = new Account(name, initialBalance);

        int choice = 0;

        while(choice != 5){
            System.out.println("\n=== BANK ACCOUNT MENU ===");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. View Transaction History");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            if(choice == 1){
                System.out.println("Enter the amount to be deposited: ");
                double depositAmount = sc.nextDouble();
                account.deposit(depositAmount);
            }
            else if(choice == 2){
                System.out.println("Enter the amount to be withdrawn: ");
                double withdrawAmount = sc.nextDouble();
                account.withdraw(withdrawAmount);
            }
            else if(choice == 3){
                account.checkBalance();
            }
            else if(choice == 4){
                account.showTransactionHistory();
            }
            else if(choice == 5){
                System.out.println("Thank you for your visit");
            }
            else{
                System.out.println("Invalid choice! Please try again");
            }
        }

        sc.close();
    }
}








