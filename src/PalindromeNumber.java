public class PalindromeNumber {
    public static void main(String[] Args)
    {
        int number = 556;
        boolean isplaindrome =palindrome(number);
        if(isplaindrome)
        {
            System.out.print("Is palindrome");

        }
        else
        {
            System.out.print("not palindrome");
        }


    }

    public static boolean palindrome(int n) {
        int rev = 0;
        int org = n;
        while (n > 0) {
            int temp = n % 10;
            rev = temp + rev * 10;
            n = n / 10;
        }
        return rev == org;
    }

}
