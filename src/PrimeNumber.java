public class PrimeNumber {

    public void primeLogic(int x)
    {

        boolean flag = true;
        if(x==0||x==1)
        {
            System.out.println("Non prime");
        }
        else
        {
            for (int i = 2;i<=Math.sqrt(x);i++)

            {
                if(x %i ==0)
                {
System.out.println("not prime");
break;
                }

            }
        }
    }

    public static void main(String[] args)
    {
        PrimeNumber obj = new PrimeNumber();
        obj.primeLogic(3);
    }
}
