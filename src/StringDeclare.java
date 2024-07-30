import java.util.Scanner;

public class StringDeclare {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Input String");
        String textinput = input.nextLine();
        System.out.println("Output text is " + textinput);
    }
}