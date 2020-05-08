
public class JavaArrays {

	public static void main(String[] args) {
		
		// Access the Elements of an Array
		
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		System.out.println(cars[0]);
		  // Outputs Volvo
		
		//Change an Array Element
		
		String[] cars1 = {"Volvo", "BMW", "Ford", "Mazda"};
		cars1[0] = "Opel";
		System.out.println(cars1[0]);
		 // Now outputs Opel instead of Volvo
		
		//Array Length
		
		String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"};
		System.out.println(cars2.length);
		// Outputs 4
		
		//Loop Through an Array
		
		String[] cars3 = {"Volvo", "BMW", "Ford", "Mazda"};
		for (int i = 0; i < cars3.length; i++) {
		  System.out.println(cars3[i]);
		}
		
		//Multidimensional Arrays
		//Access
		
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		int x = myNumbers[1][2];
		System.out.println(x); // Outputs 7
		

	}

}
