import java.util.Scanner; // Import Scanner class for user input

public class MinMaxValueInArray { // Declare class
    public static void main(String[] args) { // Main method

        Scanner input = new Scanner(System.in); // Create Scanner object for input
        int size = input.nextInt(); // Read the size of the array from the user
        int[] array = new int[size]; // Declare an array of the given size

        System.out.println("Enter " + size + " elements:"); // Prompt the user to enter array elements
        for (int i = 0; i < size; i++) { // Loop to read array elements
            array[i] = input.nextInt(); // Store each element in the array
        }

        int minvalue = Integer.MAX_VALUE; // Initialize minvalue to the largest possible integer
        int maxvalue = Integer.MIN_VALUE; // Initialize maxvalue to the smallest possible integer

        for (int i = 0; i < size; i++) { // Loop through the array to find min and max values
            if (array[i] < minvalue) { // If current element is smaller than minvalue
                minvalue = array[i]; // Update minvalue
            }
            if (array[i] > maxvalue) { // If current element is larger than maxvalue
                maxvalue = array[i]; // Update maxvalue
            }
        }

        System.out.println("Min value " + minvalue); // Print the minimum value
        System.out.println("Max value " + maxvalue); // Print the maximum value

    }
}
