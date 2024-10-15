public class SubString {

    public static void main(String[] Args)
    {
        String main = "Hello world";
        String sub = "Hello55";
        System.out.println(checksub(main,sub));

    }

    public  static boolean checksub(String main,String sub)
    {
        return main.contains(sub);
    }
}
