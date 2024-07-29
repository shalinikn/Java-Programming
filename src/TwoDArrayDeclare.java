import java.util.Scanner;

public class TwoDArrayDeclare {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();
        int height = input.nextInt();

        int arr[][] = new int[size][height];

        for (int i = 0; i <size; i++) {
            for (int j = 0; j <height; j++) {
                arr[i][j] = input.nextInt();
            }
        }

            for (int i = 0; i <size; i++) {
                for (int j = 0; j <height; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
