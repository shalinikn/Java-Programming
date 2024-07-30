public class StringConcatination {
    public static void main(String args[]){
        String x = "tony";
        String y = "stark";
        String z = x+" "+y;
        System.out.println(z);
        System.out.println(z.length());

        for(int i =0;i<z.length();i++)
        {
            System.out.println(z.charAt(i));
        }
    }
}
