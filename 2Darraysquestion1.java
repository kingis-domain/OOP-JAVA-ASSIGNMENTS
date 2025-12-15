public class TwoDStudentMarks {
    public static void main(String[] args) {
        
        // declaring and initializing of 2D array with student marks
        int[][] marks = {
            {80, 70, 90},
            {60, 85, 75},
            {88, 92, 79}
        };
        
        // print all marks in matrix form using nested loops
        System.out.println("Marks in matrix form:");
        for (int i = 0; i < marks.length; i++) {          // rows
            for (int j = 0; j < marks[i].length; j++) {    // columns
                System.out.print(marks[i][j] + " ");
            }
            System.out.println(); // new line after each row
        }
        
        // calculate and print average of the first row
        int sumFirstRow = 0;
        for (int j = 0; j < marks[0].length; j++) {
            sumFirstRow += marks[0][j];
        }
        double averageFirstRow = (double) sumFirstRow / marks[0].length;
        System.out.println("Average mark of the first row: " + averageFirstRow);
    }
}
