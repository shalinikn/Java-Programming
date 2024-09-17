public class PrintPattern3 {


    public static void main(String[] Args)
    {

        PrintPattern3 obj = new PrintPattern3();
        obj.patternmethod(5);
    }
    public void patternmethod(int X)
    {
        for(int i=0;i<=X; i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(j+"");
            }
            System.out.println();
        }
    }
}

//O/p
/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5*/
