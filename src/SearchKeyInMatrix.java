import java.util.Scanner;

public class SearchKeyInMatrix {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int key = input.nextInt();
        int row = input.nextInt();
        int col = input.nextInt();

        //Declare obj of array

        int arr[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                arr[i][j] = input.nextInt();

            }
        }


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if (key==arr[i][j]){

                    System.out.println("Key " + key + " found at position (" + i + ", " + j + ")");
                }

            }
        }



    }
}
