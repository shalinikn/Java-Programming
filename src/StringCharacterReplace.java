public class StringCharacterReplace {
    public static void main(String args[])
    {
        StringBuilder input = new StringBuilder("Hello");

        for(int i=0;i<input.length()/2 ;i++ )
        {
            int front =i;
            int back = input.length()-1-i;

            char frontch = input.charAt(front);
            char backch = input.charAt(back);

            input.setCharAt(front,backch);
            input.setCharAt(back,frontch);
        }
        System.out.println(input);

    }
}
