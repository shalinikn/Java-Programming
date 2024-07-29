import java.util.Scanner;

public class MinMaxValueInArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] array = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        int minvalue = Integer.MAX_VALUE;
        int maxvalue = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            if (array[i] < minvalue) {
                minvalue = array[i];
            }
            if (array[i] > maxvalue) {
                maxvalue = array[i];

            }

        }
        System.out.println("Min value " + minvalue);
        System.out.println("Max value " + maxvalue);

    }

}

