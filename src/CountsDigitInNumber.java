public class CountsDigitInNumber {
    public static void main(String[] Args)
    {
        int N = 1234666;
        methodCount(N);
    }

    public static void methodCount(int N)
    {
        int cnt = (int) (Math.log10(N) + 1);
        System.out.print(cnt);
    }

    }

