import java.util.Scanner;
public class Assignment1sept{
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);

        //prompt user input
        System.out.println("Enter book ID: ");
        String bookID=scanner.nextLine();
       
        System.out.println("Enter due date: ");
        Integer dueDate=scanner.nextInt();

        System.out.println("Enter return date: ");
        Integer returnDate=scanner.nextInt();

        //calculation of days overdue
        Integer daysOverdue=returnDate-dueDate;

        //using if-else statements to determine fine rate
        Integer fineRate=0;
        Integer fineAmount=0;
        
        if(daysOverdue <=0){
            fineRate=0;
            fineAmount=0;
            daysOverdue=0;
        }
        else if(daysOverdue<=7){
            fineRate=20;
            fineAmount=daysOverdue*fineRate;
        }
        else if(daysOverdue>=8 && daysOverdue<=14){
            fineRate=50;
            fineAmount=daysOverdue*fineRate;
        }
        else if(daysOverdue>=15){
            fineRate=100;
            fineAmount=daysOverdue*fineRate;
        }
        

        //display of system
        System.out.println("Book ID: "+bookID);
        System.out.println("Due date: "+dueDate);
        System.out.println("Return date: "+returnDate);
        System.out.println("Days Overdue: "+daysOverdue);
        System.out.println("Fine Rate: Ksh"+fineRate);
        System.out.println("Fine Amount: Ksh"+fineAmount);

        scanner.close();
    }
}