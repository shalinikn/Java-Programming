public class StringBuilderDeclare {
    public static void main(String args[])
    {
        String sb = "tony";

        StringBuilder sbname = new StringBuilder(sb);

     sbname.insert(1,'k');
     System.out.println(sbname);
     sbname.delete(0,2);
     System.out.println(sbname);
    }
}

/*op
tkony
ony*/

