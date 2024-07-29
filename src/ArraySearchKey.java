import java.util.Scanner;

public class ArraySearchKey {
    public static void main(String[] args){

        int key = 2;
        int arr[]={1,2,2,4,6};

        for(int i=0;i<arr.length;i++)
        {
            if (key == arr[i])
            {
                System.out.println("Index: " + i + ", Value: " + arr[i]);
            }
        }

    }
}

/*
O/P

Index: 1, Value: 2
Index: 2, Value: 2*/
