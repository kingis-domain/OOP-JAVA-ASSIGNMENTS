import java.util.Scanner;
//Ned Warutumo J77-10574-2024
public class FitnessApp {

    // we first determine fitness level
    static String getFitnessLevel(int steps) {
        if (steps >= 10000) {
            return "Excellent";
        } else if (steps >= 7000) {
            return "Good";
        } else if (steps >= 4000) {
            return "Average";
        } else {
            return "Poor";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your steps for today: ");
        int steps = input.nextInt();

        String level = getFitnessLevel(steps);

        System.out.println("Your fitness level: " + level);
    }
}
