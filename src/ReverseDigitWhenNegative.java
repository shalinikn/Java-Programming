public class ReverseDigitWhenNegative {
    public static void main(String[] args)
    {
        int number = -1233;
        ReverseDigitNegative(number);
    }

    public static void ReverseDigitNegative(int number)
    {
        int rev= 0;
        number = Math.abs(number);
        while (number > 0) {
            int rem = number % 10;
            rev = rev * 10 + rem;
            number = number / 10;
        }
        System.out.print(-rev);
    }
}
