
import java.util.Scanner;
//Ned Warutumo J77-10574-2024
public class Discount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double discount;

        // 1. prompt user to enter amount
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter the amount purchased: ");
        double amount = scanner.nextDouble();

         //2. calculate discount
        if (amount > 5000) {
            discount = amount * 0.1;
        } else if (amount >= 1000 && amount <= 5000) {
            discount = 0.05 * amount;
        } else {
            discount = 0;
        }

        double amountToPay = amount - discount;
          
         // 3. Output
        System.out.println("Initial amount: " + amount);
        System.out.println("Discount: " + discount);
        System.out.println("Amount to Pay: " + amountToPay);

        scanner.close();
    }
}