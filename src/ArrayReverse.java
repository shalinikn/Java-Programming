public class ArrayReverse {

    public static void main(String[] Args){
        ArrayReverse x = new ArrayReverse();
        int[] arr ={1,2,3,4};
        int n = 4;
        int[] output = x.reversearr(arr,n);
        x.print(output,n);

    }

    public int[] reversearr(int[] arr, int n)
    {
        int[] ans = new int[n];
        for(int i=n-1;i>=0;i--)
        {

            ans[n-i-1]=arr[i];
        }
        return ans;
    }

    public void print(int[] output, int n)
    {
        for (int i=0;i<n;i++)
        {
            System.out.print(output[i]);
        }
        System.out.println();
    }

}
