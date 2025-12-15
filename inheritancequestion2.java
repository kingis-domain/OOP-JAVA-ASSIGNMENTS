import java.util.Scanner;

class BankAccount {
    double balance = 0;

    void deposit(double amount) {
        balance = balance + amount;
    }
}

class SavingsAccount extends BankAccount {

    void addInterest() {
        balance = balance + (balance * 0.05);
    }
}

public class BankApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SavingsAccount account = new SavingsAccount();

        System.out.print("Enter amount to deposit: ");
        double amount = input.nextDouble();

        account.deposit(amount);
        account.addInterest();

        System.out.println("Final balance: " + account.balance);
    }
}
