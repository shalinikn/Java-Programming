
public class ConditionalStatements {

	public static void main(String[] args) {
		// if statement
		
		if(20>18)
		{
			System.out.println("20 is greater");
		}
		
		//if else statement
		
		if(20==18)
		{
			System.out.println("20 is equal to 18");
	    }
		
		else
		{
			System.out.println("20 is not equal to 18");	
		}
		
		//variable = (condition) ? expressionTrue :  expressionFalse;
		
		String result=(20>18)? "True":"False";
		System.out.println(result);

	}}
