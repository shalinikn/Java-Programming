import java.util.*;
import java.lang.*;
import java.io.*;

class AnagramChecker
{
    public static void main (String[] args) throws java.lang.Exception
    {
        String x = "listen";
        String x2 = "silent";

        if (anagramchecker(x, x2)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

    }

    public static boolean anagramchecker (String x , String x2)
    {
        char[] array1 = x.toCharArray();
        char[] array2 = x2.toCharArray();
        Arrays.sort(array1);

        Arrays.sort(array2);
        return Arrays.equals(array1, array2);


    }
}

