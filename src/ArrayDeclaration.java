import java.util.Scanner;

public class ArrayDeclaration {
    public static void main(String[] args) {
        // Input Array
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        //Object of Array
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Print the elements of the array
        System.out.println("The elements of the array are:");
        for (int i = 0; i < size; i++) {
        }

    }
}
