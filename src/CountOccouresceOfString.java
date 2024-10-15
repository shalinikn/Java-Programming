public class CountOccouresceOfString {

    public static void main(String[] Args)
    {
        String main = "hellohelloworld";
        String sub = "hello";
        System.out.println(occurence(main,sub));
    }

    public static int occurence(String main,String sub)
    {
        int count = 0;
        int index = 0;

        while ((index= main.indexOf(sub,index))!= -1)
        {
            count++;
            index += sub.length();
        }

        return count;
    }
}
