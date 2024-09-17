public class PrintPattern2 {


    public static void main(String[] Args)
    {

        PrintPattern2 obj = new PrintPattern2();
        obj.patternmethod(3);
    }
    public void patternmethod(int X)
    {
        for(int i=0;i<X; i++)
        {
            for (int j=0;j<=i;j++)
            {
                System.out.print("x");
            }
            System.out.println();
        }
    }
}



//Result
//*
// * *
//* * *