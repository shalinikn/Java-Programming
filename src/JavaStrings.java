
public class JavaStrings {

	public static void main(String[] args) {
		//Find String Length
		
		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(txt.length());

		
	// Example for toUpperCase() and toLowerCase():
		String txt1 = "Hello World";
		System.out.println(txt1.toLowerCase());
		System.out.println(txt1.toUpperCase());
		
	//Find Character in String
		String txt2 = "Hello World";
		System.out.println(txt2.indexOf('l'));
		
	//String Concatenation
		String txt3 = "Hi" ;
		System.out.println(txt2+ txt3);
		System.out.println(txt2.concat(txt3));
	}

}
