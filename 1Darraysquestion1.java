public class OneDArrayExample {
    public static void main(String[] args) {
//Ned Warutumo J77-10574-2024 
        // part a. declaring and initializing 1D array
        int[] numbers = {5, 10, 15, 20, 25};

        int sum = 0;

        // part b. printing of elements using for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            sum = sum + numbers[i]; // add each element to sum
        }

        // part c. display the sum
        System.out.println("Sum of elements: " + sum);
    }
}


