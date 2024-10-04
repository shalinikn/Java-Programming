public class GCD {
    public static void main(String[] Args)
    {
        int n1 = 9 ;
        int n2 = 6;
        findgdcd(n1,n2);
        System.out.println(findgdcd(n1,n2));
    }

    public static int findgdcd(int n1, int n2)
    {
        if (n2==0)
        return n1;
        return findgdcd(n2,n1%n2);
    }




}


//GCD = Highest Common Factor
