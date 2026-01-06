import java.util.Scanner;
//Ned Warutumo J77-10574-2024
public class LibraryFine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Inputs
        System.out.print("Enter book ID: ");
        String bookID = sc.nextLine();

        System.out.print("Enter due day (as a number): ");
        int dueDay = sc.nextInt();

        System.out.print("Enter return day (as a number): ");
        int returnDay = sc.nextInt();

        // 2. Calculate days overdue
        int daysOverdue = returnDay - dueDay;
        if (daysOverdue < 0) {
            daysOverdue = 0; // no overdue
        }

        // 3. Determine fine rate
        int fineRate;
        if (daysOverdue == 0) {
            fineRate = 0;
        } else if (daysOverdue <= 7) {
            fineRate = 20;
        } else if (daysOverdue <= 14) {
            fineRate = 50;
        } else {
            fineRate = 100;
        }

        // 4. Calculate fine amount
        int fineAmount = daysOverdue * fineRate;

        // 5. Output
        System.out.println("\n--- Library Fine Receipt ---");
        System.out.println("Book ID: " + bookID);
        System.out.println("Due Day: " + dueDay);
        System.out.println("Return Day: " + returnDay);
        System.out.println("Days Overdue: " + daysOverdue);
        System.out.println("Fine Rate: Ksh. " + fineRate);
        System.out.println("Fine Amount: Ksh. " + fineAmount);

        sc.close();
    }
}
