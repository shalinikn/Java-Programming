import java.util.Scanner;

public class ReverseDigit {

    public static void main(String[] Args) {
        int number = 1234;
        reversedigit(number);
    }

    public static void reversedigit(int number) {
        int rev = 0;
            while (number > 0) {
                int rem = number % 10;
                rev = rev * 10 + rem;
                number = number/10;
            }
            System.out.println(rev);

        }
    }

