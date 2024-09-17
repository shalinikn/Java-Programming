public class PrintPattern {
    public static void main(String[] Args)
    {

        int x = 3;
        patternMethod(x);
    }

    public static void patternMethod(int N)
    {
     for(int i =0;i<N;i++)
     {
         for(int j =0;j<N;j++)
         {
             System.out.print("x");
         }
         System.out.println();
     }
    }
}


//O/P
//* * *
//* * *
//* * *
